package co.edu.uniquindio.poo.model;

public class Perro extends Saltarin{

    private String raza;

    public Perro(String nombre, String codigo, String taxonomia, String color, String sexo, byte edad, String raza) {
        super(nombre, codigo, taxonomia, color, sexo, edad);
        this.raza = raza;
    }

    public String guauGuau(){
        return "Guau guau";
    }


    @Override
    public void saltar() {

    }
}
