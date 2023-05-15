package Parcial_1;

import java.util.ArrayList;

public class Examen {
	 private Profesor profesor;
	 private Alumno alumno;
	 private String fecha;
	 private static double notaAprobacion = 6;
	    
	 // Constructor
	 public Examen(Profesor profesor, Alumno alumno, String fecha, double notaAprobacion) {
	        this.profesor = profesor;
	        this.alumno = alumno;
	        this.fecha = fecha;
	        this.notaAprobacion = notaAprobacion;
	  }
	 
	    
	 // Método para imprimir todas las materias aprobadas (nota del alumno > nota de aprobación)
	 public static void imprimirMateriasAprobadas(Alumno alumno) {
	     System.out.println("Materias aprobadas:");
	     for (int i = 0; i < alumno.getNotas().length; i++) {
	          if (alumno.getNotas()[i] >= notaAprobacion) {
	              System.out.println(alumno.getMaterias()[i]);
	            }
	        }
	    }
	    
	 // Método para imprimir todas las materias que tengan una nota mayor al promedio del alumno
	 public static void imprimirMateriasConNotaMayorAlPromedio(Alumno alumno) {
	      double promedio = alumno.calcularPromedio();
	      System.out.println("Materias con nota mayor al promedio (" + promedio + "):");
	      for (int i = 0; i < alumno.getNotas().length; i++) {
	           if (alumno.getNotas()[i] > promedio) {
	               System.out.println(alumno.getMaterias()[i]);
	            }
	        }
	    }
	    
	 // Método para imprimir un mensaje que indique si el profesor asignado es de una materia existente entre las materias rendidas por el alumno
	 public static void imprimirMensajeProfesorMateria(Profesor profesor,Alumno alumno) {
	     String materiaProfesor = profesor.getMateria();
	     boolean materiaEncontrada = false;
	     for (String materia : alumno.getMaterias()) {
	            if (materia.equals(materiaProfesor)) {
	                materiaEncontrada = true;
	                break;
	            }
	        }
	     if (materiaEncontrada) {
	        System.out.println("El profesor asignado es de la materia rendida por el alumno.");
	        } else {
	            System.out.println("El profesor asignado no es de la materia rendida por el alumno.");
	        }
	    }
	 
	 public static void main(String[] args) {
		Profesor profe = new Profesor();
		Alumno alumno = new Alumno();
		Alumno alumno1 = new Alumno();
		
		//Creo el primer alumno
		alumno.setNombre("Juan");
		alumno.setApellido("Gonzales");
        alumno.setDni(40070895);
        alumno.setLegajo(3540);
        
        //Creo el segundo alumno
        alumno1.setNombre("Mauro");
		alumno1.setApellido("Rosales");
        alumno1.setDni(41895671);
        alumno1.setLegajo(4120);
        
        //Creo el profesor de la materia
        profe.setNombre("Ricardo");
        profe.setApellido("Lopez");
        profe.setDni(31604579);
        profe.setMateria("Informatica");
        profe.setNumMatricula(1567);
        
        //Mostramos los datos del profesor
        System.out.println("Los datos personales del profesor son: ");
      	profe.mostrarDatosPersonales();
		
        //Invoco el metodo para cargar las materias y notas de los alumnos
		alumno.cargarMaterias(alumno);
		alumno.cargarNotas(alumno);
		
		alumno1.cargarMaterias(alumno1);
		alumno1.cargarNotas(alumno1);
		
		//Mostramos las materias aprobadas por cada alumno,las materias que tienen notas mayor a su promedio y sus datos
		//Primer alumno
		alumno.mostrarDatosPersonales();
		System.out.println("Las notas de sus materias son:");
		alumno.imprimirNotas();
		System.out.println("El promedio del alumno es: "+alumno.calcularPromedio());
		imprimirMateriasAprobadas(alumno);
		imprimirMateriasConNotaMayorAlPromedio(alumno);
		//imprimimos el mensaje si el profesor esta asignado a la materia
		imprimirMensajeProfesorMateria(profe,alumno);
		
		//segundo alumno
		alumno1.mostrarDatosPersonales();
		System.out.println("Las notas de sus materias son:");
		alumno1.imprimirNotas();
		System.out.println("El promedio del alumno es: "+alumno1.calcularPromedio());
		imprimirMateriasAprobadas(alumno1);
		imprimirMateriasConNotaMayorAlPromedio(alumno1);
		//imprimimos el mensaje si el profesor esta asignado a la materia
		imprimirMensajeProfesorMateria(profe,alumno1);
		
		
		
		
		
	}

}
