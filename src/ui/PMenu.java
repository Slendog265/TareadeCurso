package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import main.Main;
public class PMenu {
	
//"\u001B[0m";
		Scanner menu = new Scanner(System.in);
				
		Menu w = new Menu();
		MenuMEmp e = new MenuMEmp();
		Main m = new Main();
		
		public void options () {
			System.out.println();
			System.out.println("\033[35m======================================================================================================================================================================\u001B[0m \033[33m\nPlantilla de Pago \033[35m\n======================================================================================================================================================================\u001B[0m \n \033[36m\n1.\u001B[0mEmpleado mensual\033[36m\n2.\u001B[0mEmpleado por hora\033[36m\n3.\u001B[0mSalir\n \033[33m\n* Por favor, digite un numero: \u001B[0m");	
	
		}
		
		public void options2 () {
			short opc = 0;
			boolean error = false;
			
			do {
			options();
			try {
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
					System.out.println();
					System.out.println("\033[31mOpcion Incorrecta. \nPor favor, digite una de las tres opciones.\u001B[0m");
					
			}
			}catch(InputMismatchException e){
				
				System.out.println("Introduce un valor numerico.");
				error = true;
				if(error = true) {
					options2();
					break;
					
				}
			}catch(StackOverflowError e) {
				error = true;
				if(error = true) {
					options2();
				}
			}
			}while(opc != 3 );

		}
		
			
		
	
}
