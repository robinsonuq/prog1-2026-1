package co.edu.uniquindio.poo;

import javax.swing.*;

public class Arreglos {

    public static void main(String[] args) {

        int cantidadNotas = Integer.valueOf(JOptionPane.showInputDialog
                (null,"Ingrese el numero de notas"));

        double[] notas = new double[cantidadNotas];// creacion del arreglo

        //inicializar los datos del arreglo
        notas[0] = 1.0;
        notas[1] = 4.0;
        notas[2] = 4.0;
        notas[3] = 4.0;
        notas[4] = 5.0;
        //inicializar el arreglo de notas con un ciclo y con JOptionPane.showInputDialog
        //                (null,"Ingrese una nota"))

        double notaDefinitiva = calcularNotaDefinitiva(notas);
        double notaMayor = obtenerMayor(notas);
        double notaMenor = obtenerMenor(notas);

    }

    public static double calcularNotaDefinitiva(double[] notas) {
        double notaDefinitiva = 0;
        double suma = 0;

       for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
       }
       notaDefinitiva = suma / notas.length;
       return notaDefinitiva;
    }

    public static double obtenerMayor(double[] notas) {
        double mayor= 0;
        for(int i=0; i < notas.length; i++){
            if(notas[i] > mayor) {
                mayor = notas[i];
            }
        }
        return mayor;
    }

    public static double obtenerMenor (double[] notas) {
        double menor= notas[0];
        for(int i=0; i < notas.length; i++){
            if(notas[i] < menor) {
                menor = notas[i];
            }
        }
        return menor;
    }






}
