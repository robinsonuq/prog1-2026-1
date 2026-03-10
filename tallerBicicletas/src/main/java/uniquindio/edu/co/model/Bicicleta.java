package uniquindio.edu.co.model;

import java.time.LocalDate;
import java.util.List;

public class Bicicleta {

    // Atributos
    private String serial;
    private String marca;
    private String color;
       private String tipoBicicleta;

    // Relaciones
    private List<OrdenServicio> listOrdenServicioBicicleta;
    private Cliente cliente;

    /**
     * Constructor de la clase Bicicleta.
     * @param marca de la bicicleta.
     * @param color de la bicicleta.

     * @param tipoBicicleta tipo de bicicleta (ej. montaña, ruta).
     */
    public Bicicleta(String serial,String marca, String color,  String tipoBicicleta) {
        this.serial = serial;
        this.marca = marca;
        this.color = color;
        this.numChasis = numChasis;
        this.tipoBicicleta = tipoBicicleta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    public List<OrdenServicio> getListOrdenServicioBicicleta() {
        return listOrdenServicioBicicleta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", serial='" + serial + '\'' +
                ", tipoBicicleta='" + tipoBicicleta + '\'' +
                '}';
    }

    public boolean verificarSerial(String inicioSerial) {
       return serial.startsWith(inicioSerial);
    }

    public boolean verificarPropietario(String nombrePropietario) {
        if(cliente != null){
           if(cliente.verificarNombre(nombrePropietario)){
               return true;
           }
        }
        return false;
    }

    public boolean verificarFechaReparacion(LocalDate fechaReparacion) {
        for (OrdenServicio ordenServicio : listOrdenServicioBicicleta) {
            if(ordenServicio.verificarFechaReparacion(fechaReparacion)){
                return true;
            }
        }
        return false;
    }
}