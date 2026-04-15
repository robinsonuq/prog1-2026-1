package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.Calculadora;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(2,3);
        int resultadoObtenido = calculadora.sumar();

        if(resultadoObtenido == 5){
            System.out.println("Correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
}