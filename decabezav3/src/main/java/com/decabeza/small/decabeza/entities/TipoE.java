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
@Table(name = "tblTipoE", catalog = "DBCalido", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoE.findAll", query = "SELECT t FROM TipoE t"),
    @NamedQuery(name = "TipoE.findByIdTipoE", query = "SELECT t FROM TipoE t WHERE t.idTipoE = :idTipoE"),
    @NamedQuery(name = "TipoE.findByNombre", query = "SELECT t FROM TipoE t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TipoE.findByTipo", query = "SELECT t FROM TipoE t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "TipoE.findByDescripcion", query = "SELECT t FROM TipoE t WHERE t.descripcion = :descripcion")})
public class TipoE implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoE")
    private Integer idTipoE;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoEId", fetch = FetchType.LAZY)
    private List<Evidencia> evidenciaList;

    public TipoE() {
    }

    public TipoE(Integer idTipoE) {
        this.idTipoE = idTipoE;
    }

    public TipoE(Integer idTipoE, String nombre, String descripcion) {
        this.idTipoE = idTipoE;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoE() {
        return idTipoE;
    }

    public void setIdTipoE(Integer idTipoE) {
        this.idTipoE = idTipoE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Evidencia> getEvidenciaList() {
        return evidenciaList;
    }

    public void setEvidenciaList(List<Evidencia> evidenciaList) {
        this.evidenciaList = evidenciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoE != null ? idTipoE.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoE)) {
            return false;
        }
        TipoE other = (TipoE) object;
        if ((this.idTipoE == null && other.idTipoE != null) || (this.idTipoE != null && !this.idTipoE.equals(other.idTipoE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.decabeza.small.decabeza.entities.TipoE[ idTipoE=" + idTipoE + " ]";
    }
    
}
