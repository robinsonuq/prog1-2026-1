package programacademico.model;

import java.util.ArrayList;

public class ProgramaAcademico {

	//atributos
	private String nombre;
	private String codigo;
	
	//relaciones
	private ArrayList<Profesor> listaProfesores;
	private Curso curso;
	private ArrayList<Estudiante> listaEstudiantes;
	
	public ProgramaAcademico (String nombre,String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.listaEstudiantes = new ArrayList<>();
		this.curso = null;
		this.listaProfesores = new ArrayList<>();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setListaProfesores(ArrayList<Profesor> nuevaLista) {
		this.listaProfesores = nuevaLista;
	}
	
	public ArrayList<Profesor> getListaProfesores(){
		return listaProfesores;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}

	@Override
	public String toString() {
		return "ProgramaAcademico [nombre=" + nombre + ", codigo=" + codigo + "]";
	}
	
	// CRUD de Profesor
	
	public String registrarProfesor(String nombre, String identificacion) {
		String resultado = "";

		Profesor profesorEncontrado = buscarProfesor(identificacion);
		
		if(profesorEncontrado != null) {
			resultado = "El profesor ya existe";
			return resultado;
		}
		
		//2. Registarrlo o crearlo
		Profesor nuevoProfesor = new Profesor(nombre, identificacion, this);
		//3. agregarlo a la lista de profesores
		listaProfesores.add(nuevoProfesor);
		resultado = "El profesor fúe registrado correctamente";
		//4. Notificar que paso
		return resultado;
		
	}
	
	// buscar profesor
	
	public Profesor buscarProfesor(String identificacion) {
		Profesor resultado = null;
		for (Profesor profesorAux : listaProfesores) {//foreach
			if(profesorAux.getIdentificacion().equals(identificacion)) {
				resultado = profesorAux;
				return resultado;
			}
		}
		
		return resultado;
	}
	
	public String eliminarProfesor(String idenficacion) {
		String resultado = "";
		
		Profesor profesorEncontrado = buscarProfesor(idenficacion);
		
		if(profesorEncontrado != null) {
			listaProfesores.remove(profesorEncontrado);
			resultado = "Profesor eliminado";
		}else {
			resultado = "Venga no sea asi ese profeosr no existe";
		}
		
		return resultado;
	}
	
	public String actaulizarProfesor(String idenficacion,String nuevoNombre) {
		String resultado = "";
		
		Profesor profesorEncontrado = buscarProfesor(idenficacion);
		
		if(profesorEncontrado != null) {
			
			profesorEncontrado.setNombre(nuevoNombre);
			
			resultado = "Profesor actualizado";
		}else {
			resultado = "Venga no sea asi ese profesor no existe";
		}
		
		return resultado;
	}

	// CRUD de estudiante
	
	public String registrarEstudiante(String nombre, String identificacion) {
		String resultado = "";

		Estudiante estudianteEncontrado = buscarEstudiante(identificacion);
		
		if(estudianteEncontrado != null) {
			resultado = "El Estudiante ya existe";
			return resultado;
		}
		
		//2. Registarrlo o crearlo
		Estudiante nuevoEstudiante = new Estudiante(this, nombre, identificacion, 0, (byte)0);
		//3. agregarlo a la lista de profesores
		listaEstudiantes.add(nuevoEstudiante);
		resultado = "El Estudiante fúe registrado correctamente";
		//4. Notificar que paso
		return resultado;
		
	}
	
	// buscar profesor
	
	public Estudiante buscarEstudiante(String identificacion) {
		Estudiante resultado = null;
		for (Estudiante estudiante : listaEstudiantes) {//foreach
			if(estudiante.getIdentificacion().equals(identificacion)) {
				resultado = estudiante;
				return resultado;
			}
		}
		return resultado;
	}
	
	public String eliminarEstudiante(String idenficacion) {
		String resultado = "";
		
		Estudiante estudianteEncontrado = buscarEstudiante(idenficacion);
		
		if(estudianteEncontrado != null) {
			listaEstudiantes.remove(estudianteEncontrado);
			resultado = "Estudiante eliminado";
		}else {
			resultado = "Venga no sea asi ese Estudiante no existe";
		}
		
		return resultado;
	}
	
	public String actaulizarEstudiante(String idenficacion,String nuevoNombre) {
		String resultado = "";
		
		Estudiante estudianteEncontrado = buscarEstudiante(idenficacion);
		
		if(estudianteEncontrado != null) {
			
			estudianteEncontrado.setNombre(nuevoNombre);
			
			resultado = "Estudiante actualizado";
		}else {
			resultado = "Venga no sea asi ese Estudiante no existe";
		}
		
		return resultado;
	}


	
	
	
}
