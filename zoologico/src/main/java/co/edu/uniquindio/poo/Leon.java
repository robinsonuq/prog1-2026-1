package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.Animal;

public class Leon extends Animal {
    public Leon(String nombre, String codigo, String taxonomia, String color, String sexo, byte edad) {
        super(nombre,codigo,taxonomia,color,sexo,edad);
    }

    @Override
    public String hacerSonido() {
        return "";
    }
}
