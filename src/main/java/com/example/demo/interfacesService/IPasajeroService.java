package com.example.demo.interfacesService;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Persona;
import com.example.demo.modelo.Vuelos;

public interface IPasajeroService {
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
	public List<Persona> listarIdentificacion();
	
	

	

}
