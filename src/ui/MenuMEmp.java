package ui;

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
	do {
		ShowOp2();
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
	}while(op2 != 3);
	
	}
	
}
