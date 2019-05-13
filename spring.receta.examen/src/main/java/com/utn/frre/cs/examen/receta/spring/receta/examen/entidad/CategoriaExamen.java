package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categoria_Examen")
public class CategoriaExamen {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_EXAMEN")
	private Long cod_examen;
	
	private String descripcionExamen;

	@OneToMany(mappedBy="categoriaExamen") 
	private List<CategoriaDatosExamen> catDatosExamen = new ArrayList<>();
	
	
	public CategoriaExamen() {
		
	}
	
	
	
	//para un insert, se autoincrementa y crea solo el id
	public CategoriaExamen(String descripcionExamen) {
		super();
		this.descripcionExamen = descripcionExamen;
	}

	//para un update
	public CategoriaExamen(Long cod_examen, String descripcionExamen) {
		super();
		this.cod_examen = cod_examen;
		this.descripcionExamen = descripcionExamen;
	}

	
	

	public List<CategoriaDatosExamen> getCatDatosExamen() {
		return catDatosExamen;
	}



	public void addCategoriaDatosExamen(CategoriaDatosExamen catDatosExamen) {
		this.catDatosExamen.add(catDatosExamen);
	}

	public void removeCategoriaDatosExamen(CategoriaDatosExamen catDatosExamen) {
		this.catDatosExamen.remove(catDatosExamen);
	}
	

	public Long getCod_examen() {
		return cod_examen;
	}

	public void setCod_examen(Long cod_examen) {
		this.cod_examen = cod_examen;
	}

	public String getDescripcionExamen() {
		return descripcionExamen;
	}

	public void setDescripcionExamen(String descripcionExamen) {
		this.descripcionExamen = descripcionExamen;
	}



	@Override
	public String toString() {
		return "\nCategoriaExamen [cod_examen=" + cod_examen + ", descripcionExamen=" + descripcionExamen + "]";
	}

	
	
}
