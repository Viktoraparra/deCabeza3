package com.decabeza.small.decabeza.repositories.interfaces;

import com.decabeza.small.decabeza.entities.Grupo;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author kingfenix
 */
public interface I_GrupoR {
    void save(Grupo grupo);
    void remove(Grupo grupo);
    void update(Grupo grupo);
    List<Grupo> getAll();
    Grupo getByIdGrupo(Integer idGrupo);
    List<Grupo> getLikeDateNow(Date fecha, Date hoy);
    
}
