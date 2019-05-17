package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * TramiteExamen:
 * Representa el tramite que un medico hace de una Categoria particular de examen
 * para un paciente en particular en una  internacion
 * @author Gonza
 * @version 1.0
 */
@Entity
@Table(name="Tramite_Examen")
public class TramiteExamen {

	/**
	 * Es el id que identifica un Tramite de examen que inicio un medico de una Categoria particular de examen
	 */
	
	@Id 
	@GeneratedValue
	@Column(name="IDE_SOLICITUD_EXAMEN")
	private Long ideSolicitudExamen;
	
	
	/**
	 * Representa la categoria a la que puede pertenecer un examen
	 */
	@OneToOne 
    private CategoriaExamen categoriaExamen;
    
	
	/**
	 * Representa el id que identifica al medico que inicio este tramite
	 */
	private int idePersonalMed;
	
	
	/**
	 * Representa la fecha en que se solicito este examen
	 */
	private Date fecExamen;
	
	
	/**
	 * Representa a que internacion de este paciente se refiere este tramite de examen
	 */
	private int idInternacion;
	
	/**
	 * Representa al paciente al cual este tramite de examen se refiere
	 */
	private int ideExpediente;
	
	/**
	 * Representa que un tramite puede tener multiples estudios solicitados que 
	 * pertenescan a una misma categoria de examen
	 */
	
	@OneToMany(mappedBy="tramiteExamen") 
	private List<TramiteExamenDatoLinea> tramiteExamenDatoLineas = new ArrayList<>();
	
	/**
	 * Constructor por defecto de la clase TramiteExamen
	*/
	
	public TramiteExamen() {
		
	}
	
	/**
	 * Constructor  de la clase TramiteExamen necesario para un update
	*/
	
	public TramiteExamen(Long ideSolicitudExamen, CategoriaExamen categoriaExamen, int idePersonalMed, Date fecExamen,
			int idInternacion, int ideExpediente) {
		super();
		this.ideSolicitudExamen = ideSolicitudExamen;
		this.categoriaExamen = categoriaExamen;
		this.idePersonalMed = idePersonalMed;
		this.fecExamen = fecExamen;
		this.idInternacion = idInternacion;
		this.ideExpediente = ideExpediente;
	}


	/**
	 * Constructor  de la clase TramiteExamen necesario para un insert
	*/
	
	public TramiteExamen(CategoriaExamen categoriaExamen, int idePersonalMed, Date fecExamen, int idInternacion,
			int ideExpediente) {
		super();
		this.categoriaExamen = categoriaExamen;
		this.idePersonalMed = idePersonalMed;
		this.fecExamen = fecExamen;
		this.idInternacion = idInternacion;
		this.ideExpediente = ideExpediente;
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
 
	
	// Getters y Setters -----------------------------------------------------------------------

	public Long getIdeSolicitudExamen() {
		return ideSolicitudExamen;
	}


	public void setIdeSolicitudExamen(Long ideSolicitudExamen) {
		this.ideSolicitudExamen = ideSolicitudExamen;
	}


	public CategoriaExamen getCategoriaExamen() {
		return categoriaExamen;
	}


	public void setCategoriaExamen(CategoriaExamen categoriaExamen) {
		this.categoriaExamen = categoriaExamen;
	}


	public int getIdePersonalMed() {
		return idePersonalMed;
	}


	public void setIdePersonalMed(int idePersonalMed) {
		this.idePersonalMed = idePersonalMed;
	}


	public Date getFecExamen() {
		return fecExamen;
	}


	public void setFecExamen(Date fecExamen) {
		this.fecExamen = fecExamen;
	}


	public int getIdInternacion() {
		return idInternacion;
	}


	public void setIdInternacion(int idInternacion) {
		this.idInternacion = idInternacion;
	}


	public int getIdeExpediente() {
		return ideExpediente;
	}


	public void setIdeExpediente(int ideExpediente) {
		this.ideExpediente = ideExpediente;
	}
	
	
	// metodo ToString para poder ver el resultado en la consola y hacer pruebas 
	
	
	@Override
	public String toString() {
		return "TramiteExamen [ideSolicitudExamen=" + ideSolicitudExamen + ", categoriaExamen=" + categoriaExamen
				+ ", idePersonalMed=" + idePersonalMed + ", fecExamen=" + fecExamen + ", idInternacion=" + idInternacion
				+ ", ideExpediente=" + ideExpediente + "]";
	}


	


	
	
	
	
	
}
