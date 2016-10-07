/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whnm.sicqfdp.spbeans;

import java.sql.Types;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

/**
 *
 * @author wilson
 */
public class SpListarOperadora extends StoredProcedure {
    public static final String SPROC_NAME = "mg_sp_listar_operadora";
    public static final String PARAM_IN_IDOPERADORA = "codOperadoras";
    public static final String PARAM_IN_HABILITADO = "habilit";
    public static final String PARAM_IN_OPCLISTADO = "opcListado";
    public static final String PARAM_OUT_IND = "ind";
    public static final String PARAM_OUT_MSJ = "msj";
    
    public SpListarOperadora(DataSource dataSource) {
        super(dataSource, SPROC_NAME);
        declareParameter(new SqlParameter(PARAM_IN_IDOPERADORA, Types.INTEGER));
        declareParameter(new SqlParameter(PARAM_IN_HABILITADO, Types.INTEGER));
        declareParameter(new SqlParameter(PARAM_IN_OPCLISTADO, Types.INTEGER));
        declareParameter(new SqlOutParameter(PARAM_OUT_IND, Types.INTEGER));
        declareParameter(new SqlOutParameter(PARAM_OUT_MSJ, Types.VARCHAR));
        compile();
    }
    
    public Map<String, Object> execute(Map<String,?> campos) {
        Map<String, Object> result = super.execute(campos);  
        return result;
    }
}