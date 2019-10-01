package com.decabeza.small.decabeza.repositories.interfaces;

import com.decabeza.small.decabeza.entities.TipoE;
import java.util.List;

/**
 *
 * @author kingfenix
 */
public interface I_TipoER {
    void save(TipoE tipoE);
    void remove(TipoE tipoE);
    void update(TipoE tipoE);
    List<TipoE> getAll();
    TipoE getByIdTipoE(Integer idTipoE);
    TipoE getByNombre(String nombre);
    TipoE getByTipo(String tipo);
    List<TipoE> getLikeNombreTipo(String nombre, String tipo);
    
    
}
