package com.example.demo.tarea10.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="identificacion")
public class Identificacion {

	@Id
	@SequenceGenerator(name="iden_seq", sequenceName = "iden_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "iden_seq")
	@Column(name="iden_id")
	private Integer id;
	@Column(name="iden_cedula")
	private String cedula;
	@Column(name="iden_nombre")
	private String nombre;
	@Column(name="iden_apellido")
	private String apellido;
	@Column(name="iden_nacionalidad")
	private String nacionalidad;
	@Column(name="iden_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@OneToOne(mappedBy = "identificacion")
	private Profesor profesor;
	
	@Override
	public String toString() {
		return "Identificacion [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", nacionalidad=" + nacionalidad + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	
}
