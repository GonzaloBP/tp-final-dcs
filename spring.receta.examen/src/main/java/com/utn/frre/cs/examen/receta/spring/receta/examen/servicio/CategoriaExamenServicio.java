package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaExamen;
import com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio.CategoriaExamenSpringDataRepositorio;


@Service
public class CategoriaExamenServicio implements ICategoriaExamenServicio {

	@Autowired
	private CategoriaExamenSpringDataRepositorio categoriaExamenRepositorio;

	@Override
	public synchronized boolean addCategoriaExamen(CategoriaExamen categoriaExamen) {
		 categoriaExamenRepositorio.save(categoriaExamen);
		 return true;
		
	}

	@Override
	public CategoriaExamen getCategoriaExamen(long categoriaExamen_id) {
		 CategoriaExamen obj = categoriaExamenRepositorio.findById(categoriaExamen_id).get();
		return obj;
	}

	@Override
	public void updateCategoriaExamen(CategoriaExamen categoriaExamen) {
		categoriaExamenRepositorio.save(categoriaExamen);
		
	}

	@Override
	public void deleteCategoriaExamen(int categoriaExamen_id) {
		categoriaExamenRepositorio.delete(getCategoriaExamen(categoriaExamen_id));
		
	}

	@Override
	public List<CategoriaExamen> getAllCategoriaExamen() {
		 List<CategoriaExamen> list = new ArrayList<>();
		 categoriaExamenRepositorio.findAll().forEach(e -> list.add(e));
		 return list;
	}
}
