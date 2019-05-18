package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.Internacion;
import com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio.InternacionSpringDataRepositorio;

/**
 * servicio que implementa las operaciones basicas get,insert,delete,update para
 * <code>Internacion</code>. cableo con InternacionSpringDataRepositorio
 * para ayudarme a definir el comportamiento mas adecuado para esta clase
 * 
 * @author Gonza
 * @version 1.0
 */
@Service
public class InternacionServicio  {

	// Dependencies -----------------------------------------------------------

	@Autowired
	private InternacionSpringDataRepositorio internacionRepositorio;

	// Operation --------------------------------------------------------------

	
	public synchronized boolean addInternacion(Internacion internacion ) {
		internacionRepositorio.save(internacion);
		return true;

	}

	
	public Internacion getInternacion(long internacion_id) {
		Internacion obj = internacionRepositorio.findById(internacion_id).get();
		return obj;
	}

	
	public void updateInternacion(Internacion internacion) {
		internacionRepositorio.save(internacion);

	}

	
	public void deleteInternacion(int internacion_id) {
		internacionRepositorio.delete(getInternacion(internacion_id));

	}

	
	public List<Internacion> getAllInternacion() {
		List<Internacion> list = new ArrayList<>();
		internacionRepositorio.findAll().forEach(e -> list.add(e));
		return list;
	}

}
