package com.decabeza.small.decabeza.repositories.interfaces;

import com.decabeza.small.decabeza.entities.Mensaje;
import java.util.List;

/**
 *
 * @author kingfenix
 */
public interface I_MensajeR {
    void save(Mensaje mensaje);
    void remove(Mensaje mensaje);
    void update(Mensaje mensaje);
    List<Mensaje> getAll(); 
    Mensaje getByIdComnetario(Integer comentario);
}
