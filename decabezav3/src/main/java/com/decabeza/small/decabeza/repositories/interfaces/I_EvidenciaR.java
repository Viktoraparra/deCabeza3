package com.decabeza.small.decabeza.repositories.interfaces;

import com.decabeza.small.decabeza.entities.Evidencia;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author kingfenix
 */
public interface I_EvidenciaR {
    void save(Evidencia evidencia);
    void remove(Evidencia evidencia);
    void update(Evidencia evidencia);
    List<Evidencia> getAll();
    Evidencia getByIdEvidencia(Integer idEvidencia);
    Evidencia getByNombre(String nombre);
    List<Evidencia> getLikeDateNow(Date fecha, Date hoy);
}
