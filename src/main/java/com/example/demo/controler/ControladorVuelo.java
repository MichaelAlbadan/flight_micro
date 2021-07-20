package com.example.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfacesService.IPasajeroService;
import com.example.demo.interfacesService.IVuelosService;
import com.example.demo.modelo.Persona;
import com.example.demo.modelo.Vuelos;

@Controller
@RequestMapping
public class ControladorVuelo {

	@Autowired

	private IVuelosService service;

	@GetMapping("/listarVuelos")
	public String listarVuelos(Model model) {
		List<Vuelos> vuelos = service.listarVuelo();
		model.addAttribute("vuelos", vuelos);
		return "listarVuelos";
	}

}