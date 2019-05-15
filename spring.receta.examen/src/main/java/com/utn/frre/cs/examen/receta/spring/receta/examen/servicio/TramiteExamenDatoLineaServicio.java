package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteExamenDatoLinea;
import com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio.TramiteExamenDatoLineaSpringDataRepositorio;

@Service
public class TramiteExamenDatoLineaServicio implements ITramiteExamenDatoLineaServicio {

	@Autowired
	private TramiteExamenDatoLineaSpringDataRepositorio tramiteExamenDatoLineaRepositorio;

	@Override
	public synchronized boolean addTramiteExamenDatoLinea(TramiteExamenDatoLinea tramiteExamenDatoLinea) {
		 tramiteExamenDatoLineaRepositorio.save(tramiteExamenDatoLinea);
		 return true;
		
	}

	@Override
	public TramiteExamenDatoLinea getTramiteExamenDatoLinea(long tramiteExamenDatoLinea_id) {
		 TramiteExamenDatoLinea obj = tramiteExamenDatoLineaRepositorio.findById(tramiteExamenDatoLinea_id).get();
		return obj;
	}

	@Override
	public void updateTramiteExamenDatoLinea(TramiteExamenDatoLinea tramiteExamenDatoLinea) {
		tramiteExamenDatoLineaRepositorio.save(tramiteExamenDatoLinea);
		
	}

	@Override
	public void deleteTramiteExamenDatoLinea(int tramiteExamenDatoLinea_id) {
		tramiteExamenDatoLineaRepositorio.delete(getTramiteExamenDatoLinea(tramiteExamenDatoLinea_id));
		
	}

	@Override
	public List<TramiteExamenDatoLinea> getAllTramiteExamenDatoLinea() {
		 List<TramiteExamenDatoLinea> list = new ArrayList<>();
		 tramiteExamenDatoLineaRepositorio.findAll().forEach(e -> list.add(e));
		 return list;
	}
	
	
	
}
