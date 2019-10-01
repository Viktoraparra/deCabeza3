package com.decabeza.small.decabeza.repositories.interfaces;

import com.decabeza.small.decabeza.entities.Donante;
import java.util.List;

/**
 *
 * @author kingfenix
 */
public interface I_DonanteR {
    void save(Donante donante);
    void remove(Donante donante);
    void update(Donante donante);
    List<Donante> getAll(); 
    Donante getByIdDonante(Integer idDonante);
    Donante getByTlf(String telefono);
    Donante getByIdentificador(String cuil);
    Donante getByRazonSocial(String rasonSocial);
    Donante getByCorreo(String correo);
    List<Donante> getLikeRazonCorreo(String rasonSocial, String correo);
    
}
