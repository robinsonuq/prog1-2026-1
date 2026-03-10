package co.edu.uniquindio.poo.model;

public class Profesor {

	private String nombre;
	private String identificacion;
	private ProgramaAcademico ownedByProgramaAcademico;
	private Curso curso;
	
	public Profesor(String nombre,String identificacion,
			ProgramaAcademico programaAcademico) {
		
		this.ownedByProgramaAcademico = programaAcademico;
		this.curso = null;
		this.nombre = nombre;
		this.identificacion = identificacion;
	}
	
	public Profesor() {
	
	}
	
	public Profesor(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
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

	public ProgramaAcademico getOwnedByProgramaAcademico() {
		return ownedByProgramaAcademico;
	}

	public void setOwnedByProgramaAcademico(ProgramaAcademico ownedByProgramaAcademico) {
		this.ownedByProgramaAcademico = ownedByProgramaAcademico;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", identificacion=" + identificacion + ", ownedByProgramaAcademico="
				+ ownedByProgramaAcademico + "]";
	}

	
}
