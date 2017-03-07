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
public class SpVerLogCuotasInhabilitadoras extends StoredProcedure {
    public static final String SPROC_NAME = "mi_sp_con_log_coutas_inh";
    public static final String PARAM_IN_TIPO_OPERACION = "_tipo_operacion";
    public static final String PARAM_IN_FECHA_INI = "fecha_ini";
    public static final String PARAM_IN_FECHA_FIN = "fecha_fin";
    public static final String PARAM_OUT_IND = "ind";
    public static final String PARAM_OUT_MSJ = "msj";
    
    
    public SpVerLogCuotasInhabilitadoras(DataSource dataSource) {
        super(dataSource, SPROC_NAME);
        declareParameter(new SqlParameter(PARAM_IN_TIPO_OPERACION, Types.INTEGER));
        declareParameter(new SqlParameter(PARAM_IN_FECHA_INI, Types.VARCHAR));
        declareParameter(new SqlParameter(PARAM_IN_FECHA_FIN, Types.VARCHAR));
        declareParameter(new SqlOutParameter(PARAM_OUT_IND, Types.INTEGER));
        declareParameter(new SqlOutParameter(PARAM_OUT_MSJ, Types.VARCHAR));
        compile();
    }
    
    public Map<String, Object> execute(Map<String,?> campos) {
        Map<String, Object> result = super.execute(campos);  
        return result;
    }
}
