package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.Animal;
import co.edu.uniquindio.poo.model.Gato;
import co.edu.uniquindio.poo.model.Zoologico;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico("UKUMARY");

        Animal animal = new Gato("Simba","2523","Panthera Leo","cafe",
                        "Macho",(byte)10,6,7);

        String resultado = zoologico.registraAnimal(animal);
        JOptionPane.showMessageDialog(null, resultado);

       String sonido = animal.hacerSonido();

       JOptionPane.showMessageDialog(null, sonido);
    }
}