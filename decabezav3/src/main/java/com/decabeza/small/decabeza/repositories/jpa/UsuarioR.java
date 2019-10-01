
package com.decabeza.small.decabeza.repositories.jpa;

import com.decabeza.small.decabeza.entities.Usuario;
import com.decabeza.small.decabeza.repositories.interfaces.I_GenericR;
import com.decabeza.small.decabeza.repositories.interfaces.I_UsuarioR;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;

/**
 *
 * @author kingfenix
 */
public class UsuarioR implements I_UsuarioR{
    private I_GenericR<Usuario>generic;
    public UsuarioR(EntityManager em){generic=new GenericR(em,new Usuario());}

    @Override public void save(Usuario usuario) {generic.save(usuario);}
    @Override public void remove(Usuario usuario) {generic.remove(usuario);}
    @Override public void update(Usuario usuario) {generic.update(usuario);}
    @Override public List<Usuario> getAll() {return generic.getAll();}

    @Override
    public Usuario getByEdad(Integer edad) {
          List<Usuario>lista=getAll()
                .stream()
                .filter(a->a.getEdad()==edad)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public Usuario getBySexo(String sexo) {
         List<Usuario>lista=getAll()
                  .stream()
                  .filter(a->a.getSexo().equalsIgnoreCase(sexo))
                .collect(Collectors.toList());
          return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public Usuario getByDni(Integer dni) {
         List<Usuario>lista=getAll()
                .stream()
                .filter(a->a.getDni()==dni)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
        
    }

    @Override
    public Usuario getByCorreo(String correo) {
         List<Usuario>lista=getAll()
                  .stream()
                  .filter(a->a.getCorreo().equalsIgnoreCase(correo))
                .collect(Collectors.toList());
          return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public Usuario getByUsuarioId(Integer idUsuario) {
         List<Usuario>lista=getAll()
                .stream()
                .filter(a->a.getIdUsuario()==idUsuario)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public Usuario getByNacionalidad(String nacionalidad) {
         List<Usuario>lista=getAll()
                  .stream()
                  .filter(a->a.getNacionalidad().equalsIgnoreCase(nacionalidad))
                .collect(Collectors.toList());
          return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public List<Usuario> getLineNombreApellido(String nombre, String apellido) {
        return getAll()
                .stream()
                .filter(a->a.getNombre().toLowerCase().contains(nombre.toLowerCase())
                || a.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Usuario> getLikeDireccionUsuario(String direccion, String usuario) {
         return getAll()
                .stream()
                .filter(a->a.getDireccion().toLowerCase().contains(direccion.toLowerCase())
                || a.getUsuario().toLowerCase().contains(usuario.toLowerCase()))
                .collect(Collectors.toList());
    }
        
}
