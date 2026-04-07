package co.edu.uniquindio.poo.model;

public abstract class Animal {

    private String nombre;
    private String codigo;
    private String taxonomia;
    private String color;
    private String sexo;
    private byte edad;

    public Animal(String nombre, String codigo, String taxonomia, String color, String sexo, byte edad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.taxonomia = taxonomia;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



    public String getTaxonomia() {
        return taxonomia;
    }

    public void setTaxonomia(String taxonomia) {
        this.taxonomia = taxonomia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }


    public String comer(String comida){
        return "El animal "+nombre+" esta comiendo : "+comida;
    }


    public abstract String hacerSonido();

    public String dormir(){
        return "El animal esta durmiendo";
    }

}
