package co.edu.uniquindio.poo.model;

public class Gato extends Saltarin {


    private int numeroBigotes;
    private int numeroVidas;

    public Gato(String nombre, String codigo,
                String taxonomia, String color, String sexo,byte edad,
                int numeroBigotes, int numeroVidas) {
        super(nombre,codigo,taxonomia,color,sexo,edad);
        this.numeroBigotes = numeroBigotes;
        this.numeroVidas = numeroVidas;
    }

    public int getNumeroBigotes() {
        return numeroBigotes;
    }

    public void setNumeroBigotes(int numeroBigotes) {
        this.numeroBigotes = numeroBigotes;
    }

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    @Override
    public String hacerSonido() {
        return "El gato hace miau miau";
    }

    public void irArenero(){
        System.out.println("El gato va al arenero");
    }

    @Override
    public void saltar() {
        System.out.println("El gato va al saltar");
    }

    @Override
    public String comer(String comida) {
        return super.comer(comida);
    }
}
