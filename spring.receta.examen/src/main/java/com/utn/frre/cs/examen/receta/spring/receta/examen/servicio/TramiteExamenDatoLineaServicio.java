package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteExamenDatoLinea;
import com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio.TramiteExamenDatoLineaSpringDataRepositorio;

/**
 * servicio que implementa las operaciones basicas get,insert,delete,update para
 * <code>TramiteExamenDatoLinea</code>. cableo con
 * TramiteExamenDatoLineaSpringDataRepositorio para ayudarme a definir el
 * comportamiento mas adecuado para esta clase
 * 
 * @author Gonza
 * @version 1.0
 */
@Service
public class TramiteExamenDatoLineaServicio {

	// Dependencies -----------------------------------------------------------

	@Autowired
	private TramiteExamenDatoLineaSpringDataRepositorio tramiteExamenDatoLineaRepositorio;

	// Operation --------------------------------------------------------------

	
	public synchronized boolean addTramiteExamenDatoLinea(TramiteExamenDatoLinea tramiteExamenDatoLinea) {
		tramiteExamenDatoLineaRepositorio.save(tramiteExamenDatoLinea);
		return true;

	}

	
	public TramiteExamenDatoLinea getTramiteExamenDatoLinea(long tramiteExamenDatoLinea_id) {
		TramiteExamenDatoLinea obj = tramiteExamenDatoLineaRepositorio.findById(tramiteExamenDatoLinea_id).get();
		return obj;
	}

	
	public void updateTramiteExamenDatoLinea(TramiteExamenDatoLinea tramiteExamenDatoLinea) {
		tramiteExamenDatoLineaRepositorio.save(tramiteExamenDatoLinea);

	}

	
	public void deleteTramiteExamenDatoLinea(int tramiteExamenDatoLinea_id) {
		tramiteExamenDatoLineaRepositorio.delete(getTramiteExamenDatoLinea(tramiteExamenDatoLinea_id));

	}

	
	public List<TramiteExamenDatoLinea> getAllTramiteExamenDatoLinea() {
		List<TramiteExamenDatoLinea> list = new ArrayList<>();
		tramiteExamenDatoLineaRepositorio.findAll().forEach(e -> list.add(e));
		return list;
	}

}
