package ui;

import java.util.Scanner;

import dol.monthEmployee;

public class addEmployee {
	
	monthEmployee f = new monthEmployee();
	Scanner entry = new Scanner(System.in);
	public monthEmployee MEmployee() {
		System.out.println("Primer Nombre del Empleado");
		f.setFirstName(entry.next());
		System.out.println("Segundo Nombre del Empleado");
		f.setSecondName(entry.next());
		System.out.println("Primer Apellido del Empleado");
		f.setFisrtLname(entry.next());
		System.out.println("Segundo Apellido del Empleado");
		f.setFisrtLname(entry.next());
		
		
		return f;
	
	}
	}
	
	
