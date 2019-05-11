package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Listar_todos_examenes", query="select p from Examen p")
@NamedQuery(name="Listar_internaciones_pacientes", query="select ideExpediente, idePersonalMed from Examen p ")
public class Examen {

	@Id 
	@GeneratedValue 
	private int ideSolicitudExamen;
	
    private int codExamen;
	private int idePersonalMed;
	private Date fecExamen;
	private int idInternacion;
	private int ideExpediente;
	
	public Examen() {
		
	}

	public Examen(int codExamen, int idePersonalMed, Date fecExamen, int idInternacion, int ideExpediente) {
		super();
		this.codExamen = codExamen;
		this.idePersonalMed = idePersonalMed;
		this.fecExamen = fecExamen;
		this.idInternacion = idInternacion;
		this.ideExpediente = ideExpediente;
	}
	
	

	public Examen(int ideSolicitudExamen, int codExamen, int idePersonalMed, Date fecExamen, int idInternacion,
			int ideExpediente) {
		super();
		this.ideSolicitudExamen = ideSolicitudExamen;
		this.codExamen = codExamen;
		this.idePersonalMed = idePersonalMed;
		this.fecExamen = fecExamen;
		this.idInternacion = idInternacion;
		this.ideExpediente = ideExpediente;
	}

	public int getIdeSolicitudExamen() {
		return ideSolicitudExamen;
	}

	public void setIdeSolicitudExamen(int ideSolicitudExamen) {
		this.ideSolicitudExamen = ideSolicitudExamen;
	}

	public int getCodExamen() {
		return codExamen;
	}

	public void setCodExamen(int codExamen) {
		this.codExamen = codExamen;
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

	@Override
	public String toString() {
		return "\nExamen [ideSolicitudExamen=" + ideSolicitudExamen + ", codExamen=" + codExamen + ", idePersonalMed="
				+ idePersonalMed + ", fecExamen=" + fecExamen + ", idInternacion=" + idInternacion + ", ideExpediente="
				+ ideExpediente + "]";
	}
	
	
}
