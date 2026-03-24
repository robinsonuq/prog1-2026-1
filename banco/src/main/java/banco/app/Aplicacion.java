package banco.app;

import co.edu.uniquindio.poo.Banco;

import javax.swing.*;

public class Aplicacion {


    public static void main(String[] args) {
        Banco banco = new Banco("Banco Ahorro");

        String resultado = banco.retirarDinero("1093",1000);

        if(resultado.equals("Transaccion exitosa")){
            JOptionPane.showMessageDialog(null, "Transaccion exitosa");
        }
    }
}
