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

@Entity
@Table(name = "Tipo_Antecedente")
public class TipoAntecedente {

	/**
	 * Es el id que identifica un  TipoAntecedente
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_ANTECEDENTE")
	private Long id_tipo_antecendente;
	
	
	/**
	 * Es la descripcion del tipo de Antecedente
	 */

	private String descripcionTipoAntecedente;
	
	 @OneToMany(mappedBy="tipoAntecedente")
	 private Set<ElementoAntecedente> elementoAntecedente;	
	
	
	@ManyToOne
	@JoinColumn(name="id_categoria_antecendente", nullable=false)
	private CategoriaAntecedente categoriaAntecedente;
	
	
	public TipoAntecedente() {
		
	}


	public TipoAntecedente(Long id_tipo_antecendente, String descripcionTipoAntecedente,
			Set<ElementoAntecedente> elementoAntecedente, CategoriaAntecedente categoriaAntecedente) {
		super();
		this.id_tipo_antecendente = id_tipo_antecendente;
		this.descripcionTipoAntecedente = descripcionTipoAntecedente;
		this.elementoAntecedente = elementoAntecedente;
		this.categoriaAntecedente = categoriaAntecedente;
	}


	public TipoAntecedente(String descripcionTipoAntecedente, Set<ElementoAntecedente> elementoAntecedente,
			CategoriaAntecedente categoriaAntecedente) {
		super();
		this.descripcionTipoAntecedente = descripcionTipoAntecedente;
		this.elementoAntecedente = elementoAntecedente;
		this.categoriaAntecedente = categoriaAntecedente;
	}


	public Long getId_tipo_antecendente() {
		return id_tipo_antecendente;
	}


	public void setId_tipo_antecendente(Long id_tipo_antecendente) {
		this.id_tipo_antecendente = id_tipo_antecendente;
	}


	public String getDescripcionTipoAntecedente() {
		return descripcionTipoAntecedente;
	}


	public void setDescripcionTipoAntecedente(String descripcionTipoAntecedente) {
		this.descripcionTipoAntecedente = descripcionTipoAntecedente;
	}


	public Set<ElementoAntecedente> getElementoAntecedente() {
		return elementoAntecedente;
	}


	public void setElementoAntecedente(Set<ElementoAntecedente> elementoAntecedente) {
		this.elementoAntecedente = elementoAntecedente;
	}


	public CategoriaAntecedente getCategoriaAntecedente() {
		return categoriaAntecedente;
	}


	public void setCategoriaAntecedente(CategoriaAntecedente categoriaAntecedente) {
		this.categoriaAntecedente = categoriaAntecedente;
	}


	// ojo con las listas/set con el toString
	@Override
	public String toString() {
		return "TipoAntecedente [id_tipo_antecendente=" + id_tipo_antecendente + ", descripcionTipoAntecedente="
				+ descripcionTipoAntecedente + ", elementoAntecedente=" + elementoAntecedente
				+ ", categoriaAntecedente=" + categoriaAntecedente + "]";
	}

	

	
	
	
	
}
