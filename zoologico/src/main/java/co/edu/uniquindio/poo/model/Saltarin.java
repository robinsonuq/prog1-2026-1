package co.edu.uniquindio.poo.model;

public class Saltarin extends Animal{


    public Saltarin(String nombre, String codigo, String taxonomia, String color, String sexo, byte edad) {
        super(nombre, codigo, taxonomia, color, sexo, edad);
    }

    @Override
    public String hacerSonido() {
        return "";
    }


}
