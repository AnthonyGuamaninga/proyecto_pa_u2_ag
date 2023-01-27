package com.example.demo.tarea10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tarea10.modelo.Identificacion;
import com.example.demo.tarea10.repository.IIdentificacionRepo;

@Service
public class IdentificacionServiceImpl implements IIdentificacionService {

	@Autowired
	private IIdentificacionRepo identificacionRepo;
	
	@Override
	public void registrar(Identificacion identificacion) {
		// TODO Auto-generated method stub
		this.identificacionRepo.insertar(identificacion);
	}

	@Override
	public void modificar(Identificacion identificacion) {
		// TODO Auto-generated method stub
		this.identificacionRepo.actualizar(identificacion);
	}

	@Override
	public Identificacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.identificacionRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.identificacionRepo.eliminar(id);
	}

}
