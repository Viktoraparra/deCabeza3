package com.decabeza.small.decabeza.repositories.jpa;

import com.decabeza.small.decabeza.entities.Comunitario;
import com.decabeza.small.decabeza.repositories.interfaces.I_ComunitarioR;
import com.decabeza.small.decabeza.repositories.interfaces.I_GenericR;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
/**
 *
 * @author kingfenix
 */
public class ComunitarioR implements I_ComunitarioR{
    private I_GenericR<Comunitario> generic;
    public ComunitarioR(EntityManager em){generic=new GenericR(em, new Comunitario());}

    @Override public void save(Comunitario comunitario) {generic.save(comunitario);}
    @Override public void remove(Comunitario comunitario) {generic.remove(comunitario);}
    @Override public void update(Comunitario comunitario) {generic.update(comunitario);}
    @Override public List<Comunitario> getAll() { return generic.getAll();}

    @Override public Comunitario getByIdComunitario(Integer idComunitario) {
             List<Comunitario>lista=getAll()
                .stream()
                .filter(a->a.getIdComunitario()==idComunitario)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    
    }

    @Override
    public Comunitario getByEquipo(String equipo) {
        List<Comunitario>lista=getAll()
                  .stream()
                  .filter(a->a.getEquipo().equals(equipo))
                .collect(Collectors.toList());
          return (lista==null || lista.isEmpty())?null:lista.get(0);
    
    }
     /*
    Desconozco como realizar esta implementacion debo investigar
    consultar con alguien y se repite
    */
    @Override
    public List<Comunitario> getLikeFechayFecha(Date fechaDesde, Date fechaHasta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Comunitario> getLikeEventoDescripcion(String evento, String descripcion) {
          return getAll()
                .stream()
                .filter(a->a.getEvento().toLowerCase().contains(evento.toLowerCase())
                || a.getDescripcion().toLowerCase().contains(descripcion.toLowerCase()))
                .collect(Collectors.toList());
    }
    
}
