package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaDatosExamen;
import com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio.CategoriaDatosExamenSpringDataRepositorio;

@Service
public class CategoriaDatosExamenServicio implements ICategoriaDatosExamenServicio {

	@Autowired
	private CategoriaDatosExamenSpringDataRepositorio categoriaDatosExamenRepositorio;

	
	
	
	@Override
	public synchronized boolean addCategoriaDatosExamen(CategoriaDatosExamen categoriaDatosExamen) {
		 categoriaDatosExamenRepositorio.save(categoriaDatosExamen);
		 return true;
		
	}

	@Override
	public CategoriaDatosExamen getCategoriaDatosExamen(long categoriaDatosExamen_id) {
		 CategoriaDatosExamen obj = categoriaDatosExamenRepositorio.findById(categoriaDatosExamen_id).get();
		return obj;
	}

	@Override
	public void updateCategoriaDatosExamen(CategoriaDatosExamen categoriaDatosExamen) {
		categoriaDatosExamenRepositorio.save(categoriaDatosExamen);
		
	}

	@Override
	public void deleteCategoriaDatosExamen(int categoriaDatosExamen_id) {
		categoriaDatosExamenRepositorio.delete(getCategoriaDatosExamen(categoriaDatosExamen_id));
		
	}

	@Override
	public List<CategoriaDatosExamen> getAllCategoriaDatosExamen() {
		 List<CategoriaDatosExamen> list = new ArrayList<>();
		 categoriaDatosExamenRepositorio.findAll().forEach(e -> list.add(e));
		 return list;
	}
	

	
	
	
}