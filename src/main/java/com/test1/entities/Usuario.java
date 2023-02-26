package com.test1.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "Usuario" database table.
 * 
 */
@Entity
@Table(name="Usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Column(name="Identificador")
	private Integer identificador;

	@Column(name="Pass")
	private String pass;

	@Column(name="Usuario")
	private String usuario;

	public Usuario() {
	}

	public Usuario(Date fechaCreacion, Integer identificador, String pass, String usuario) {
		this.fechaCreacion = fechaCreacion;
		this.identificador = identificador;
		this.pass = pass;
		this.usuario = usuario;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}