/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decabeza.small.decabeza.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author viktorius
 */
@Entity
@Table(name = "tblDonacion", catalog = "DBCalido", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Donacion.findAll", query = "SELECT d FROM Donacion d"),
    @NamedQuery(name = "Donacion.findByIdDonacion", query = "SELECT d FROM Donacion d WHERE d.idDonacion = :idDonacion"),
    @NamedQuery(name = "Donacion.findByFecha", query = "SELECT d FROM Donacion d WHERE d.fecha = :fecha"),
    @NamedQuery(name = "Donacion.findByCantidad", query = "SELECT d FROM Donacion d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "Donacion.findByProducto", query = "SELECT d FROM Donacion d WHERE d.producto = :producto"),
    @NamedQuery(name = "Donacion.findByDescripcion", query = "SELECT d FROM Donacion d WHERE d.descripcion = :descripcion")})
public class Donacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDonacion")
    private Integer idDonacion;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "producto")
    private String producto;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "donacionId", fetch = FetchType.LAZY)
    private List<Donante> donanteList;
    @JoinColumn(name = "usuarioId", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioId;

    public Donacion() {
    }

    public Donacion(Integer idDonacion) {
        this.idDonacion = idDonacion;
    }

    public Donacion(Integer idDonacion, Date fecha, int cantidad, String producto, String descripcion) {
        this.idDonacion = idDonacion;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.producto = producto;
        this.descripcion = descripcion;
    }

    public Integer getIdDonacion() {
        return idDonacion;
    }

    public void setIdDonacion(Integer idDonacion) {
        this.idDonacion = idDonacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Donante> getDonanteList() {
        return donanteList;
    }

    public void setDonanteList(List<Donante> donanteList) {
        this.donanteList = donanteList;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDonacion != null ? idDonacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donacion)) {
            return false;
        }
        Donacion other = (Donacion) object;
        if ((this.idDonacion == null && other.idDonacion != null) || (this.idDonacion != null && !this.idDonacion.equals(other.idDonacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.decabeza.small.decabeza.entities.Donacion[ idDonacion=" + idDonacion + " ]";
    }
    
}
