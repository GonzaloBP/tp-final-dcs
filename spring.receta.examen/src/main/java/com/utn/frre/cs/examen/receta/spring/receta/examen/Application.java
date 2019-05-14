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
		logger.info("\n buscar info de TramiteReceta id 3 \n ->{}",servicioTramite.getTramiteReceta(1012L));
		
		//pk(id) de Tramite receta es autogenerado en insertion no es neceario ponerlo
		TramiteReceta nuevoTramiteReceta = new TramiteReceta( 304, 5, 302, new Date(), "cada 1  hora", 101, 201);
		logger.info("\n nueva insercion de TramiteReceta \n ->{}",servicioTramite.addTramiteReceta(nuevoTramiteReceta));
     		
		logger.info("\n recuperar toda la info de TramiteReceta   \n ->{}",servicioTramite.getAllTramiteReceta());	
		
		// BORRADO DE TRAMITE RECETA
		 //servicioTramite.deleteTramiteReceta(1011);
		 
		 logger.info("\n ver resultado del borrado   \n ->{}",servicioTramite.getAllTramiteReceta());
		 
		 // ACTUALIZACION de tramite receta
		 TramiteReceta unTramiteReceta = servicioTramite.getTramiteReceta(1015L);
		 unTramiteReceta.setDescripcionDosis("TODO");
		 servicioTramite.updateTramiteReceta(unTramiteReceta);
		 
		 
		// Ver info recien actualizada de tramite receta
		 logger.info("\n buscar info de TramiteReceta en id 1 \n->{}",servicioTramite.getTramiteReceta(1015L));
		 
		 
		 
	
	}

}
