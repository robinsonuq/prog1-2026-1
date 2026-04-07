package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Empresa {

    private String nombre;
    private List<Empleado> listaEmpleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        listaEmpleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public String registrarEmpleado(Empleado empleado) {
        String respuesta = "";
        Optional<Empleado> optionalEmpleado = buscarEmpleado(empleado.getDocumento());

        if(optionalEmpleado.isPresent()){
            Empleado empleadoEncontrado = optionalEmpleado.get();
            respuesta = "El empleado ya existe";
        }else{
            listaEmpleados.add(empleado);
        }

        return respuesta;

    }

    private Optional<Empleado> buscarEmpleado(String documento) {
        return listaEmpleados.stream().
                filter(empleado -> empleado.getDocumento().equals(documento)).findAny();
    }
    public Empleado buscarEmpleadoPorDocumento(String documento) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getDocumento().equals(documento)) {
                return empleado;
            }
        }
        return null;
    }

    public void listarEmpleadosTipoPlanta(){

        for (Empleado empleado : listaEmpleados) {
            if(empleado instanceof EmpleadoPlanta){
                System.out.println(empleado.getNombre());
            }
        }
    }
    public void listarEmpleadosTipoTemporal(){

        for (Empleado empleado : listaEmpleados) {
            if(empleado instanceof EmpleadoTemporal){
                System.out.println(empleado.getNombre());
            }
        }
    }

}
