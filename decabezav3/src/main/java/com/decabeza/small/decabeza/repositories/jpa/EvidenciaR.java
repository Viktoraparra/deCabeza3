package com.decabeza.small.decabeza.repositories.jpa;

import com.decabeza.small.decabeza.entities.Evidencia;
import com.decabeza.small.decabeza.repositories.interfaces.I_EvidenciaR;
import com.decabeza.small.decabeza.repositories.interfaces.I_GenericR;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;

/**
 *
 * @author kingfenix
 */
public class EvidenciaR implements I_EvidenciaR{
    private I_GenericR<Evidencia> generic;
    public EvidenciaR(EntityManager em){generic=new GenericR(em,new Evidencia());}

    @Override public void save(Evidencia evidencia) {generic.save(evidencia);}
    @Override public void remove(Evidencia evidencia) {generic.remove(evidencia);}
    @Override public void update(Evidencia evidencia) {generic.update(evidencia);}
    @Override public List<Evidencia> getAll() {return generic.getAll();}
    
    @Override
    public Evidencia getByIdEvidencia(Integer idEvidencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evidencia getByNombre(String nombre) {
         List<Evidencia>lista=getAll()
                .stream()
                .filter(a->a.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);    
    }
    /*
    Desconozco como realizar esta implementacion debo investigar
    consultar con alguien y se repite
    */
    @Override
    public List<Evidencia> getLikeDateNow(Date fecha, Date hoy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
