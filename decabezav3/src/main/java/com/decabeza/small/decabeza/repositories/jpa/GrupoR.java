package com.decabeza.small.decabeza.repositories.jpa;

import com.decabeza.small.decabeza.entities.Grupo;
import com.decabeza.small.decabeza.repositories.interfaces.I_GenericR;
import com.decabeza.small.decabeza.repositories.interfaces.I_GrupoR;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;

/**
 *
 * @author kingfenix
 */
public class GrupoR implements I_GrupoR{
    private I_GenericR<Grupo> generic;
    public GrupoR(EntityManager em){generic=new GenericR(em,new Grupo());}

    @Override public void save(Grupo grupo) {generic.save(grupo);}
    @Override public void remove(Grupo grupo) {generic.remove(grupo);}
    @Override public void update(Grupo grupo) {generic.update(grupo);}
    @Override public List<Grupo> getAll() {return generic.getAll();}

    @Override public Grupo getByIdGrupo(Integer idGrupo) {
        List<Grupo>lista=getAll()
                .stream()
                .filter(a->a.getIdGrupo()==idGrupo)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }
    /*
    Desconozco como realizar esta implementacion debo investigar
    consultar con alguien y se repite
    */
    @Override
    public List<Grupo> getLikeDateNow(Date fecha, Date hoy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
