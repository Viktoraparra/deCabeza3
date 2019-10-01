package com.decabeza.small.decabeza.repositories.jpa;

import com.decabeza.small.decabeza.entities.Donacion;
import com.decabeza.small.decabeza.repositories.interfaces.I_DonacionR;
import com.decabeza.small.decabeza.repositories.interfaces.I_GenericR;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;

/**
 *
 * @author kingfenix
 */
public class DonacionR implements I_DonacionR{
    private I_GenericR<Donacion> generic;
    public DonacionR(EntityManager em) {generic=new GenericR(em,new Donacion());}
    
    @Override public void save(Donacion donacion) {generic.save(donacion);}
    @Override public void remove(Donacion donacion) {generic.remove(donacion);}
    @Override public void update(Donacion donacion) {generic.update(donacion);}
    @Override public List<Donacion> getAll() {return generic.getAll();}

    @Override
    public Donacion getByIdDonacion(Integer donacion) {
         List<Donacion>lista=getAll()
                .stream()
                .filter(a->a.getIdDonacion()==donacion)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
        
    }

    @Override
    public List<Donacion> getLikeProductoDrescripcion(String producto, String descripcion) {
        return getAll()
                .stream()
                .filter(a->a.getProducto().toLowerCase().contains(producto.toLowerCase())
                || a.getDescripcion().toLowerCase().contains(descripcion.toLowerCase()))
                .collect(Collectors.toList());
    }
    /*
    Desconozco como realizar esta implementacion debo investigar
    consultar con alguien y se repite
    */
    @Override
    public List<Donacion> getLikeFechayFecha(Date fechaDesde, Date fechaHasta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
