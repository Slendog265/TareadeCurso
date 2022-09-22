package ui;

import java.util.Scanner;

import bll.Data;

public class Menu implements IMenu{
	Scanner scan = new Scanner(System.in);
	public void show() {
		short op = 0;
	do {
		
	
	op = scan.nextShort();
	switch(op) {
	
	case 1:
		Data.catchHEmployee();
		break;
		
	case 2:
		Data.showData();
		break;
		
	case 3:
		System.exit(0);
	}
	}while(op != 3);
	}
}
