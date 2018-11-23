/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joindb;



import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import joindb.jooq.proposta.routines.Getinfocodimovel;
import static joindb.jooq.proposta.tables.Propriedade.PROPRIEDADE;
import static joindb.jooq.proposta.tables.PropriedadeInformacao.PROPRIEDADE_INFORMACAO;
import joindb.jooq.proposta.tables.records.PropriedadeInformacaoRecord;
import joindb.jooq.proposta.tables.records.PropriedadeRecord;
import static joindb.jooq.public_.tables.AreaImovelJuntos.AREA_IMOVEL_JUNTOS;
import org.jooq.Cursor;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.postgis.Geometry;
import org.postgresql.util.PGobject;

/**
 *
 * @author Danilo2
 */
class JoinDatabases {

    public JoinDatabases() {
    }
    
    public void loadPropriedades() throws SQLException {
        DatabaseManager databaseManager = new DatabaseManager();
        String limit = " LIMIT 100";
        Connection connection = databaseManager.startConnection();
        DSLContext create = DSL.using(connection, SQLDialect.POSTGRES_10);
        //#Danilo implementar as verificações aqui em cima. (Campo observações da documentacao)
        
        //Não repete por COD_IMOVEL pois a geometria é sempre igual.
        Cursor<Record> imovelCursor = create.fetchLazy(
                "SELECT distinct on (imovel.cod_imovel) *\n"
                + "FROM public.area_imovel_juntos as imovel,\n"
                + "proposta.getInfoCodImovel(imovel.cod_imovel) as info" + limit);
        while (imovelCursor.hasNext()) {
            Record imovelRecord = imovelCursor.fetchNext();
            PropriedadeRecord propriedadeRecord = create.newRecord(PROPRIEDADE);
//            propriedadeRecord.setAbatedouro();
            propriedadeRecord.setArea(imovelRecord.getValue(AREA_IMOVEL_JUNTOS.NUM_AREA));
            propriedadeRecord.setData(new Date(2018, 0, 0));
            
            Integer estadoId = EstadoMunicipioInformation.getEstadoId(
                    imovelRecord.getValue(SqlHelper.getFieldFromParameter(
                    Getinfocodimovel.SIGLAESTADO, "info")));
            propriedadeRecord.setEstadoId(estadoId);
            Geometry value = imovelRecord.getValue(AREA_IMOVEL_JUNTOS.GEOM);
            propriedadeRecord.setGeom(value);
            Integer municipioId = EstadoMunicipioInformation.getMunicipioId(
                    imovelRecord.getValue(SqlHelper.getFieldFromParameter(
                    Getinfocodimovel.GEOCODIGOMUNICIPIO, "info")));
            propriedadeRecord.setMunicipioId(municipioId);
            if (propriedadeRecord.insert() == 0) {
                System.out.println("Nao consegui inserir: " + propriedadeRecord.toString());
                continue;
            }
            
            PropriedadeInformacaoRecord pInformacaoRecord = create.newRecord(PROPRIEDADE_INFORMACAO);
            pInformacaoRecord.setCodigoImovel(imovelRecord.getValue(AREA_IMOVEL_JUNTOS.COD_IMOVEL));
            pInformacaoRecord.setPropriedadeId(propriedadeRecord.getId());
            pInformacaoRecord.setArea(imovelRecord.getValue(AREA_IMOVEL_JUNTOS.NUM_AREA));
            pInformacaoRecord.setModuloCount(imovelRecord.getValue(AREA_IMOVEL_JUNTOS.NUM_MODULO));
            pInformacaoRecord.setMunicipioId(municipioId);
            pInformacaoRecord.setEstadoId(estadoId);
            
            pInformacaoRecord.insert(); //Nao tem problema ja ter sido adicionado.
        }
    }
    
    public void getAllGtaInformation() throws SQLException {
        
//        Cursor<Record> gtaCursor = create.fetchLazy(
//                "SELECT * FROM gta.mt_transactions2,\n"
//                + " proposta.getAnimalIdade(faixa_sexo_quant, nm_especie) as animalAge,\n"
//                + " proposta.getInfoCodImovel(buyercar) as infoFrom,\n"
//                + " proposta.getCpfCnpjValidity(cpf_cnpj_origem) as cpfInfo " + limit);
//        
//        EstadoMunicipioInformation.createDB();
//        
//        while (gtaCursor.hasNext()) {
//            Record gtaRow = gtaCursor.fetchNext();
//            PropriedadeRecord propriedadeRecord = new PropriedadeRecord();
////            propriedadeRecord.setAbatedouro();
////            propriedadeRecord.setArea();
//            propriedadeRecord.setData(new Date(2018, 0, 0));
//            String estadoSigla = gtaRow.getValue(
//                    SqlHelper.getFieldFromParameter(Getinfocodimovel.SIGLAESTADO, "infoFrom"));
//            propriedadeRecord.setEstadoId(EstadoMunicipioInformation.getEstadoId(estadoSigla));
//            Integer municipioGeocodigo = gtaRow.getValue(
//                    SqlHelper.getFieldFromParameter(Getinfocodimovel.GEOCODIGOMUNICIPIO, "infoFrom"));
//            propriedadeRecord.setMunicipioId(EstadoMunicipioInformation.getMunicipioId(municipioGeocodigo));
//            propriedadeRecord.setGeom(gtaRow.getValue(MT_TRANSACTIONS2.));
//            propriedadeRecord.insert();
//            PropriedadeInformacaoRecord pInformacaoRecord = new PropriedadeInformacaoRecord();
//            pInformacaoRecord.setArea(BigDecimal.ONE);
//            
//            
//            
//            
////            String faixaSexoQnt = gtaRow.getValue(MT_TRANSACTIONS2.FAIXA_SEXO_QUANT);
////            String especie = gtaRow.getValue(MT_TRANSACTIONS2.NM_ESPECIE);
////            Integer isCpfCnpj = gtaRow.getValue(
////                    SqlHelper.getFieldFromParameter(Getcpfcnpjvalidity.RETURN_VALUE, "", "cpfInfo"));
////            
////            BigDecimal cpfProprietario = null;
////            BigDecimal cnpjPropriedade = null;
////            String nomePropriedade = null;
////            String nomeProprietario = null;
////            switch (isCpfCnpj) {
////                case 1: //É Cpf
////                    cpfProprietario = gtaRow.getValue(MT_TRANSACTIONS2.CPF_CNPJ_ORIGEM);
////                    break;
////                case 2: //É Cnpj
////                    cnpjPropriedade = gtaRow.getValue(MT_TRANSACTIONS2.CPF_CNPJ_ORIGEM);
////                    break;
////                default:
////                case 0: //Nao é valido
////            }
////            
//////            insertInto.values(isCpfCnpj, Long.MIN_VALUE, limit, Long.MIN_VALUE, limit)
////            Integer value = gtaRow.getValue(SqlHelper.getFieldFromParameter(
////                Getanimalidade.MACHO_6, "animalAge"));
////            System.out.println("faix" + faixaSexoQnt + " esp " + especie);
//        }
        
    }
    
    public static void fillDatabaseFromGTAandFBDS() throws SQLException {
        DatabaseManager databaseManager = new DatabaseManager();
        ResultSet fillPropriedades = databaseManager.runQuery(
                "INSERT INTO proposta.propriedade (imovel_id, data, estado_id, municipio_id,\n"
                + "    codigo_imovel, --tipo_id, situacao_id, condicao_imovel,\n"
                + "    geom, modulo_count, area)\n"
                + "SELECT\n"
                + "distinct on (municipios.id, estados.id, imovel.geom, imovel.cod_imovel, imovel.num_area, imovel.cod_estado, imovel.nom_munici, imovel.num_modulo,\n"
                + "imovel.tipo_imove, info.\"siglaEstado\", info.\"geocodigoMunicipio\", info.\"idPropriedade\")\n"
                + "    info.\"idPropriedade\", TO_DATE('2018-01-01', 'YYYY-MM-DD'), estados.id as estado_id,\n"
                + "    municipios.id as municipio_id, cod_imovel, --tipo_imove, situacao, condicao_i, imovel.id --Campos ignorados\n"
                + "    imovel.geom, num_modulo, ST_Area(imovel.geom)\n"
                + "FROM\n"
                + "public.area_imovel_juntos as imovel, csr_database.municipios as municipios,\n"
                + "csr_database.estados as estados, proposta.getInfoCodImovel(imovel.cod_imovel) as info\n"
                + "WHERE\n"
                + "info.\"geocodigoMunicipio\" = municipios.geocodigo and\n"
                + "estados.sigla = info.\"siglaEstado\"\n"
                + "--and ST_Intersects(estados.geom, municipios.geom)\n"
                + "group by info.\"idPropriedade\", imovel.id, municipios.id, estados.id, imovel.geom, imovel.cod_imovel, imovel.num_area, imovel.cod_estado, imovel.nom_munici, imovel.num_modulo,\n"
                + "                    imovel.tipo_imove, info.\"siglaEstado\", info.\"geocodigoMunicipio\", info.\"idPropriedade\"");
        ResultSet fillGuiaTransitoAnimal = databaseManager.runQuery(
                "INSERT INTO proposta.guia_transito_animal(id, municipio_destino, municipio_fonte, propriedade_fonte_id, propriedade_destino_id, estado_fonte, estado_destino, transporte_id, especie_tipo, transporte_motivo, meio_transporte, data_emitida, vacina_aftosa_primeira, vacina_aftosa_segunda, vacina_bucellosis, vacina_merek, emissor_id, emissao_tipo, valido_ate, situacao, femea_6, femea_12, femea_24, femea_36, femea_mais, macho_6, macho_12, macho_24, macho_36, macho_mais)\n"
                + "SELECT DISTINCT ON (gta2.scrapeid) gta2.scrapeid,\n"
                + "municipioTo.id as municipio_to_id,\n"
                + "municipioFrom.id as municipio_from_id,\n"
                + "propriedadeFrom.id as propriedade_from_id,\n"
                + "propriedadeTo.id as propriedade_to_id,\n"
                + "estadoFrom.id as estado_from_id,\n"
                + "estadoTo.id as estado_to_id,\n"
                + "gta2.id_meiotr,\n"
                + "gta2.nm_especie,\n"
                + "gta2.dc_final,\n"
                + "gta2.id_meiotr,\n"
                + "gta2.dt_emissao,\n"
                + "gta2.dt_aft01,\n"
                + "gta2.dt_aft02,\n"
                + "gta2.dt_brucel,\n"
                + "gta2.dt_vacmar,\n"
                + "gta2.unidade_expedidora,\n"
                + "gta2.emitente,\n"
                + "gta2.dt_valid,\n"
                + "gta2.situacao,\n"
                + "animalAge.\"femea_6\",\n"
                + "animalAge.\"femea_12\",\n"
                + "animalAge.\"femea_24\",\n"
                + "animalAge.\"femea_36\",\n"
                + "animalAge.\"femea_mais\",\n"
                + "animalAge.\"macho_6\",\n"
                + "animalAge.\"macho_12\",\n"
                + "animalAge.\"macho_24\",\n"
                + "animalAge.\"macho_36\",\n"
                + "animalAge.\"macho_mais\"\n"
                + "from gta.mt_transactions2 as gta2,\n"
                + "proposta.getAnimalIdade(gta2.faixa_sexo_quant, gta2.nm_especie) as animalAge,\n"
                + "proposta.getInfoCodImovel(gta2.buyercar) as infoFrom\n"
                + "left join csr_database.municipios as municipioFrom\n"
                + "ON infoFrom.\"geocodigoMunicipio\" = municipioFrom.geocodigo\n"
                + "left join csr_database.estados as estadoFrom\n"
                + "ON infoFrom.\"siglaEstado\" = estadoFrom.sigla\n"
                + "left join proposta.propriedade as propriedadeFrom\n"
                + "ON infoFrom.\"idPropriedade\" = propriedadeFrom.imovel_id,\n"
                + "proposta.getInfoCodImovel(gta2.sellercar) as infoTo\n"
                + "left join csr_database.municipios as municipioTo\n"
                + "ON infoTo.\"geocodigoMunicipio\" = municipioTo.geocodigo\n"
                + "left join csr_database.estados as estadoTo\n"
                + "ON infoTo.\"siglaEstado\" = estadoTo.sigla\n"
                + "left join proposta.propriedade as propriedadeTo\n"
                + "ON infoTo.\"idPropriedade\" = propriedadeTo.imovel_id");
    }
    
}
