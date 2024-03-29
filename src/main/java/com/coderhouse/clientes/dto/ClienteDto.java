package com.coderhouse.clientes.dto;

public class ClienteDto {
    private long dni;
    private String nombre;
    private String apellido;
    private int edad;

    //Constructor
    public ClienteDto(long dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad = edad;
    }
public ClienteDto() {
 }

    //GettersAndSetters
    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
