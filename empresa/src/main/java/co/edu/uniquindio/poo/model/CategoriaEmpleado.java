package co.edu.uniquindio.poo.model;

public enum CategoriaEmpleado {
    JUNIOR(0),SEMI_SENIOR(1),SENIOR(2);

    private final int i;

    CategoriaEmpleado(int i) {
        this.i = i;
    }

    public int getValor() {
        return i;
    }
}
