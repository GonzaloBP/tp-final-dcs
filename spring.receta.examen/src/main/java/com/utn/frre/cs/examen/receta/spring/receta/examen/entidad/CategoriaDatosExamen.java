package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CategoriaDatoExamen:
 * Representa un estudio particular sobre un determinado tipo/Categoria de Examen 
 * @author Gonza
 * @version 1.0
 */


@Entity
@Table(name="Categoria_Datos_Examen")
public class CategoriaDatosExamen {
	
	/**
	 * Es el id que representa un estudio particular sobre una Categoria de Examen
	 */
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_DATO")
	private Long cod_dato;
	
	/**
	 * Es la categoria de examen a la que pertenece este  estudio particular 
	 */
	
	@ManyToOne 
	private CategoriaExamen categoriaExamen;
	
	/**
	 * Descripcion o nombre del estudio en particular
     */
	
	private String descripcionDato;

	@OneToMany(mappedBy="categoriaDatoExamen") 
	private List<TramiteExamenDatoLinea> tramiteExamenDatoLineas = new ArrayList<>();
	
	/**
	 * Es un constructor por defecto de la clase CategoriaDatosExamen
	 */
	
	public CategoriaDatosExamen() {
		
	}
		
	
	/**
	 * Es un constructor  de la clase CategoriaDatosExamen necesario para update
	 */
	
	public CategoriaDatosExamen(Long cod_dato, CategoriaExamen categoriaExamen, String descripcionDato) {
		super();
		this.cod_dato = cod_dato;
		this.categoriaExamen = categoriaExamen;
		this.descripcionDato = descripcionDato;
	}

	/**
	 * Es un constructor  de la clase CategoriaDatosExamen necesario para insert
	 */
		
	public CategoriaDatosExamen(CategoriaExamen categoriaExamen, String descripcionDato) {
		super();
		this.categoriaExamen = categoriaExamen;
		this.descripcionDato = descripcionDato;
	}

	
	
	public List<TramiteExamenDatoLinea> getTramiteExamenDatoLineas() {
		return tramiteExamenDatoLineas;
	}

	public void addTramiteExamenDatoLineas( TramiteExamenDatoLinea  tramiteExamenDatoLineas) {
		this.tramiteExamenDatoLineas.add(tramiteExamenDatoLineas);
	}
	
	public void removeTramiteExamenDatoLineas( TramiteExamenDatoLinea  tramiteExamenDatoLineas) {
		this.tramiteExamenDatoLineas.remove(tramiteExamenDatoLineas);
	}
	

	// Getters y Setters------------------------------------------------------------
	
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
	//agrego \n para mejorar la legibilidad en consola.
	
	@Override
	public String toString() {
		return "\n CategoriaDatosExamen [cod_dato=" + cod_dato + ", categoriaExamen=" + categoriaExamen
				+ ", descripcionDato=" + descripcionDato + "] \n";
	}
	
	
	
}
