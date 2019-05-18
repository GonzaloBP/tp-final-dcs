package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaExamen;
import com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio.CategoriaExamenSpringDataRepositorio;

/**
 * servicio que implementa las operaciones basicas get,insert,delete,update para
 * <code>CategoriaExamen</code>. cableo con CategoriaExamenSpringDataRepositorio
 * para ayudarme a definir el comportamiento mas adecuado para esta clase
 * 
 * @author Gonza
 * @version 1.0
 */
@Service
public class CategoriaExamenServicio  {

	// Dependencies -----------------------------------------------------------

	@Autowired
	private CategoriaExamenSpringDataRepositorio categoriaExamenRepositorio;

	// Operation --------------------------------------------------------------

	
	public synchronized boolean addCategoriaExamen(CategoriaExamen categoriaExamen) {
		categoriaExamenRepositorio.save(categoriaExamen);
		return true;

	}

	
	public CategoriaExamen getCategoriaExamen(long categoriaExamen_id) {
		CategoriaExamen obj = categoriaExamenRepositorio.findById(categoriaExamen_id).get();
		return obj;
	}

	
	public void updateCategoriaExamen(CategoriaExamen categoriaExamen) {
		categoriaExamenRepositorio.save(categoriaExamen);

	}

	
	public void deleteCategoriaExamen(int categoriaExamen_id) {
		categoriaExamenRepositorio.delete(getCategoriaExamen(categoriaExamen_id));

	}

	
	public List<CategoriaExamen> getAllCategoriaExamen() {
		List<CategoriaExamen> list = new ArrayList<>();
		categoriaExamenRepositorio.findAll().forEach(e -> list.add(e));
		return list;
	}
}
