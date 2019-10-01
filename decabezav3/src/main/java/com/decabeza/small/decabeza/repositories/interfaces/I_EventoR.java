package com.decabeza.small.decabeza.repositories.interfaces;

import com.decabeza.small.decabeza.entities.Evento;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author kingfenix
 */
public interface I_EventoR {
    void save(Evento evento);
    void remove(Evento evento);
    void update(Evento evento);
    List<Evento> getAll(); 
    Evento getByIdEvento(Integer idEvento);
    Evento getByNombre(String idEvento);
    List<Evento> getByFechaYFecha(Date fechaDesde, Date fechaHasta);
}
