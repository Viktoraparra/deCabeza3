package com.decabeza.small.decabeza.repositories.interfaces;

import com.decabeza.small.decabeza.entities.Usuario;
import java.util.List;

/**
 *
 * @author kingfenix
 */
public interface I_UsuarioR {
    void save(Usuario usuario);
    void remove(Usuario usuario);
    void update(Usuario usuario);
    List<Usuario> getAll();
    Usuario getByEdad(Integer edad);
    Usuario getBySexo(String sexo);
    Usuario getByDni(Integer dni);
    Usuario getByCorreo(String correo);
    Usuario getByUsuarioId(Integer idUsuario);
    Usuario getByNacionalidad(String nacionalidad);
    List<Usuario> getLikeDireccionUsuario(String direccion,String usuario);
    List<Usuario> getLineNombreApellido(String nombre, String apellido);
}
