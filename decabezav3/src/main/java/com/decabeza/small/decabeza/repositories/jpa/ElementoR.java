/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decabeza.small.decabeza.repositories.jpa;

import com.decabeza.small.decabeza.entities.Elemento;
import com.decabeza.small.decabeza.entities.Usuario;
import com.decabeza.small.decabeza.repositories.interfaces.I_ElementoR;
import com.decabeza.small.decabeza.repositories.interfaces.I_GenericR;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;

/**
 *
 * @author kingfenix
 */
public class ElementoR implements I_ElementoR{
    private I_GenericR<Elemento> generic;
    public ElementoR(EntityManager em){generic=new GenericR(em, new Elemento());}

    @Override public void save(Elemento elemento) {generic.save(elemento);}
    @Override public void remove(Elemento elemento) {generic.remove(elemento);}
    @Override public void update(Elemento elemento) {generic.update(elemento);}
    @Override public List<Elemento> getAll() {return generic.getAll();}

    @Override
    public Elemento getByIdElemento(Integer idElemento) {
          List<Elemento>lista=getAll()
                .stream()
                .filter(a->a.getIdElemento()==idElemento)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public Elemento getByNombre(String nombre) {
            List<Elemento>lista=getAll()
                .stream()
                .filter(a->a.getNombre()==nombre)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }
    /*
    Desconozco como realizar esta implementacion debo investigar
    consultar con alguien y se repite
    */
    @Override
    public List<Elemento> getByFechayFecha(Date fechaDesde, Date fechaHasta) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
