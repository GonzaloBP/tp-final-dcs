package com.utn.frre.cs.examen.receta.spring.receta.examen;

 

 
import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteReceta;
import com.utn.frre.cs.examen.receta.spring.receta.examen.servicio.TramiteRecetaServicio;






@SpringBootApplication
public class Application implements CommandLineRunner {

	 private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	TramiteRecetaServicio servicioTramite;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// get info de TramiteReceta la base de datos
		logger.info("\n buscar info de TramiteReceta en id 1 \n->{}",servicioTramite.getTramiteReceta(1001L));
		logger.info("\n buscar info de TramiteReceta id 2 \n->{}",servicioTramite.getTramiteReceta(1002L));
		logger.info("\n buscar info de TramiteReceta id 3 \n ->{}",servicioTramite.getTramiteReceta(1003L));
		
		//pk(id) de Tramite receta es autogenerado en insertion no es neceario ponerlo
		TramiteReceta nuevoTramiteReceta = new TramiteReceta( 302, 4, 301, new Date(), "cada 3 hora", 102, 201);
		logger.info("\n nueva insercion de TramiteReceta \n ->{}",servicioTramite.addTramiteReceta(nuevoTramiteReceta));
			
		logger.info("\n recuperar toda la info de TramiteReceta   \n ->{}",servicioTramite.getAllTramiteReceta());	
		
		// BORRADO DE TRAMITE RECETA
		 servicioTramite.deleteTramiteReceta(1009);
		 
		 logger.info("\n ver resultado del borrado   \n ->{}",servicioTramite.getAllTramiteReceta());
		 
		 // ACTUALIZACION de tramite receta
		 TramiteReceta unTramiteReceta = servicioTramite.getTramiteReceta(1003L);
		 unTramiteReceta.setDescripcionDosis("TODO EL DIA");
		 servicioTramite.updateTramiteReceta(unTramiteReceta);
		 
		// Ver info recien actualizada de tramite receta
		 logger.info("\n buscar info actualizada de TramiteReceta id 3 \n ->{}",servicioTramite.getTramiteReceta(1003L));
		 
		/*
		logger.info("actualiza info de solicitud de examen con id 3",
				repositorioExamen.actualizarExamen(new Examen(3, 555, 555, new Date(), 5, 5)));
		
		logger.info("buscar info solicitudExamen id 3 ->{}",repositorioExamen.encontrarPorId(3));
		
		//se autoincrementa la llave primaria (empiezo de 1) de solicitud de examen no es necesario ponerla
		logger.info("inserta info de solicitud de examen", 
				repositorioExamen.actualizarExamen(new Examen(  333, 333, new Date(), 3, 3)));
		
		logger.info("buscar info solicitudExamen id 1 (recien Insertada) ->{}",repositorioExamen.encontrarPorId(1));
		
		//borro el examen recien insertado
		repositorioExamen.borrarExamenPorId(1);
		
		logger.info("Lista info de todas solicitudExamen ->{}", repositorioExamen.encontrarTodosExamenes());
		
		//en estudio, mirar mas querry
		//  repositorioExamen.encontrarInternacionesPaciente();
		 */
	}

}
