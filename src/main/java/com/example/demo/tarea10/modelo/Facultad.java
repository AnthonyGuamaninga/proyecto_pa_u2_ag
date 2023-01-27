package com.example.demo.tarea10.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="facultad")
public class Facultad {
	
	@Id
	@SequenceGenerator(name="facu_seq", sequenceName = "facu_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "facu_seq")
	@Column(name="facu_id")
	private Integer id;
	@Column(name="facu_nombre")
	private String nombre;
	@Column(name="facu_universidad")
	private String universidad;
	@Column(name="facu_ubicacion")
	private String ubicacion;
	
	@OneToMany(mappedBy = "facultad", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Estudiante> listaEstu;
	
	@Override
	public String toString() {
		return "Facultad [id=" + id + ", nombre=" + nombre + ", universidad=" + universidad + ", ubicacion=" + ubicacion
				+ "]";
	}
	
	// SET Y GET 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Estudiante> getListaEstu() {
		return listaEstu;
	}

	public void setListaEstu(List<Estudiante> listaEstu) {
		this.listaEstu = listaEstu;
	}

	
	
	
}
