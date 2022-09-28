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
	hourEmployee m = new hourEmployee();
	
	public hourEmployee HEmployee() {
		
		
		Short op;
		System.out.println("ID del Empleado");
		m.setId(entry.next());
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
			Cal3();
			return m;
		case 2:
			Cal2();
			m.setXtraHours(0);
			m.setXtraTar(0);
			
			return m;
		default:
				System.out.println("Eleccion equivocada");
				break;
		}
		return m;
	}
	
	public hourEmployee Cal2() {
		Integer Tarifa = m.getTar();
		Integer Horas = m.getHour();
		Integer Total1 = Horas * Tarifa;
		m.setBruteWage(Total1);	
		Double Dedud = Total1 * 0.05;
		Double netSalary = Total1 - Dedud;
		m.setNetSalary(netSalary);
		return m;		
		
	}
	
	
	public hourEmployee Cal3() {
		Integer Tarifa = m.getTar();
		Integer Horas = m.getHour();
		Integer Total1 = Horas * Tarifa;
		Integer Xtarifa = m.getXtraTar();
		Integer XHora = m.getXtraHours();
		Integer Total2 = XHora * Xtarifa;
		Integer Brute = Total1 + Total2;
		m.setBruteWage(Brute);
		double Dedud = Brute * 0.05;
		double netSalary = Brute - Dedud;
		m.setNetSalary(netSalary);
		
		return m;
		
	}
	
}
