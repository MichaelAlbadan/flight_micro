package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.interfaces.IPasajero;
import com.example.demo.interfaces.IVuelos;
import com.example.demo.interfacesService.IPasajeroService;
import com.example.demo.interfacesService.IVuelosService;
import com.example.demo.modelo.Persona;
import com.example.demo.modelo.Vuelos;

@Service
public class VuelosService implements IVuelosService {

	@Autowired
	private IVuelos data;

	@Override
	public List<Vuelos> listarVuelo() {
		return (List<Vuelos>) data.findAll();
	}


}
