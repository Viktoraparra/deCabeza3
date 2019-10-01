package com.decabeza.small.decabeza.repositories.interfaces;

import com.decabeza.small.decabeza.entities.Elemento;
import java.sql.Date;
import java.util.List;


/**
 *
 * @author kingfenix
 */
public interface I_ElementoR {
    void save(Elemento elemento);
    void remove(Elemento elemento);
    void update(Elemento elemento);
    List<Elemento> getAll(); 
    Elemento getByIdElemento(Integer idElemento);
    Elemento getByNombre(String nombre);
    List<Elemento> getByFechayFecha(Date fechaDesde, Date fechaHasta);
       
}
