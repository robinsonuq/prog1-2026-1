package co.edu.uniquindio.poo.model;

public class EmpleadoVentas extends Empleado {
    private float totalVentas;
    private float porcentajeComision;

    public EmpleadoVentas(String nombre, String documento, int edad, CategoriaEmpleado categoria, float descuentoPension, float descuentoSalud, float salarioBase, float totalVentas, float porcentajeComision) {
        super(nombre, documento, edad, categoria, descuentoPension, descuentoSalud, salarioBase);
        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;
    }

    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public float calcularSalarioBruto() {
        return 0;
    }
}
