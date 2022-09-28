package ui;

import java.util.Scanner;

import dol.monthEmployee;

public class addEmployee {
	

	monthEmployee f = new monthEmployee();
	Scanner entry = new Scanner(System.in);
	private double g;
	//private boolean done = false;
	public monthEmployee MEmployee() {
		System.out.println("Id del Empleado");
		f.setId(entry.next());
		System.out.println("Primer Nombre del Empleado");
		f.setFirstName(entry.next());
		System.out.println("Segundo Nombre del Empleado");
		f.setSecondName(entry.next());
		System.out.println("Primer Apellido del Empleado");
		f.setFisrtLname(entry.next());
		System.out.println("Segundo Apellido del Empleado");
		f.setSecondLname(entry.next());
	
		//boolean done = true;
		//do {
			
			//try {
				
				System.out.println("Salario  Minimo");
			//	 g = Double.parseDouble
				f.setMinimumWage(entry.nextDouble());
				
				//done=true;
		// }catch (Exception ex) {
				//System.out.println("Solo numeros decimales");
				//done=false;
			//}
		//}while(!done);
	Cal();
	
	
		return f;
	}
	
	public monthEmployee Cal () {
		
		Double numb = f.getMinimumWage();
		Double Dedud = numb * 0.05;
	     Double netSalry = numb -Dedud;
	     f.setNetSalary(netSalry);
		return f;
	    
		
		
	}
		
	
	
	}
	
	
