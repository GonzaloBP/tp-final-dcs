package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.AntecedenteInternacion;
import com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio.AntecedenteInternacionSpringDataRepositorio;

/**
 * servicio que implementa las operaciones basicas get,insert,delete,update para
 * <code> AntecedenteInternacionServicio</code>. cableo con AntecedenteInternacionSpringDataRepositorio
 * para ayudarme a definir el comportamiento mas adecuado para esta clase
 * 
 * @author Gonza
 * @version 1.0
 */
@Service
public class  AntecedenteInternacionServicio {

	// Dependencies -----------------------------------------------------------

		@Autowired
		private  AntecedenteInternacionSpringDataRepositorio antecedenteInternacionRepositorio;

		// Operation --------------------------------------------------------------

		
		public synchronized boolean addAntecedenteInternacion(AntecedenteInternacion antecedenteInternacion ) {
			antecedenteInternacionRepositorio.save(antecedenteInternacion);
			return true;

		}

		
		public AntecedenteInternacion getAntecedenteInternacion(long antecedenteInternacion_id) {
			AntecedenteInternacion obj = antecedenteInternacionRepositorio.findById(antecedenteInternacion_id).get();
			return obj;
		}

		
		public void updateAntecedenteInternacion(AntecedenteInternacion antecedenteInternacion) {
			antecedenteInternacionRepositorio.save(antecedenteInternacion);

		}

		
		public void deleteAntecedenteInternacion(int antecedenteInternacion_id) {
			antecedenteInternacionRepositorio.delete(getAntecedenteInternacion(antecedenteInternacion_id));

		}

		
		public List<AntecedenteInternacion> getAllAntecedenteInternacion() {
			List<AntecedenteInternacion> list = new ArrayList<>();
			antecedenteInternacionRepositorio.findAll().forEach(e -> list.add(e));
			return list;
		}
	
	
}
