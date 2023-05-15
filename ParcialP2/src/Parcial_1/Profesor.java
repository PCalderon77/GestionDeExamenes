package Parcial_1;

public class Profesor extends Persona {
    private String materia;
    private int numMatricula;
    
    
    public Profesor() {
		super();
	}

	public Profesor(String materia, int numMatricula,String nombre, String apellido, int DNI) {
		super(nombre, apellido, DNI);
		this.materia = materia;
		this.numMatricula = numMatricula;
	}

	public String getMateria() {
        return materia;
    }
    
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public int getNumMatricula() {
        return numMatricula;
    }
    
    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }
    
 
    public void mostrarMateria() {
        System.out.println("Materia: " + materia);
    }
    public void mostrarDatosPersonales() {
    	super.mostrarDatosPersonales();
        System.out.println("N° de matricula " + numMatricula);
        mostrarMateria();
    }

}
