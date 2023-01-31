package com.example.demo.tarea11.modelo;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo { // PRINCIPAL

	@Id
	@SequenceGenerator(name="vehi_seq", sequenceName = "vehi_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_seq")
	@Column(name="vehi_id")
	private Integer id;
	@Column(name="vehi_marca")
	private String marca;
	@Column(name="vehi_placa")
	private String placa;
	@Column(name="vehi_anio")
	private LocalDateTime anio;
	@Column(name="vehi_modelo")
	private String modelo;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="vehiculo_cliente",
				joinColumns = @JoinColumn(name="vecl_id_vehiculo"),
				inverseJoinColumns = @JoinColumn(name="vecl_id_cliente"))
	private Set<Cliente> clientes;
	
	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", marca=" + marca + ", placa=" + placa + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public LocalDateTime getAnio() {
		return anio;
	}

	public void setAnio(LocalDateTime anio) {
		this.anio = anio;
	}

	public String getModelo() {
		return modelo; 
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
}
