package com.webApi.controller;



import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webApi.entity.Alumno;

@RestController
@RequestMapping("/v1")
public class AlumnoController {
	
	/*
	@Autowired
	@Qualifier("alumnoService")
	AlumnoService service;
	*/
	
	
	@GetMapping(value="/alumnos")
	public Alumno obtenerAlumnos(){
		
		Alumno alumn = new Alumno();
		alumn.setNombre("Jheisson");
		alumn.setApellido("Villafuerte");
		
		return alumn;
	}
	
	
	@GetMapping(value="/alumnos/{id}")
	public List<Alumno> ListarAlumnos(@PathVariable("id") long id){
		List<Alumno> lista = new ArrayList<>();
		Alumno alumn = new Alumno();
		try
		{
			alumn.setNombre("Jheisson");
			alumn.setApellido("Villafuerte");
			lista.add(alumn);
		}
		catch (Exception ex) {

		}
		
		
		return lista;
	}
	
	@PostMapping(value="/alumnos")
	public Alumno registrarAlumnos(@RequestBody @Valid Alumno alumn)
	{
		Alumno newAlumn = new Alumno();
		newAlumn.setNombre(alumn.getNombre());
		newAlumn.setApellido(alumn.getApellido());
		
		return newAlumn;
	}
	
	@PutMapping("/alumnos/{id}")
	public boolean ActualizarAlumno(@PathVariable("id") long id,@RequestBody @Valid Alumno alumn)
	{		
		return true;
	}
	
	@DeleteMapping("/alumnos/{id}")
	public boolean eliminarAlumno(@PathVariable("id") long id)
	{
		return true;
	}
	
}
