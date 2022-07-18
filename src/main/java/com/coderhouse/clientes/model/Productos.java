package com.coderhouse.clientes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="PRODUCTOS")
public class Productos {


    //Creo las columnas
    @Column(name = "IdPRODUCTO")
    @Id
    private long Idproducto;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "CANTIDAD")
    private String cantidad;
    @Column(name = "PRECIO")
    private Date precio;

    //Constructor

    public Productos() {
    }

    public Productos(long idproducto, String codigo, String cantidad, Date precio) {
        this.Idproducto = Idproducto;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    //Getters and Setters

    public long getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(long idproducto) {
        Idproducto = Idproducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Date getPrecio() {
        return precio;
    }

    public void setPrecio(Date precio) {
        this.precio = precio;
    }
}
