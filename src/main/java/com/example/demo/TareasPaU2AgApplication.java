package com.example.demo;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.tarea11.modelo.Cliente;
import com.example.demo.tarea11.modelo.Vehiculo;
import com.example.demo.tarea11.service.IVehiculoService;

@SpringBootApplication
public class TareasPaU2AgApplication implements CommandLineRunner{

	@Autowired
	private IVehiculoService iVehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(TareasPaU2AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// Entidad principal: Vehiculo
		// Insertar
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca("PFD-4040");
		vehiculo.setModelo("Rio5");
		vehiculo.setMarca("KIA");
		vehiculo.setAnio(LocalDateTime.of(2015, 01, 01, 00,00));
		
		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setPlaca("AFK-6930");
		vehiculo2.setModelo("A1");
		vehiculo2.setMarca("Audi");
		vehiculo2.setAnio(LocalDateTime.of(2022, 01, 01, 00,00));
		
		Set<Cliente> clientes = new HashSet<>();
		Set<Cliente> clientes2 = new HashSet<>();
		
		Cliente cliente = new Cliente();
		cliente.setCedula("1234556432");
		cliente.setNombre("Steven");
		cliente.setNumeroTelefono("0989486842");
		cliente.setFechaNacimiento(LocalDateTime.of(2003, 02, 8, 00,13));
		
		Cliente cliente2 = new Cliente();
		cliente2.setCedula("1245652343");
		cliente2.setNombre("Darius");
		cliente2.setNumeroTelefono("098923423");
		cliente2.setFechaNacimiento(LocalDateTime.of(2000, 11, 23, 10,23));
		
		Cliente cliente3 = new Cliente();
		cliente3.setCedula("33443543521");
		cliente3.setNombre("Katharina");
		cliente3.setNumeroTelefono("098453454");
		cliente3.setFechaNacimiento(LocalDateTime.of(1997, 8, 29, 16,13));
		
		Cliente cliente4 = new Cliente();
		cliente4.setCedula("404040404");
		cliente4.setNombre("Brand");
		cliente4.setNumeroTelefono("0984289486");
		cliente4.setFechaNacimiento(LocalDateTime.of(1980, 02, 8, 00,13));
		
		clientes.add(cliente);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes2.add(cliente4);
		clientes2.add(cliente2);
		
		vehiculo.setClientes(clientes);	
		vehiculo2.setClientes(clientes2);
		this.iVehiculoService.crear(vehiculo);
		//this.iVehiculoService.crear(vehiculo2);
		// Buscar
		this.iVehiculoService.buscar(1);
		
		// Actualizar
		Vehiculo vehiculo3 = this.iVehiculoService.buscar(2);
		vehiculo3.setPlaca("PDZ-2032");
		this.iVehiculoService.modificar(vehiculo3);
		
		// Eliminar
		this.iVehiculoService.eliminar(2);
		
	}

}
