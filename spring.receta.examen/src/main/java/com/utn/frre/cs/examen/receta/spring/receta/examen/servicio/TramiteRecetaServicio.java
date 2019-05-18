package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteReceta;
import com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio.TramiteRecetaSpringDataRepositorio;

/**
 * servicio que implementa las operaciones basicas get,insert,delete,update para
 * <code>TramiteReceta</code>. cableo con TramiteRecetaSpringDataRepositorio
 * para ayudarme a definir el comportamiento mas adecuado para esta clase
 * 
 * @author Gonza
 * @version 1.0
 */
@Service
public class TramiteRecetaServicio  {

	// Dependencies -----------------------------------------------------------

	@Autowired
	private TramiteRecetaSpringDataRepositorio tramiteRecetaRepositorio;

	// Operation --------------------------------------------------------------

	
	public synchronized boolean addTramiteReceta(TramiteReceta tramiteReceta) {
		tramiteRecetaRepositorio.save(tramiteReceta);
		return true;

	}

	
	public TramiteReceta getTramiteReceta(long tramiteReceta_id) {
		TramiteReceta obj = tramiteRecetaRepositorio.findById(tramiteReceta_id).get();
		return obj;
	}

	
	public void updateTramiteReceta(TramiteReceta tramiteReceta) {
		tramiteRecetaRepositorio.save(tramiteReceta);

	}

	
	public void deleteTramiteReceta(int tramiteReceta_id) {
		tramiteRecetaRepositorio.delete(getTramiteReceta(tramiteReceta_id));

	}

	
	public List<TramiteReceta> getAllTramiteReceta() {
		List<TramiteReceta> list = new ArrayList<>();
		tramiteRecetaRepositorio.findAll().forEach(e -> list.add(e));
		return list;
	}

}
