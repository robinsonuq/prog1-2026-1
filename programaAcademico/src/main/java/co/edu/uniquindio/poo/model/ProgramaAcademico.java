package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class ProgramaAcademico {

    // Atributos
    private String codigo;
    private String nombre;

    //Relaciones
    private ArrayList<Profesor> listaProfesores;
    private Curso curso;
    private ArrayList<Estudiante> listaEstudiantes;


    //metodo constructor
    public ProgramaAcademico(String codigo,String nombre){

        this.codigo = codigo;
        this.nombre = nombre;
        this.listaProfesores = new ArrayList<>();// crea una lista vacia
        this.curso = null;
        this.listaEstudiantes = new ArrayList<>();
    }

    //
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return codigo;
    }

}
