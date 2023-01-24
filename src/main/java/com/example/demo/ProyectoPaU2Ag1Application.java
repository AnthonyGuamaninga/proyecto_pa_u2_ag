package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2Ag1Application implements CommandLineRunner{

	@Autowired
	private IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Ag1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// INSERTAR Hotel (CREATE)
		Hotel hotel = new Hotel();
		hotel.setNombre("Finlandia");
		hotel.setDireccion("Amazonas");
		
		Habitacion habitacion = new Habitacion();
		habitacion.setNumero("A03");
		habitacion.setHotel(hotel);
		
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setNumero("A02");
		habitacion2.setHotel(hotel);
		
		List<Habitacion> habitaciones= new ArrayList<>();
		habitaciones.add(habitacion);
		habitaciones.add(habitacion2);
		
		hotel.setHabitaciones(habitaciones);
		this.hotelService.registrar(hotel);
		
		// BUSCAR hotel (READ)
		this.hotelService.buscar(1);
		
		// ACTUALIZAR hotel (UPDATE)
		Hotel hotelModificado = this.hotelService.buscar(1);
		hotelModificado.setDireccion("Naciones Unidas");
		//this.hotelService.modificar(hotelModificado);
		
		// ELIMINAR hotel (DELETE)
		this.hotelService.eliminar(1);
		
	}

}
