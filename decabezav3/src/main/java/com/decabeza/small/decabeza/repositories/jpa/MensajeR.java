package com.decabeza.small.decabeza.repositories.jpa;

import com.decabeza.small.decabeza.entities.Mensaje;
import com.decabeza.small.decabeza.repositories.interfaces.I_GenericR;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import com.decabeza.small.decabeza.repositories.interfaces.I_MensajeR;

/**
 *
 * @author kingfenix
 */
public class MensajeR implements I_MensajeR{
    private I_GenericR<Mensaje> generic;
    public MensajeR(EntityManager em){generic=new GenericR(em,new Mensaje());}

    @Override public void save(Mensaje mensaje) {generic.save(mensaje);}
    @Override public void remove(Mensaje mensaje) {generic.remove(mensaje);}
    @Override public void update(Mensaje mensaje) {generic.update(mensaje);}
    @Override public List<Mensaje> getAll() {return getAll();}

    @Override
    public Mensaje getByIdComnetario(Integer mensaje) {
        List<Mensaje>lista=getAll()
                .stream()
                .filter(a->a.getIdMensaje()==mensaje)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }
    
}
