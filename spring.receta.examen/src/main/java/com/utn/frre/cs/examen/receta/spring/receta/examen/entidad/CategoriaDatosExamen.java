package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CategoriaDatoExamen: Representa un estudio particular sobre un determinado
 * tipo/Categoria de Examen
 * 
 * @author Gonza
 * @version 1.0
 */

@Entity
@Table(name = "Categoria_Datos_Examen")
public class CategoriaDatosExamen {

	/**
	 * Es el id que representa un estudio particular sobre una Categoria de Examen
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_DATO")
	private Long cod_dato;

	/**
	 * Es la categoria de examen a la que pertenece este estudio particular
	 */

	@ManyToOne
	@JoinColumn(name = "cod_examen", nullable = false)
	private CategoriaExamen categoriaExamen;

	/**
	 * Descripcion o nombre del estudio en particular
	 */

	private String descripcionDato;

	/**
	 * Representa que un estudio puede haber sido solicitado en diferentes solicitudes de examen 
	 * 
	 */
	@OneToMany(mappedBy = "categoriaDatoExamen")
	private Set<TramiteExamenDatoLinea> tramiteExamenDatoLinea;

	/**
	 * Es un constructor por defecto de la clase CategoriaDatosExamen
	 */

	public CategoriaDatosExamen() {

	}

	/**
	 * Es un constructor de la clase CategoriaDatosExamen necesario para update
	 */

	public CategoriaDatosExamen(Long cod_dato, CategoriaExamen categoriaExamen, String descripcionDato) {
		super();
		this.cod_dato = cod_dato;
		this.categoriaExamen = categoriaExamen;
		this.descripcionDato = descripcionDato;
	}

	/**
	 * Es un constructor de la clase CategoriaDatosExamen necesario para insert
	 */

	public CategoriaDatosExamen(CategoriaExamen categoriaExamen, String descripcionDato) {
		super();
		this.categoriaExamen = categoriaExamen;
		this.descripcionDato = descripcionDato;
	}

	// Getters y Setters------------------------------------------------------------

	public Set<TramiteExamenDatoLinea> getTramiteExamenDatoLinea() {
		return tramiteExamenDatoLinea;
	}

	public void setTramiteExamenDatoLinea(Set<TramiteExamenDatoLinea> tramiteExamenDatoLinea) {
		this.tramiteExamenDatoLinea = tramiteExamenDatoLinea;
	}

	public Long getCod_dato() {
		return cod_dato;
	}

	public void setCod_dato(Long cod_dato) {
		this.cod_dato = cod_dato;
	}

	public CategoriaExamen getCategoriaExamen() {
		return categoriaExamen;
	}

	public void setCategoriaExamen(CategoriaExamen categoriaExamen) {
		this.categoriaExamen = categoriaExamen;
	}

	public String getDescripcionDato() {
		return descripcionDato;
	}

	public void setDescripcionDato(String descripcionDato) {
		this.descripcionDato = descripcionDato;
	}

	
	// metodo ToString para poder ver el resultado en la consola y hacer pruebas
	
	@Override
	public String toString() {
		return "CategoriaDatosExamen [cod_dato=" + cod_dato + ", categoriaExamen=" + categoriaExamen
				+ ", descripcionDato=" + descripcionDato + "]";
	}

	
	
	
	

	
	
}
