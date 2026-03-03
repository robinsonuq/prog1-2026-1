package programacademico.model;

import java.util.ArrayList;

public class Curso {

	private String nombre;
	private String codigo;
	private double promedio;
	private byte numeroEvaluaciones;
	
	private Profesor profesor;
	private ArrayList<Estudiante> listaEstudiantes;
	
	public Curso(String nombre, String codigo, byte numeroEvaluaciones) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.numeroEvaluaciones = numeroEvaluaciones;
		this.listaEstudiantes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public byte getNumeroEvaluaciones() {
		return numeroEvaluaciones;
	}

	public void setNumeroEvaluaciones(byte numeroEvaluaciones) {
		this.numeroEvaluaciones = numeroEvaluaciones;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", codigo=" + codigo + ", promedio=" + promedio + ", numeroEvaluaciones="
				+ numeroEvaluaciones + ", profesor=" + profesor + "]";
	}
	
	
	
	
}
