package ui;

import java.util.Scanner;
public class PMenu {
	
	
		Scanner menu = new Scanner(System.in);
				
		Menu w = new Menu();
		MenuMEmp e = new MenuMEmp();
		
		public void options () {
		System.out.println("Plantilla de Pago \n1. Empleado mensual \n2. Empleado por hora \n3. Salir \nPor favor, digite un numero: ");
				
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
