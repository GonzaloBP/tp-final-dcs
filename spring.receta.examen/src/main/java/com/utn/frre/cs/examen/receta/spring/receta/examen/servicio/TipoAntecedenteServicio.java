package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TipoAntecedente;
import com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio.TipoAntecedenteSpringDataRepositorio;

/**
 * servicio que implementa las operaciones basicas get,insert,delete,update para
 * <code>TipoAntecedenteServicio</code>. cableo con TipoAntecedenteSpringDataRepositorio
 * para ayudarme a definir el comportamiento mas adecuado para esta clase
 * 
 * @author Gonza
 * @version 1.0
 */
@Service
public class TipoAntecedenteServicio {

	// Dependencies -----------------------------------------------------------

				@Autowired
				private  TipoAntecedenteSpringDataRepositorio tipoAntecedenteRepositorio;

				// Operation --------------------------------------------------------------

				
				public synchronized boolean addTipoAntecedente(TipoAntecedente tipoAntecedente ) {
					tipoAntecedenteRepositorio.save(tipoAntecedente);
					return true;

				}

				
				public TipoAntecedente getTipoAntecedente(long tipoAntecedente_id) {
					TipoAntecedente obj = tipoAntecedenteRepositorio.findById(tipoAntecedente_id).get();
					return obj;
				}

				
				public void updateTipoAntecedente(TipoAntecedente tipoAntecedente) {
					tipoAntecedenteRepositorio.save(tipoAntecedente);

				}

				
				public void deleteTipoAntecedente(int tipoAntecedente_id) {
					tipoAntecedenteRepositorio.delete(getTipoAntecedente(tipoAntecedente_id));

				}

				
				public List<TipoAntecedente> getAllTipoAntecedente() {
					List<TipoAntecedente> list = new ArrayList<>();
					tipoAntecedenteRepositorio.findAll().forEach(e -> list.add(e));
					return list;
				}
	
}
