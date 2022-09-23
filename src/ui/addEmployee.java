package ui;

import java.util.Scanner;

import dol.monthEmployee;

public class addEmployee {
	

	monthEmployee f = new monthEmployee();
	Scanner entry = new Scanner(System.in);
	public monthEmployee MEmployee() {
		System.out.println("Id del Empleado");
		f.setId(entry.nextInt());
		System.out.println("Primer Nombre del Empleado");
		f.setFirstName(entry.next());
		System.out.println("Segundo Nombre del Empleado");
		f.setSecondName(entry.next());
		System.out.println("Primer Apellido del Empleado");
		f.setFisrtLname(entry.next());
		System.out.println("Segundo Apellido del Empleado");
		f.setFisrtLname(entry.next());
		System.out.println("Salario  Minimo");
		f.setMinimumWage(entry.nextDouble());
		System.out.println("Prueba 2");
		short op = entry.nextShort();		
		switch (op) {
		case 1:
			
			break;
		case 2:
		
			return f;
		default:
				System.out.println("Eleccion equivocada");
				break;
		}
		
		return f;
	}
	public monthEmployee Cal (double d) {
		Double numb = d;
		f.setMinimumWage(numb);
		Double Dedud = numb * 0.05;
	     Double netSalry = numb -Dedud;
	     f.setNetSalary(netSalry);
		return f;
	    
		
		
	}
		
	
	
	}
	
	
