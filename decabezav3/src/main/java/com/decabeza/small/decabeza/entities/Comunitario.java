/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decabeza.small.decabeza.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author viktorius
 */
@Entity
@Table(name = "tblComunitario", catalog = "DBCalido", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comunitario.findAll", query = "SELECT c FROM Comunitario c"),
    @NamedQuery(name = "Comunitario.findByIdComunitario", query = "SELECT c FROM Comunitario c WHERE c.idComunitario = :idComunitario"),
    @NamedQuery(name = "Comunitario.findByEquipo", query = "SELECT c FROM Comunitario c WHERE c.equipo = :equipo"),
    @NamedQuery(name = "Comunitario.findByFecha", query = "SELECT c FROM Comunitario c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Comunitario.findByEvento", query = "SELECT c FROM Comunitario c WHERE c.evento = :evento"),
    @NamedQuery(name = "Comunitario.findByDescripcion", query = "SELECT c FROM Comunitario c WHERE c.descripcion = :descripcion")})
public class Comunitario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idComunitario")
    private Integer idComunitario;
    @Basic(optional = false)
    @Column(name = "equipo")
    private Character equipo;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "evento")
    private String evento;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "elementoId", referencedColumnName = "idElemento")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Elemento elementoId;
    @JoinColumn(name = "donanteId", referencedColumnName = "idDonante")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Donante donanteId;

    public Comunitario() {
    }

    public Comunitario(Integer idComunitario) {
        this.idComunitario = idComunitario;
    }

    public Comunitario(Integer idComunitario, Character equipo, Date fecha, String evento, String descripcion) {
        this.idComunitario = idComunitario;
        this.equipo = equipo;
        this.fecha = fecha;
        this.evento = evento;
        this.descripcion = descripcion;
    }

    public Integer getIdComunitario() {
        return idComunitario;
    }

    public void setIdComunitario(Integer idComunitario) {
        this.idComunitario = idComunitario;
    }

    public Character getEquipo() {
        return equipo;
    }

    public void setEquipo(Character equipo) {
        this.equipo = equipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Elemento getElementoId() {
        return elementoId;
    }

    public void setElementoId(Elemento elementoId) {
        this.elementoId = elementoId;
    }

    public Donante getDonanteId() {
        return donanteId;
    }

    public void setDonanteId(Donante donanteId) {
        this.donanteId = donanteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComunitario != null ? idComunitario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comunitario)) {
            return false;
        }
        Comunitario other = (Comunitario) object;
        if ((this.idComunitario == null && other.idComunitario != null) || (this.idComunitario != null && !this.idComunitario.equals(other.idComunitario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.decabeza.small.decabeza.entities.Comunitario[ idComunitario=" + idComunitario + " ]";
    }
    
}
