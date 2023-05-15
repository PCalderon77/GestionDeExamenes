package Parcial_1;

import java.util.Scanner;

public class Alumno extends Persona {
	private double[] notas = new double[5];
    private String[] materias = new String[5];
    private int legajo;
    
    public Alumno(String nombre, String apellido, int DNI) {
    	super(nombre, apellido, DNI);
    }
    
    
    public Alumno() {
		super();
	}


	public int getLegajo() {
        return legajo;
    }
    
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
 public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String[] getMaterias() {
		return materias;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}

	// Métodos para cargar las notas y las materias
	public void cargarMaterias(Alumno alumno) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Ingrese materias  del alumno: "+ alumno.getNombre()+" "+ alumno.getApellido());
	        for(int i=0; i<materias.length;i++) {
	        	System.out.println("Ingrese la materia "+ (i+1));
	        	materias[i]=sc.next();
	        }
    }
	
    public void cargarNotas(Alumno alumno) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las notas del alumno: "+ alumno.getNombre()+" "+ alumno.getApellido());
        for(int i=0; i<notas.length;i++) {
        	System.out.println("Ingrese la nota de "+ materias[i]);
        	notas[i]=sc.nextDouble();
        }  
    }
    
    // Método para calcular el promedio total de las notas
    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
    
    // Método para imprimir las notas y las materias correspondientes
    public void imprimirNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(materias[i] + ": " + notas[i]);
        }
    }
    public void mostrarDatosPersonales() {
    	super.mostrarDatosPersonales();
        System.out.println("N° de Legajo " + legajo);
        
        
    }
}
