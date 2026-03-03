package programacademico.model;

public class Nota {

	private String nombre;
	private double valor;
	private Estudiante  ownedByEstudiante;
	
	public Nota(String nombre, double valor, Estudiante ownedByEstudiante) {
		this.nombre = nombre;
		this.valor = valor;
		this.ownedByEstudiante = ownedByEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Estudiante getOwnedByEstudiante() {
		return ownedByEstudiante;
	}

	public void setOwnedByEstudiante(Estudiante ownedByEstudiante) {
		this.ownedByEstudiante = ownedByEstudiante;
	}

	@Override
	public String toString() {
		return "Nota [nombre=" + nombre + ", valor=" + valor + ", ownedByEstudiante=" + ownedByEstudiante + "]";
	}
	
	
	
}
