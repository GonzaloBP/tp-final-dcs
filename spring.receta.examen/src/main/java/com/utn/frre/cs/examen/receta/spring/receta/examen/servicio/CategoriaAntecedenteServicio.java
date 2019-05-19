package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaAntecedente;
import com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio.CategoriaAntecedenteSpringDataRepositorio;

/**
 * servicio que implementa las operaciones basicas get,insert,delete,update para
 * <code>CategoriaAntecedenteServicio</code>. cableo con CategoriaAntecedenteSpringDataRepositorio
 * para ayudarme a definir el comportamiento mas adecuado para esta clase
 * 
 * @author Gonza
 * @version 1.0
 */
@Service
public class CategoriaAntecedenteServicio {

	// Dependencies -----------------------------------------------------------

			@Autowired
			private  CategoriaAntecedenteSpringDataRepositorio categoriaAntecedenteRepositorio;

			// Operation --------------------------------------------------------------

			
			public synchronized boolean addCategoriaAntecedente(CategoriaAntecedente categoriaAntecedente ) {
				categoriaAntecedenteRepositorio.save(categoriaAntecedente);
				return true;

			}

			
			public CategoriaAntecedente getCategoriaAntecedente(long categoriaAntecedente_id) {
				CategoriaAntecedente obj = categoriaAntecedenteRepositorio.findById(categoriaAntecedente_id).get();
				return obj;
			}

			
			public void updateCategoriaAntecedente(CategoriaAntecedente categoriaAntecedente) {
				categoriaAntecedenteRepositorio.save(categoriaAntecedente);

			}

			
			public void deleteCategoriaAntecedente(int categoriaAntecedente_id) {
				categoriaAntecedenteRepositorio.delete(getCategoriaAntecedente(categoriaAntecedente_id));

			}

			
			public List<CategoriaAntecedente> getAllCategoriaAntecedente() {
				List<CategoriaAntecedente> list = new ArrayList<>();
				categoriaAntecedenteRepositorio.findAll().forEach(e -> list.add(e));
				return list;
			}
		
	
	
}
