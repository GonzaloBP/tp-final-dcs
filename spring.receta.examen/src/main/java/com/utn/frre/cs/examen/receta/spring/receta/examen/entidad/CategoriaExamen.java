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
 * Categoria examen: Representa la categoria a la que puede pertenecer un examen
 * 
 * @author Gonza
 * @version 1.0
 */

@Entity
@Table(name = "Categoria_Examen")
public class CategoriaExamen {

	/**
	 * Es el id que identifica un tipo examen en particular
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_EXAMEN")
	private Long cod_examen;

	/**
	 * Es la descripcion del tipo de examen
	 */

	private String descripcionExamen;

	/**
	 * Conjunto de estudios que pertenecen a esta categoria de examen
	 */

	@OneToMany(mappedBy = "categoriaExamen")
	private Set<CategoriaDatosExamen> categoriaDatosExamen;

	
	@ManyToOne
	@JoinColumn(name="id_historiaclinica", nullable=false)
	private Internacion internacion;
	
	/**
	 * Constructor por defecto de CategoriaExamen
	 */

	public CategoriaExamen() {

	}

	/**
	 * Constructor necesario para realizar un insert (id se autogenera)
	 */

	public CategoriaExamen(String descripcionExamen) {
		super();
		this.descripcionExamen = descripcionExamen;
	}

	/**
	 * Constructor necesario para realizar un update
	 */

	public CategoriaExamen(Long cod_examen, String descripcionExamen) {
		super();
		this.cod_examen = cod_examen;
		this.descripcionExamen = descripcionExamen;
	}

	// Getters/Setters --------------------------------------------------------

	public Set<CategoriaDatosExamen> getCatDatosExamen() {
		return categoriaDatosExamen;
	}

	public void setCatDatosExamen(Set<CategoriaDatosExamen> catDatosExamen) {
		this.categoriaDatosExamen = catDatosExamen;
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

	
	// metodo ToString para poder ver el resultado en la consola y hacer pruebas
	@Override
	public String toString() {
		return "CategoriaExamen [cod_examen=" + cod_examen + ", descripcionExamen=" + descripcionExamen + "]";
	}

	
	


	

	

}
