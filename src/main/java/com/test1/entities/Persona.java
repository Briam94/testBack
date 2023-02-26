package com.test1.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "Personas" database table.
 * 
 */
@Entity
@Table(name="Personas")
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Identificador")
	private long identificador;

	@Column(name="Apellidos")
	private String apellidos;

	@Column(name="Email")
	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name="Fecha_creacion")
	private Date fechaCreacion;


	@Column(name="Nombres")
	private String nombres;

	@Column(name="Numero_identificacion")
	private String numeroIdentificacion;

	@Column(name="Tipo_identificacion")
	private String tipoIdentificacion;

	public Persona() {
	}

	public Persona(long identificador, String apellidos,
				   String email, Date fechaCreacion, String nombres,
				   String numeroIdentificacion, String tipoIdentificacion) {
		this.identificador = identificador;
		this.apellidos = apellidos;
		this.email = email;
		this.fechaCreacion = fechaCreacion;
		this.nombres = nombres;
		this.numeroIdentificacion = numeroIdentificacion;
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public long getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(long identificador) {
		this.identificador = identificador;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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