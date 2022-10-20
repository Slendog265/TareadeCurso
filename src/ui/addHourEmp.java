package ui;

import java.util.List;
import java.util.Scanner;

import dol.hourEmployee;
import main.Main;
import misc.dedudCalc;

public class addHourEmp {
	private Scanner entry;
	private List<hourEmployee> hEmp;
	
	
	public addHourEmp(Scanner entry) {
		super();
		this.entry = entry;
	}
	
	public addHourEmp(List<hourEmployee> hEmp) {
		super();
		this.hEmp = hEmp;
	}
	hourEmployee m = new hourEmployee();
	dedudCalc e = new dedudCalc();
	
	public hourEmployee hEmployee() {
		
		
		Short op;
		System.out.println("\033[35m=====================================\u001B[0m\n||         Id del Empleado         ||");
		m.setId(entry.next());
		System.out.println("||   Primer Nombre del Empleado    ||");
		m.setFirstName(entry.next());
		System.out.println("||   Segundo Nombre del Empleado   ||");
		m.setSecondName(entry.next());
		System.out.println("||  Primer Apellido del Empleado   ||");
		m.setFisrtLname(entry.next());
		System.out.println("||  Segundo Apellido del Empleado  ||");
		m.setSecondLname(entry.next());
	    System.out.println("||  Horas de Trabajo del Empleado  ||");
	    m.setHour(entry.nextInt());
	    System.out.println("||   Tarifa del Empelado por Hora  ||");
		m.setTar(entry.nextInt());
		System.out.println("||El empleado Trabaja Horas Extras?||");
		System.out.println("||\033[36m1.\u001B[0mSi, si trabaja horas extra     ||");
		System.out.println("||\033[36m2.\u001B[0mNo, no trabaja horas extra     ||");
		op = entry.nextShort();		
		switch (op) {
		case 1:
			System.out.println("||    Horas Extras del Empleado    ||");
			m.setXtraHours(entry.nextInt());
			System.out.println("||    Tarifa Extra del Empleado    ||");
			m.setXtraTar(entry.nextInt());
			e.calcDedud1();
			return m;
		case 2:
			e.calcDedud2();
			m.setXtraHours(0);
			m.setXtraTar(0);
			
			return m;
		default:
				System.out.println("\"\\033[35m===================================================\\u001B[0m\\033[31m\\n|Hemos encontrado un error en los datos ingresados|\\n|Por favor introduzca los datos solicitados.     |\\033[35m \\n===================================================\\u001B[0m\"");
				break;
		}
		return m;
	}
	
	public void show() {
		System.out.println("\033[35m===================================================\u001B[0m");
		System.out.println("|              Listado de Empleados               |");
		System.out.println("\033[35m===================================================\u001B[0m");
		for(int i=0; i<hEmp.size();i++) {
			hEmp.get(i).showData();
	    System.out.println("\n\033[35m===================================================\u001B[0m");
	   
	    
	    
		}
	}
	
	
	
	
}
