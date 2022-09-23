package ui;

import java.util.Scanner;

import bll.Data;

public class Menu implements IMenu{
	Scanner scan = new Scanner(System.in);
	
	public void ShowOp() {
		System.out.println("1.Agregar");
		System.out.println("2.Mostrar");
		System.out.println("3.Salir");
		
		
	}
	public void show() {
		short op = 0;
	do {
		
	ShowOp();
	op = scan.nextShort();
	switch(op) {
	
	case 1:
		Data.catchHEmployee();
		break;
		
	case 2:
		Data.showDataHEmployee();
		break;
		
	case 3:
		System.exit(0);
		
		default:
			System.out.println("Seleccion Equivocada");
			break;
	}
	}while(op != 3);
	}
}
