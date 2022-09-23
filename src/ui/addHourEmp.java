package ui;

import java.util.Scanner;

import dol.hourEmployee;
import main.Main;

public class addHourEmp {
	private Scanner entry = new Scanner(System.in);
	Main q = new Main ();
	Menu a = new Menu ();
	
	public addHourEmp() {
		
	}
	
	public hourEmployee HEmployee() {
		
		hourEmployee m = new hourEmployee();
		Short op;
		System.out.println("ID del Empleado");
		m.setId(entry.nextInt());
		System.out.println("Primer Nombre del Empleado");
		m.setFirstName(entry.next());
		System.out.println("Segundo Nombre del Empleado");
		m.setSecondName(entry.next());
		System.out.println("Primer Apellido del Empleado");
		m.setFisrtLname(entry.next());
		System.out.println("Segundo Apellido del Empleado");
		m.setSecondLname(entry.next());
	   System.out.println("Horas de Trabajo del Empleado");
	   m.setHour(entry.nextInt());
	   System.out.println("Tarifa del Empelado por Hora");
		m.setTar(entry.nextInt());
		System.out.println("El empleado Trabaja Horas Extras?");
		System.out.println("1. Si");
		System.out.println("2. No");
		op = entry.nextShort();		
		switch (op) {
		case 1:
			System.out.println("Horas Extras del Empleado");
			m.setXtraHours(entry.nextInt());
			System.out.println("Tarifa Extra del Empleado");
			m.setXtraTar(entry.nextInt());
			break;
		case 2:
			m.setXtraHours(0);
			m.setXtraTar(0);
			return m;
		default:
				System.out.println("Eleccion equivocada");
				break;
		}
		return m;
	}
	
	public void showBook() {
		System.out.printf("");
		
	}
}
