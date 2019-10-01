/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decabeza.small.decabeza.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author viktorius
 */
public class Testrepository {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPASmall");
        EntityManager em = emf.createEntityManager();
        
        //Busqueda de todos los Usuarios
        em.createNamedQuery("Usuario.findAll")
                .getResultList().forEach(System.out::println);
//        System.out.println("*************************************");
//         //Busqueda de todos los tipos de evidencias
//        em.createNamedQuery("TipoE.findAll")
//                .getResultList().forEach(System.out::println);
//        System.out.println("*************************************");
//         //Busqueda de todos las evidencias
//        em.createNamedQuery("Evidencia.findAll")
//                .getResultList().forEach(System.out::println);
//        System.out.println("*************************************");
//         //Busqueda de todos los mensajes
//        em.createNamedQuery("Mensaje.findAll")
//                .getResultList().forEach(System.out::println);
//        System.out.println("*************************************");
//         //Busqueda de todos los grupos
//        em.createNamedQuery("Grupo.findAll")
//                .getResultList().forEach(System.out::println);
//        System.out.println("*************************************");
//         //Busqueda de todos los eventos
//        em.createNamedQuery("Evento.findAll")
//                .getResultList().forEach(System.out::println);
//        System.out.println("*************************************");
//         //Busqueda de todos los donantes
//        em.createNamedQuery("Donante.findAll")
//                .getResultList().forEach(System.out::println);
//        System.out.println("*************************************");
//         //Busqueda de todas las donaciones
//        em.createNamedQuery("Donacion.findAll")
//                .getResultList().forEach(System.out::println);
//        System.out.println("*************************************");
//         //Busqueda de todos los eventos de comunitario
//        em.createNamedQuery("Comunitario.findAll")
//                .getResultList().forEach(System.out::println);
//        System.out.println("*************************************");
//      
        em.close();
        emf.close();
    }
}
