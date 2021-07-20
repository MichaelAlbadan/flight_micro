package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.interfaces.IPasajero;
import com.example.demo.interfacesService.IPasajeroService;
import com.example.demo.modelo.Persona;

@Service
public class PasajeroService implements IPasajeroService {

	@Autowired
	private IPasajero data;

	@Override
	public List<Persona> listar() {
		return (List<Persona>) data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		int res = 0;
		Persona persona = data.save(p);
		if (persona.equals(null)) {
			res = 1;

		}
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}
	
	public List<Persona> listarIdentificacion() {
		return (List<Persona>) data.findAll(); 
	}
	

}
