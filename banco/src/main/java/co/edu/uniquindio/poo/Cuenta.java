package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Cuenta {

    private double saldo;
    private String numero;
    private TipoCuenta tipoCuenta;
    private ArrayList<Transaccion> transacciones;
    private Cliente cliente;
    private Banco ownedByBanco;

    public Cuenta(double saldo, String numero, TipoCuenta tipoCuenta, ArrayList<Transaccion> transacciones, Cliente cliente, Banco ownedByBanco) {
        this.saldo = saldo;
        this.numero = numero;
        this.tipoCuenta = tipoCuenta;
        this.transacciones = transacciones;
        this.cliente = cliente;
        this.ownedByBanco = ownedByBanco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getOwnedByBanco() {
        return ownedByBanco;
    }

    public void setOwnedByBanco(Banco ownedByBanco) {
        this.ownedByBanco = ownedByBanco;
    }

    public String retirarDinero(double valorRetirar){
        String resultado = "";

        saldo = saldo - valorRetirar;

        return resultado;
    }

}
