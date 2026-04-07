package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.CategoriaEmpleado;
import co.edu.uniquindio.poo.model.EmpleadoPlanta;
import co.edu.uniquindio.poo.model.Empresa;

public class Aplicacion {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Uniquindio");

        EmpleadoPlanta empleadoPlanta = new EmpleadoPlanta("Juan","1234",25, CategoriaEmpleado.SENIOR,120000f,30000f,3000000f,"Docente",0,80000f,0);
        empresa.registrarEmpleado(empleadoPlanta);


    }
}
