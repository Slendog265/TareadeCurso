 package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import bll.Data;
import main.Main;

public class Menu implements IMenu{
	Scanner scan = new Scanner(System.in);
	
	
	public void ShowOp() {
	    System.out.println("===========================================");
		System.out.println("1.Agregar Empleado por Hora \n2.Mostrar Empleado por Hora \n3.Volver");
		System.out.println("===========================================");
	}
	public void show() {
		PMenu z = new PMenu();
		short op1 = 0;
	
		
	    boolean error = false;
		do {
			ShowOp();
		//try {
			op1 = scan.nextShort();
			
	switch(op1) {
			
			case 1:
				Data.catchHEmployee();
				break;
				
			case 2:
				Data.showDataHEmployee();
				break;
			
			case 3:
				z.options2();
				break;
				
				default:
					System.out.println("\033[31m\n=========================================== \n|             Opcion Incorrecta.            | \n|            Por favor, digite una de las tres opciones.             \n===========================================\u001B[0m");
					System.out.println();
				
	}
		/**}catch(InputMismatchException e) {
			
			System.out.println("\033[31mIntroduce un valor numerico.\u001B[0m");
			System.out.println();
			error = true;
			if(error = true) {
				show();
				
			}
		}**/
		}while(op1 != 3 );
	}
	
	
	
}
