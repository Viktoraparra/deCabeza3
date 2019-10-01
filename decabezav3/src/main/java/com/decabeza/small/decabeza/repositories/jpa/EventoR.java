
package com.decabeza.small.decabeza.repositories.jpa;

import com.decabeza.small.decabeza.entities.Evento;
import com.decabeza.small.decabeza.repositories.interfaces.I_EventoR;
import com.decabeza.small.decabeza.repositories.interfaces.I_GenericR;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;

/**
 *
 * @author kingfenix
 */
public class EventoR implements I_EventoR{
    private I_GenericR<Evento> generic;
    public EventoR(EntityManager em){generic=new GenericR(em, new Evento());}

     @Override public void save(Evento evento) {generic.save(evento);}
    @Override public void remove(Evento evento) {generic.remove(evento);}
    @Override public void update(Evento evento) {generic.update(evento);}
    @Override public List<Evento> getAll() {return generic.getAll();}

    @Override
    public Evento getByIdEvento(Integer idEvento) {
        List<Evento>lista=getAll()
                .stream()
                .filter(a->a.getIdEvento()==idEvento)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public Evento getByNombre(String evento) {
        List<Evento>lista=getAll()
                .stream()
                .filter(a->a.getNombre().equalsIgnoreCase(evento))
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }
    
    /*
    Desconozco como realizar esta implementacion debo investigar
    consultar con alguien y se repite
    */
    @Override
    public List<Evento> getByFechaYFecha(Date fechaDesde, Date fechaHasta) {
        return null;
    }
    
}
