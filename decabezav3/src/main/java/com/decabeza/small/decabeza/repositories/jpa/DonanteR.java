package com.decabeza.small.decabeza.repositories.jpa;

import com.decabeza.small.decabeza.entities.Donante;
import com.decabeza.small.decabeza.repositories.interfaces.I_DonanteR;
import com.decabeza.small.decabeza.repositories.interfaces.I_GenericR;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;

/**
 *
 * @author kingfenix
 */
public class DonanteR implements I_DonanteR{
    private I_GenericR<Donante> generic;
    public DonanteR(EntityManager em){generic=new GenericR(em,new Donante());}

    @Override public void save(Donante donante) {generic.save(donante);}
    @Override public void remove(Donante donante) {generic.remove(donante);}
    @Override public void update(Donante donante) {generic.update(donante);}
    @Override public List<Donante> getAll() { return generic.getAll();}

    @Override
    public Donante getByIdDonante(Integer idDonante) {
    List<Donante>lista=getAll()
                .stream()
                .filter(a->a.getIdDonante()==idDonante)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public Donante getByTlf(String telefono) {
        List<Donante>lista=getAll()
                  .stream()
                  .filter(a->a.getTelefono().equalsIgnoreCase(telefono))
                .collect(Collectors.toList());
          return (lista==null || lista.isEmpty())?null:lista.get(0);    
    }

    @Override
    public Donante getByIdentificador(String cuil) {
          List<Donante>lista=getAll()
                .stream()
                .filter(a->a.getIdentificador().equalsIgnoreCase(cuil))
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    
    }

    @Override
    public Donante getByRazonSocial(String rasonSocial) {
        List<Donante>lista=getAll()
                  .stream()
                  .filter(a->a.getRazonSocial().equalsIgnoreCase(rasonSocial))
                .collect(Collectors.toList());
          return (lista==null || lista.isEmpty())?null:lista.get(0);          
    }

    @Override
    public Donante getByCorreo(String correo) {
        List<Donante>lista=getAll()
                  .stream()
                  .filter(a->a.getCorreo().equalsIgnoreCase(correo))
                .collect(Collectors.toList());
          return (lista==null || lista.isEmpty())?null:lista.get(0); 
    }

    @Override
    public List<Donante> getLikeRazonCorreo(String rasonSocial, String correo) {
         return getAll()
                .stream()
                .filter(a->a.getRazonSocial().toLowerCase().contains(rasonSocial.toLowerCase())
                || a.getCorreo().toLowerCase().contains(correo.toLowerCase()))
                .collect(Collectors.toList());
    }
    
}
