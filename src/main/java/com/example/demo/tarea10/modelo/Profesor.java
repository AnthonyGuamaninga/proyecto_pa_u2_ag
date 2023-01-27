package com.example.demo.tarea10.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor {
	
	@Id
	@SequenceGenerator(name="prof_seq", sequenceName = "prof_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prof_seq")
	@Column(name="prof_id")
	private Integer id;
	@Column(name="prof_titulo")
	private String titulo;
	@Column(name="prof_salario")
	private BigDecimal salario;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="prof_id_identificacion")
	private Identificacion identificacion;
	
	@Override
	public String toString() {
		return "Profesor [id=" + id + ", titulo=" + titulo + ", salario=" + salario + "]";
	}

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Identificacion getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Identificacion identificacion) {
		this.identificacion = identificacion;
	}
	
	
}
