/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whnm.sicqfdp.interfaces;

import com.whnm.sicqfdp.beans.ListTipoEquipo;
import com.whnm.sicqfdp.beans.TipoEquipo;

/**
 *
 * @author wilson
 */
public interface TipoEquipoDao {
    public TipoEquipo mantTipoEquipo(Integer opcCrud, TipoEquipo tipoEq);
    public ListTipoEquipo listarTipoEquipo(Integer opcListado, TipoEquipo tipoEq);
}
