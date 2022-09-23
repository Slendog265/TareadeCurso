package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import bll.Data;

public class Menu implements IMenu{
	Scanner scan = new Scanner(System.in);
	
	
	public void ShowOp() {
		System.out.println("1.Agregar Empleado por Hora \n2.Mostrar Empleado por Hora \n3.Volver");
		
	}
	public void show() {
		PMenu z = new PMenu();
		short op1 = 0;
	
		ShowOp();
	    boolean error = false;
		do {
		try {
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
					System.out.println("Opcion Incorrecta \nPor favor,digite una opcion correcta");
					System.out.println();
				break;
	}
		}catch(InputMismatchException e) {
			
			System.out.println("Introduce un valor numerico.");
			error = true;
			if(error = true) {
				
				break;
			}
		}
		}while(op1 != 3 );
	}
	
	
	
}
