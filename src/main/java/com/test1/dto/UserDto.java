package com.test1.dto;

import java.util.Date;

public class UserDto {

    private Date fechaCreacion;

    private Integer identificador;

    private String pass;

    private String usuario;

    public UserDto() {
    }

    public UserDto(Date fechaCreacion, Integer identificador, String pass, String usuario) {
        this.fechaCreacion = fechaCreacion;
        this.identificador = identificador;
        this.pass = pass;
        this.usuario = usuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
