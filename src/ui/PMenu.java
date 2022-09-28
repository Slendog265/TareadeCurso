package ui;

import java.util.Scanner;
public class PMenu {
	
//"\u001B[0m";
		Scanner menu = new Scanner(System.in);
				
		Menu w = new Menu();
		MenuMEmp e = new MenuMEmp();
		
		public void options () {
			System.out.println();
			System.out.println("\033[37m===========================\u001B[0m\033[33m\nPlantilla de Pago\n\033[37m===========================\u001B[0m \n \n1. Empleado mensual\n2. Empleado por hora\n3. Salir\n\n* Por favor, digite un numero:");	
	
		}
		
		public void options2 () {
			short opc;
			
			do {
			options();
			opc = menu.nextShort();
			switch(opc) {
			case 1:
				e.show2();
				break;
				
			case 2:
				w.show();
				break;
			
			case 3:
				System.exit(0);
				default:
					System.out.println("Opcion Incorrecta \nPor favor,digite una opcion correcta");
					System.out.println();
					
			}
			
			}while(opc != 3 );

		}
		
			
		
	
}
