/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ofbox.davivienda.h2h.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ASUS
 */
@Entity(name = "BSRedOperacionBanco")
@Table(name = "BS_RedOperacionBanco",schema="dbo")
@NamedQuery(name = "BSRedOperacionBanco.findAll", query = "SELECT b FROM BSRedOperacionBanco b")
@Getter
@Setter
public class BSRedOperacionBanco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdRedOperacion")
    private Long idRedOperacion;
    @Basic(optional = false)
    @Column(name = "NombreBanco")
    private String nombreBanco;
    @Basic(optional = false)
    @Column(name = "Interpretacion")
    private String interpretacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRedOperacion")
    private List<BSCodigosBanco> bSCodigosBancoList;
    
}
