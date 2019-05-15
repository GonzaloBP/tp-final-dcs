package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaExamen;

@Repository
public interface ICategoriaExamenServicio {

    boolean addCategoriaExamen(CategoriaExamen categoriaExamen);
	
	CategoriaExamen getCategoriaExamen(long categoriaExamen_id);
	
	void updateCategoriaExamen(CategoriaExamen categoriaExamen);
	
	void deleteCategoriaExamen(int categoriaExamen_id);
	
	List<CategoriaExamen> getAllCategoriaExamen();
	
}
