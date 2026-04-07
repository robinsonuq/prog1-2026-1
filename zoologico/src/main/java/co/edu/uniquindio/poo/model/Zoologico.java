package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    private String nombre;
    private List<Animal> listaAnimales = new ArrayList<>();

    public Zoologico(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(List<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }


    public String registraAnimal(Animal animal){
        String resultado = "";
        boolean animalEncontrado = buscarAnimal(animal.getCodigo());
        if(animalEncontrado){
            resultado = "OJO ya existe este amimal";
        }else {
            listaAnimales.add(animal);
            resultado = "Animal registrado exitosamente";
        }
        return resultado;
    }

    // se ve el como
    public boolean buscarAnimal(String codigo){
        boolean resultado = false;
        for(Animal aux2 : listaAnimales){
            if(aux2.getCodigo().equals(codigo)){
                return true;
            }
        }
        return resultado;
    }

    // se ve el que
    public boolean buscarAnimal2(String codigo){
        return listaAnimales.stream().anyMatch(aux -> aux.getCodigo().equals(codigo));
    }


    public void saltar(){
        for(Animal aux2 : listaAnimales){
            if( aux2 instanceof Saltarin ){

            }

        }
    }

}
