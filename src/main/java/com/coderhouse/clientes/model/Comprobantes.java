package com.coderhouse.clientes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


    @Entity
    @Table(name="COMPROBANTE")
    public class Comprobantes {


        //Creo las columnas IdCOMPROBANTE,FECHA,CANTIDAD,PRECIONETO,IMPUESTO,PRECIOTOTAL,DNI, e IDCLIENTE
        @Column(name = "IdCOMPROBANTE")
        @Id
        private long Idcomprobante;
        @Column(name = "FECHA")
        private Date fecha;
        @Column(name = "CANTIDAD")
        private String cantidad;
        @Column(name = "PRECIONETO")
        private String precioneto;
        @Column(name = "IMPUESTO")
        private String impuesto;
        @Column(name = "PRECIOTOTAL")
        private String preciototal;
        @Column(name = "DNI")
        private String dni;


        //Constructor


        public Comprobantes() {
        }

        public Comprobantes(long idcomprobante, Date fecha, String cantidad, String precioneto, String impuesto, String preciototal, String dni, String idcliente) {
            Idcomprobante = idcomprobante;
            this.fecha = fecha;
            this.cantidad = cantidad;
            this.precioneto = precioneto;
            this.impuesto = impuesto;
            this.preciototal = preciototal;
            this.dni = dni;

        }

        //Getters and Setters


        public long getIdcomprobante() {
            return Idcomprobante;
        }

        public void setIdcomprobante(long idcomprobante) {
            Idcomprobante = idcomprobante;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getCantidad() {
            return cantidad;
        }

        public void setCantidad(String cantidad) {
            this.cantidad = cantidad;
        }

        public String getPrecioneto() {
            return precioneto;
        }

        public void setPrecioneto(String precioneto) {
            this.precioneto = precioneto;
        }

        public String getImpuesto() {
            return impuesto;
        }

        public void setImpuesto(String impuesto) {
            this.impuesto = impuesto;
        }

        public String getPreciototal() {
            return preciototal;
        }

        public void setPreciototal(String preciototal) {
            this.preciototal = preciototal;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }



        @Override
        public String toString() {
            return
                    "Comprobante{" +
                            "IdComprobante=" + Idcomprobante +
                            "Fecha=" + fecha +
                            "Cantidad=" + cantidad +
                            "PrecioNeto=" + precioneto +
                            "Impuesto=" + impuesto +
                            "PrecioTotal=" + preciototal +
                            "DNI=" + dni +
                            '}';
        }
    }