package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;


 
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaExamen;
import com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio.CategoriaExamenSpringDataRepositorio;

/**
 * RestController que implementa las operaciones basicas get,insert,delete,update para
 * <code>CategoriaExamen</code>. cableo con CategoriaExamenSpringDataRepositorio
 * para ayudarme a definir el comportamiento mas adecuado para esta clase
 * 
 * ("Conjunto de operaciones para Buscar, Crear, Actualizar y Eliminar CategoriaExamen")
 * 
 * @author Gonza
 * @version 1.0
 */
@RestController
@RequestMapping("/api/examen/categoriaExamen")
public class CategoriaExamenServicio  {

	// Dependencies -----------------------------------------------------------

	@Autowired
	private CategoriaExamenSpringDataRepositorio categoriaExamenRepositorio;

	// Operation --------------------------------------------------------------
	
	@GetMapping()
	public Page<CategoriaExamen> getPage(Pageable pageable) {
		return categoriaExamenRepositorio.findAll(pageable);
	}
	
	/**
	 * retorna una categoria de examen segun su id
	 * 
	 */
	@GetMapping("/{id}")
	public ResponseEntity<CategoriaExamen> findById(@PathVariable Long id) {
		Optional<CategoriaExamen> opt = categoriaExamenRepositorio.findById(id);
		if (opt.isPresent())
			return ResponseEntity.ok(opt.get());
		return ResponseEntity.notFound().build();
	}
	
	/**
	 * crea una categoria de examen 
	 * 
	 */
	@PostMapping()
	public ResponseEntity<CategoriaExamen> create(@Valid @RequestBody CategoriaExamen createRequest){
		return ResponseEntity.ok(categoriaExamenRepositorio.save(createRequest));
	}
	
	/**
	 * actualiza una categoria de examen 
	 * 
	 */
	
	@PutMapping()
	public ResponseEntity<CategoriaExamen> update(@Valid @RequestBody CategoriaExamen updateRequest) {
		boolean exists = categoriaExamenRepositorio.existsById(updateRequest.getCod_examen());
		if (exists) {
			return ResponseEntity.ok(categoriaExamenRepositorio.save(updateRequest));
		}
		return ResponseEntity.notFound().build();
	}
	
	/**
	 * borra una categoria de examen segun un id 
	 * 
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		Optional<CategoriaExamen> opt = categoriaExamenRepositorio.findById(id);
		if (opt.isPresent()) {
			categoriaExamenRepositorio.delete(opt.get());
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
	
	
	
	
}
