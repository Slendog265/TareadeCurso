package ui;

import java.util.Scanner;

import dol.hourEmployee;
import main.Main;

public class addHourEmp {
	private Scanner entry = new Scanner(System.in);
	Main q = new Main ();
	
	
	public hourEmployee HEmployee() {
		
		hourEmployee m = new hourEmployee(null, null, null, null, null, null, null, null);
		Short op;
		System.out.println("Primer Nombre del Empleado");
		m.setFirstName(entry.next());
		System.out.println("Segundo Nombre del Empleado");
		m.setSecondName(entry.next());
		System.out.println("Primer Apellido del Empleado");
		m.setFisrtLname(entry.next());
		System.out.println("Segundo Apellido del Empleado");
		m.setFisrtLname(entry.next());
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
			System.out.println("Aqui va el menu");
			q.prueba();
			break;
			
		default:
				System.out.println("Eleccion equivocada");
				break;
		
		}
		
		return m;
		
	}

}