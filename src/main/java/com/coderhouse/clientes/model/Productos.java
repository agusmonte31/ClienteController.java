package com.coderhouse.clientes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

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
    private String precio;

    //Constructor

    public Productos() {
    }

    public Productos(long idproducto, String codigo, String cantidad, String precio) {
        Idproducto = idproducto;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public static void save(Productos productos) {
    }

    //Getters and Setters


    public long getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(long idproducto) {
        Idproducto = idproducto;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}



