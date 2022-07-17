package com.coderhouse.clientes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="CLIENTE")
public class Cliente {


    //Creo las columnas DNI,NOMBRE,APELLIDO y FECHA DE NACIMIENTO
    @Column(name = "DNI")
    @Id
    private long dni;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "FECHANACIMIENTO"
    )
    private Date fechaNacimiento;

    //Constructor


    public Cliente() {
    }

    public Cliente(long dni,String nombre, String apellido, Date fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;

    }

    //Getters and Setters
    public long getDni() {return dni;}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento= fechaNacimiento;
    }



    @Override
    public String toString() {
        return
                "Cliente{" +
                        "dni="+ dni +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fecha de nacimiento=" + fechaNacimiento +
                '}';
    }
}



