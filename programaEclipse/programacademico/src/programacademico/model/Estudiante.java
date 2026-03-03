package programacademico.model;

public class Estudiante {

	private String nombre;
	private String identificacion;
	private double promedio;
	
	private ProgramaAcademico ownedByPrograAcademico;
	private Curso curso;
	private Nota [] listaNotas;
	
	public Estudiante(ProgramaAcademico ownedByPrograAcademico,
			String nombre, String identificacion,
			double promedio, byte numeroEvaluaciones) {
		
		this.ownedByPrograAcademico = ownedByPrograAcademico;
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.promedio = promedio;
		this.listaNotas = new Nota[numeroEvaluaciones];
	}

	public String getNombre() {
		return nombre;
	}
	
	

	public Nota[] getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(Nota[] listaNotas) {
		this.listaNotas = listaNotas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	
	
	public ProgramaAcademico getOwnedByPrograAcademico() {
		return ownedByPrograAcademico;
	}

	public void setOwnedByPrograAcademico(ProgramaAcademico ownedByPrograAcademico) {
		this.ownedByPrograAcademico = ownedByPrograAcademico;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", identificacion=" + identificacion + ", promedio=" + promedio + "]";
	}
	
	
}
