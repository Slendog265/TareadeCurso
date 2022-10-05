package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import bll.Data;

public class MenuMEmp {

	Scanner scan = new Scanner(System.in);
	
	public void ShowOp2 () {
		System.out.println("------------------------------------------------------");
		System.out.println("1.Agregar Empleado Mensual \n2.Mostrar Empleado Mensual \n3.Volver");
	    System.out.println("------------------------------------------------------");
		
	}
	
public void show2() {
	PMenu z = new PMenu();
		short op2 = 0;
		boolean error = false;
	do {
		ShowOp2();
		try {
	op2 = scan.nextShort();
	switch(op2) {
	
	case 1:
		Data.catchMEmployee();
		break;
		
	case 2:
		Data.ShowDataMEmp();
		break;

		
	case 3:
		z.options2();
		default:
			System.out.println("Opcion Incorrecta \nPor favor,digite una opcion correcta");
			System.out.println();
			
		
	}
		}catch(InputMismatchException  e){
			
			System.out.println("\033[31mIntroduce un valor numerico.\u001B[0m");
			System.out.println();
			error = true;
			if(error = true) {
				show2();
			}
		}
	}while(op2 != 3);
	
	}
	
}
