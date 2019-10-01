package com.decabeza.small.decabeza.repositories.jpa;

import com.decabeza.small.decabeza.entities.TipoE;
import com.decabeza.small.decabeza.repositories.interfaces.I_GenericR;
import com.decabeza.small.decabeza.repositories.interfaces.I_TipoER;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;

/**
 *
 * @author kingfenix
 */
public class TipoER implements I_TipoER{
    private I_GenericR<TipoE> generic;
    public TipoER(EntityManager em){generic=new GenericR(em,new TipoE());}

    @Override public void save(TipoE tipoE) {generic.save(tipoE);}
    @Override public void remove(TipoE tipoE) {generic.remove(tipoE);}
    @Override public void update(TipoE tipoE) {generic.update(tipoE);}
    @Override public List<TipoE> getAll() {return generic.getAll();}

    @Override
    public TipoE getByIdTipoE(Integer idTipoE) {
        List<TipoE>lista=getAll()
                .stream()
                .filter(a->a.getIdTipoE()==idTipoE)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public TipoE getByNombre(String nombre) {
        List<TipoE>lista=getAll()
                  .stream()
                  .filter(a->a.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
          return (lista==null || lista.isEmpty())?null:lista.get(0);
   
    }

    @Override
    public TipoE getByTipo(String tipo) {
         List<TipoE>lista=getAll()
                  .stream()
                  .filter(a->a.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
          return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public List<TipoE> getLikeNombreTipo(String nombre, String tipo) {
    return getAll()
                .stream()
                .filter(a->a.getNombre().toLowerCase().contains(nombre.toLowerCase())
                || a.getTipo().toLowerCase().contains(tipo.toLowerCase()))
                .collect(Collectors.toList());
    }
    
}
