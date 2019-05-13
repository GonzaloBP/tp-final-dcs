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



@Entity
public class CategoriaDatosExamen {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_DATO")
	private Long cod_dato;
	
	@ManyToOne 
	private CategoriaExamen categoriaExamen;
	
	private String descripcionDato;

	@OneToMany(mappedBy="categoriaDatoExamen") 
	private List<TramiteExamenDatoLinea> tramiteExamenDatoLineas = new ArrayList<>();
	
	
	public CategoriaDatosExamen() {
		
	}
		
	public CategoriaDatosExamen(Long cod_dato, CategoriaExamen categoriaExamen, String descripcionDato) {
		super();
		this.cod_dato = cod_dato;
		this.categoriaExamen = categoriaExamen;
		this.descripcionDato = descripcionDato;
	}

		
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
     
	//agrego \n para mejorar la legibilidad en consola.
	@Override
	public String toString() {
		return "\nCategoriaDatosExamen [cod_dato=" + cod_dato + ", categoriaExamen=" + categoriaExamen
				+ ", descripcionDato=" + descripcionDato + "]";
	}
	
	
	
}
