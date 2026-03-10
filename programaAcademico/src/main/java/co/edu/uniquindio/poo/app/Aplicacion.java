package co.edu.uniquindio.poo.app;

import java.util.Scanner;

import javax.swing.JOptionPane;

import programacademico.model.ProgramaAcademico;

public class Aplicacion {

	public static void main(String[] args) {
		
		ProgramaAcademico programaAcademico = 
				new ProgramaAcademico("Ingenieria de sistemas y computacion",
				"1");
		
		int opcion = 0;
		
		
		while(opcion != 7) {
			
			opcion = Integer.valueOf(JOptionPane.showInputDialog(null,"Seleccione la opcion que desea realizar"));
			
			switch (opcion) {
			case 1: {
				String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre");
				String identificacion = JOptionPane.showInputDialog(null,"Ingrese la identificacion");
				
				String resultado = programaAcademico.registrarProfesor(nombre,identificacion);
				JOptionPane.showMessageDialog(null, resultado);
			}
			default:
				JOptionPane.showMessageDialog(null, "Selecicones una opciion valida");
			}

			
			
		}
		
		
		
		
	}
}
