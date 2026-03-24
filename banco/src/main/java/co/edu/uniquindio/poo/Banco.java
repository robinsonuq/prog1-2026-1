package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private ArrayList<Cuenta> listaCuentas;

    public String retirarDinero(String identificacion,double valorRetiro){

        Cliente clienteEncontrado = buscarCliente(identificacion);
        if(clienteEncontrado == null){
            throw new RuntimeException("El cliente no esta registrado");// retorno una excepcion
        }
        Cuenta cuenta = clienteEncontrado.getCuenta();
        return cuenta.retirarDinero(valorRetiro);
    }

    public Cliente buscarCliente(String identificacion) {
        Cliente clienteEncontrado = null;
        for(Cliente cliente : listaClientes){
            if(cliente.getIdentificacion().equals(identificacion)){
                clienteEncontrado = cliente;
                break;
            }
        }
        return  clienteEncontrado;
    }
}
