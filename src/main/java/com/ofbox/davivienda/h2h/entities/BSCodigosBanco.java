/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ofbox.davivienda.h2h.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "BS_CodigosBanco", schema = "dbo")
@NamedQuery(name = "BSCodigosBanco.findAll", query = "SELECT b FROM BSCodigosBanco b")
@Getter
@Setter
public class BSCodigosBanco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdCodigoBanco")
    private Long idCodigoBanco;
    @Basic(optional = false)
    @Column(name = "NombreBanco")
    private String nombreBanco;
    @Basic(optional = false)
    @Column(name = "CodigoBanco")
    private String codigoBanco;
    @Basic(optional = false)
    @Column(name = "CodigoUNI")
    private int codigoUNI;
    @Basic(optional = false)
    @Column(name = "CodigoTransfer")
    private int codigoTransfer;
    @JoinColumn(name = "IdRedOperacion", referencedColumnName = "IdRedOperacion")
    @ManyToOne(optional = false)
    private BSRedOperacionBanco idRedOperacion;
}
