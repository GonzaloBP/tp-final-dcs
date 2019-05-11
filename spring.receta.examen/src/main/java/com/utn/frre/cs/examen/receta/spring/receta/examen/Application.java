package com.utn.frre.cs.examen.receta.spring.receta.examen;

 

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class Application implements CommandLineRunner {

	// private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	//ExamenRepositorio repositorioExamen;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		logger.info("buscar info solicitudExamen id 3 ->{}",repositorioExamen.encontrarPorId(3));
		
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
