package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.*;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico("UKUMARY");

        Gato gato = new Gato("Michi","2","Felinus","negro",
                        "Macho",(byte)3,6,7);

        Animal animal1 = new Leon("Michi","2","Felinus","negro",
                "Macho",(byte)3);

        Perro perro = new Perro( "Hachiko", "3", "taxonomia", "Dorado", "M", (byte) 12,"");













        String resultado = zoologico.registraAnimal(gato);
        String resultado2 = zoologico.registraAnimal(animal1);
        String resultado3 = zoologico.registraAnimal(perro);



        JOptionPane.showMessageDialog(null, resultado);


    }
}