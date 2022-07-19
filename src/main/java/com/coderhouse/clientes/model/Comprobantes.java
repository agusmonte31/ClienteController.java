package com.coderhouse.clientes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


    @Entity
    @Table(name="COMPROBANTES")
    public class Comprobantes {


        //Creo las columnas IdCOMPROBANTE,FECHA,CANTIDAD,PRECIONETO,IMPUESTO,PRECIOTOTAL
        @Column(name = "IdCOMPROBANTE")
        @Id
        private long Idcomprobante;
        @Column(name = "FECHA_COMPROBANTE")
        private Date fecha_comprobante;
        @Column(name = "CANTIDAD_COMPROBANTE")
        private String cantidad_comprobante;
        @Column(name = "PRECIONETO_COMPROBANTE")
        private String precioneto_comprobante;
        @Column(name = "PRECIOTOTAL_COMPROBANTE")
        private String preciototal_comprobante;

        //Constructor


        public Comprobantes() {
        }

        public Comprobantes(long idcomprobante, Date fecha_comprobante, String cantidad_comprobante, String precioneto_comprobante, String preciototal_comprobante) {
            Idcomprobante = idcomprobante;
            this.fecha_comprobante = fecha_comprobante;
            this.cantidad_comprobante = cantidad_comprobante;
            this.precioneto_comprobante= precioneto_comprobante;
            this.preciototal_comprobante = preciototal_comprobante;

        }

        //Getters and Setters


        public long getIdcomprobante() {
            return Idcomprobante;
        }

        public void setIdcomprobante(long idcomprobante) {
            Idcomprobante = idcomprobante;
        }

        public Date getFecha_comprobante() {
            return fecha_comprobante;
        }

        public void setFecha_comprobante(Date fecha_comprobante) {
            this.fecha_comprobante = fecha_comprobante;
        }

        public String getCantidad_comprobante() {
            return cantidad_comprobante;
        }

        public void setCantidad_comprobante(String cantidad_comprobante) {
            this.cantidad_comprobante = cantidad_comprobante;
        }

        public String getPrecioneto_comprobante() {
            return precioneto_comprobante;
        }

        public void setPrecioneto_comprobante(String precioneto_comprobante) {
            this.precioneto_comprobante = precioneto_comprobante;
        }

        public String getPreciototal_comprobante() {
            return preciototal_comprobante;
        }

        public void setPreciototal_comprobante(String preciototal_comprobante) {
            this.preciototal_comprobante = preciototal_comprobante;
        }

        @Override
        public String toString() {
            return
                    "Comprobante{" +
                            "IdComprobante=" + Idcomprobante +
                            "Fecha=" + fecha_comprobante +
                            "Cantidad=" + cantidad_comprobante +
                            "PrecioNeto=" + precioneto_comprobante +
                            "PrecioTotal=" + preciototal_comprobante +
                            '}';
        }
    }