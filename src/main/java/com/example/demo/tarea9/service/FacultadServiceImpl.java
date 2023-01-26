package com.example.demo.tarea9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tarea9.modelo.Facultad;
import com.example.demo.tarea9.repository.IFacultadRepo;

@Service
public class FacultadServiceImpl implements IFacultadService {

	@Autowired
	private IFacultadRepo facultadRepo;
	
	@Override
	public void ingresar(Facultad facultad) {
		// TODO Auto-generated method stub
		this.facultadRepo.insertar(facultad);
	}

	@Override
	public void modificar(Facultad facultad) {
		// TODO Auto-generated method stub
		this.facultadRepo.actualizar(facultad);
	}

	@Override
	public Facultad buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.facultadRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.facultadRepo.eliminar(id);
	}

}
