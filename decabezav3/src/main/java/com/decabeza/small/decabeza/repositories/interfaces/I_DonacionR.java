package com.decabeza.small.decabeza.repositories.interfaces;

import com.decabeza.small.decabeza.entities.Donacion;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author kingfenix
 */
public interface I_DonacionR {
    void save(Donacion donacion);
    void remove(Donacion donacion);
    void update(Donacion donacion);
    List<Donacion> getAll(); 
    Donacion getByIdDonacion(Integer donacion);
    List<Donacion> getLikeProductoDrescripcion(String producto, String descripcion);
    List<Donacion> getLikeFechayFecha(Date fechaDesde, Date fechaHasta);
    
}
