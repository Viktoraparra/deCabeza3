/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decabeza.small.decabeza.entities;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author viktorius
 */
@Entity
@Table(name = "tblDonante", catalog = "DBCalido", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Donante.findAll", query = "SELECT d FROM Donante d"),
    @NamedQuery(name = "Donante.findByIdDonante", query = "SELECT d FROM Donante d WHERE d.idDonante = :idDonante"),
    @NamedQuery(name = "Donante.findByIdentificador", query = "SELECT d FROM Donante d WHERE d.identificador = :identificador"),
    @NamedQuery(name = "Donante.findByRazonSocial", query = "SELECT d FROM Donante d WHERE d.razonSocial = :razonSocial"),
    @NamedQuery(name = "Donante.findByCorreo", query = "SELECT d FROM Donante d WHERE d.correo = :correo"),
    @NamedQuery(name = "Donante.findByTelefono", query = "SELECT d FROM Donante d WHERE d.telefono = :telefono"),
    @NamedQuery(name = "Donante.findByDireccion", query = "SELECT d FROM Donante d WHERE d.direccion = :direccion")})
public class Donante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDonante")
    private Integer idDonante;
    @Basic(optional = false)
    @Column(name = "identificador")
    private String identificador;
    @Basic(optional = false)
    @Column(name = "razonSocial")
    private String razonSocial;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @JoinColumn(name = "donacionId", referencedColumnName = "idDonacion")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Donacion donacionId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "donanteId", fetch = FetchType.LAZY)
    private List<Comunitario> comunitarioList;

    public Donante() {
    }

    public Donante(Integer idDonante) {
        this.idDonante = idDonante;
    }

    public Donante(Integer idDonante, String identificador, String razonSocial, String correo, String telefono, String direccion) {
        this.idDonante = idDonante;
        this.identificador = identificador;
        this.razonSocial = razonSocial;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Integer getIdDonante() {
        return idDonante;
    }

    public void setIdDonante(Integer idDonante) {
        this.idDonante = idDonante;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Donacion getDonacionId() {
        return donacionId;
    }

    public void setDonacionId(Donacion donacionId) {
        this.donacionId = donacionId;
    }

    @XmlTransient
    public List<Comunitario> getComunitarioList() {
        return comunitarioList;
    }

    public void setComunitarioList(List<Comunitario> comunitarioList) {
        this.comunitarioList = comunitarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDonante != null ? idDonante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donante)) {
            return false;
        }
        Donante other = (Donante) object;
        if ((this.idDonante == null && other.idDonante != null) || (this.idDonante != null && !this.idDonante.equals(other.idDonante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.decabeza.small.decabeza.entities.Donante[ idDonante=" + idDonante + " ]";
    }
    
}
