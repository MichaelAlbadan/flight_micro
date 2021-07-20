package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Vuelos;


@Repository
public interface IVuelos extends CrudRepository<Vuelos, Integer> {

}
