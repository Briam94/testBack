package com.test1.dto;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class PersonDto {
    private long identificador;

    private String apellidos;

    private String documentoCompleto;

    private String email;

    private Date fechaCreacion;

    private String nombreCompleto;

    private String nombres;

    private String numeroIdentificacion;

    private String tipoIdentificacion;

    public PersonDto() {
    }

    public PersonDto(long identificador, String apellidos, String documentoCompleto, String email,
                     Date fechaCreacion, String nombreCompleto, String nombres, String numeroIdentificacion, String tipoIdentificacion) {
        this.identificador = identificador;
        this.apellidos = apellidos;
        this.documentoCompleto = documentoCompleto;
        this.email = email;
        this.fechaCreacion = fechaCreacion;
        this.nombreCompleto = nombreCompleto;
        this.nombres = nombres;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumentoCompleto() {
        return documentoCompleto;
    }

    public void setDocumentoCompleto(String documentoCompleto) {
        this.documentoCompleto = documentoCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
}
