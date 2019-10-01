package com.decabeza.small.decabeza.repositories.jpa;

import com.decabeza.small.decabeza.repositories.interfaces.I_GenericR;
import java.util.List;
import javax.persistence.EntityManager;

public class GenericR<E> implements I_GenericR<E>{
    // Se establece la conexion con JPA
    private EntityManager em;
    private E e;

    //Se establece La conexion Generica para los Objetos o entidades
    public GenericR(EntityManager em, E e) {
        this.em = em;
        this.e = e;
    }
    
    //Construccion del Metodo Save Acorde el conector JPA
    @Override
    public void save(E e) {
        if (e==null) return;
        //Abro la Transaccion
        em.getTransaction().begin();
        //Envio la informacion que se desea guardar
        em.persist(e);
        //Se realiza el Cierre de la Transaccion
        em.getTransaction().commit();
    }

    @Override
    public void remove(E e) {
        //Abro la Transaccion
        em.getTransaction().begin();
        //Envio la informacion que se desea Remover
        em.remove(e);
        //Se realiza el Cierre de la Transaccion
        em.getTransaction().commit();
    }

    @Override
    public void update(E e) {
       //Aunque ya el persist me hace el update, tengo que crearlo, ya que tengo
       //que mantener el lenguaje de la interfas
       if (e==null) return;
       //Abro la Transaccion
        em.getTransaction().begin();
       //Envio la informacion que se desea Actualizar
        em.persist(e);
       //Se realiza el Cierre de la Transaccion
        em.getTransaction().commit();
    }

    @Override
    public List<E> getAll() {
        /*
        Para que sea Generico, tengo que hacer que tome el nombre de la clase que 
        va a ejecutar el findAll
        */
        return em
                .createNamedQuery(e.getClass().getSimpleName()+".findAll")
                .getResultList();
    }
    
}
