package ui;

import java.util.Scanner;

import bll.Data;

public class MenuMEmp {

	Scanner scan = new Scanner(System.in);
	
	public void ShowOp2 () {
		System.out.println("1.Agregar Empleado Mensual \n2.Mostrar Empleado Mensual \n3.Volver");
	}
	
public void show2() {
	PMenu z = new PMenu();
		ShowOp2();
		
		short op2 = 0;
	do {
		
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
