package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Categoria_Antecedente")
public class CategoriaAntecedente {

	/**
	 * Es el id que identifica de  CategoriaAntecedente
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CATEGORIA_ANTECEDENTE")
	private Long id_categoria_antecendente;

	/**
	 * Es la descripcion de la categoria de Antecedente
	 */

	private String descripcionCategoriaAntecedente;
	
	@OneToMany(mappedBy="categoriaAntecedente")
	private Set<TipoAntecedente> tipoAntecedente;

	
	
	public CategoriaAntecedente(){
		
	}
	
	
	public CategoriaAntecedente(Long id_categoria_antecendente, String descripcionCategoriaAntecedente,
			Set<TipoAntecedente> tipoAntecedente) {
		super();
		this.id_categoria_antecendente = id_categoria_antecendente;
		this.descripcionCategoriaAntecedente = descripcionCategoriaAntecedente;
		this.tipoAntecedente = tipoAntecedente;
	}

	public CategoriaAntecedente(String descripcionCategoriaAntecedente, Set<TipoAntecedente> tipoAntecedente) {
		super();
		this.descripcionCategoriaAntecedente = descripcionCategoriaAntecedente;
		this.tipoAntecedente = tipoAntecedente;
	}


	public Long getId_categoria_antecendente() {
		return id_categoria_antecendente;
	}


	public void setId_categoria_antecendente(Long id_categoria_antecendente) {
		this.id_categoria_antecendente = id_categoria_antecendente;
	}


	public String getDescripcionCategoriaAntecedente() {
		return descripcionCategoriaAntecedente;
	}


	public void setDescripcionCategoriaAntecedente(String descripcionCategoriaAntecedente) {
		this.descripcionCategoriaAntecedente = descripcionCategoriaAntecedente;
	}


	public Set<TipoAntecedente> getTipoAntecedente() {
		return tipoAntecedente;
	}


	public void setTipoAntecedente(Set<TipoAntecedente> tipoAntecedente) {
		this.tipoAntecedente = tipoAntecedente;
	}


	@Override
	public String toString() {
		return "CategoriaAntecedente [id_categoria_antecendente=" + id_categoria_antecendente
				+ ", descripcionCategoriaAntecedente=" + descripcionCategoriaAntecedente + "]";
	}
	
    
	
	
}
