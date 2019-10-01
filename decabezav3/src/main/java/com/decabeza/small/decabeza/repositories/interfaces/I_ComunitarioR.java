
package com.decabeza.small.decabeza.repositories.interfaces;

import com.decabeza.small.decabeza.entities.Comunitario;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author kingfenix
 */
public interface I_ComunitarioR {
    void save(Comunitario comunitario);
    void remove(Comunitario comunitario);
    void update(Comunitario comunitario);
    List<Comunitario> getAll(); 
    Comunitario getByIdComunitario(Integer idComunitario);
    Comunitario getByEquipo(String equipo);
    List<Comunitario> getLikeFechayFecha(Date fechaDesde, Date fechaHasta);
    List<Comunitario> getLikeEventoDescripcion(String evento, String descripcion);
    
}
