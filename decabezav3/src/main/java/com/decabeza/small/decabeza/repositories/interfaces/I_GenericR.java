package com.decabeza.small.decabeza.repositories.interfaces;

import java.util.List;

/**
 *
 * @author viksdrago
 */
public interface I_GenericR<E> {
    void save(E e);
    void remove(E e);
    void update(E e);
    List<E> getAll();
}
