/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decabeza.small.decabeza.test;

import com.decabeza.small.decabeza.entities.TipoE;
import com.decabeza.small.decabeza.entities.Usuario;
import com.decabeza.small.decabeza.enumerados.Perfil;
import com.decabeza.small.decabeza.enumerados.Reside;
import com.decabeza.small.decabeza.enumerados.Sexo;
import com.decabeza.small.decabeza.repositories.jpa.TipoER;
import com.decabeza.small.decabeza.repositories.jpa.UsuarioR;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author kingfenix
 */
public class TestJPA {
    public static void main(String[] args) {
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPASmall");
        
        EntityManager em = emf.createEntityManager();
        
        UsuarioR usua = new UsuarioR(em);
        
        Usuario us = new Usuario("Victor", "Parra", 95671211, "http://omwaizsx.jpg", 
                "1153222554", "victoraparra", 34, Sexo.HOMBRE, "victoraparrapineda@gmail.com", 
                "San Jose de Calasanz, 289, 6D, Caballito, CABA, Buenos Aires", "Venezolano", 
                Reside.SI, "victor9595", Perfil.ADMINISTRADOR);
        
        usua.save(us);
        System.out.println("*****************************************");
        usua.getAll().forEach(System.out::println);
        System.out.println("*****************************************");
        
//        TipoER tir = new TipoER(em);
//        
//        TipoE tiE = new TipoE();
        
    }
}
