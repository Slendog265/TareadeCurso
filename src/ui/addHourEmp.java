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
			Cal3();
			return m;
		case 2:
			Cal2();
			m.setXtraHours(0);
			m.setXtraTar(0);
			
			return m;
		default:
				System.out.println("\"\\033[35m===================================================\\u001B[0m\\033[31m\\n|Hemos encontrado un error en los datos ingresados|\\n|Por favor introduzca los datos solicitados.     |\\033[35m \\n===================================================\\u001B[0m\"");
				break;
		}
		return m;
	}
	
	public hourEmployee Cal2() {
		Integer Tarifa = m.getTar();
		Integer Horas = m.getHour();
		Integer Total1 = Horas * Tarifa;
		m.setBruteWage(Total1);	
		double numb = Total1;
		double SmD = 0, IrM = 0, pApli = 0,Dedud = 0, netSalry = 0, IA = 0;
		double INSS = numb * 0.07;
		m.setINSS(INSS);
		double BImpo = numb - INSS;
		double SAnual = BImpo * 12;
		if(SAnual <  199999  ) {
			 SmD = SAnual - 100000;
			 pApli = SmD * 0.15;
			 IrM = pApli/12;
			m.setIr(IrM);
			  Dedud = INSS +IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
	m.setNetSalary(netSalry);
		}else if(SAnual < 349999 ) {
			 SmD = SAnual - 200000;
			 pApli = SmD * 0.20;
			
			 IA = pApli + 15000;
			 IrM = IA /12 ;
			 m.setIr(IrM);
			  Dedud = INSS + IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			    m.setNetSalary(netSalry);
		}else if(SAnual  < 499999 ) {
			 SmD = SAnual - 350000;
			 pApli = SmD * 0.25;
			 IA = pApli + 45000;
			 IrM = IA /12 ;
			 m.setIr(IrM);
			  Dedud = INSS + IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			   m.setNetSalary(netSalry);
		}else if(SAnual > 500000) {
			 SmD = SAnual - 500000;
			 pApli = SmD * 0.30;
			 IA = pApli + 82000;
			 IrM = IA /12 ;
			 m.setIr(IrM);
			  Dedud = INSS  + IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			    m.setNetSalary(netSalry);

		}
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
		double numb = Total1;
		double SmD = 0, IrM = 0, pApli = 0,Dedud = 0, netSalry = 0, IA = 0;
		double INSS = numb * 0.07;
		m.setINSS(INSS);
		double BImpo = numb - INSS;
		double SAnual = BImpo * 12;
		if(SAnual <  199999  ) {
			 SmD = SAnual - 100000;
			 pApli = SmD * 0.15;
			 IrM = pApli/12;
			m.setIr(IrM);
			  Dedud = INSS +IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
	m.setNetSalary(netSalry);
		}else if(SAnual < 349999 ) {
			 SmD = SAnual - 200000;
			 pApli = SmD * 0.20;
			
			 IA = pApli + 15000;
			 IrM = IA /12 ;
			 m.setIr(IrM);
			  Dedud = INSS + IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			    m.setNetSalary(netSalry);
		}else if(SAnual  < 499999 ) {
			 SmD = SAnual - 350000;
			 pApli = SmD * 0.25;
			 IA = pApli + 45000;
			 IrM = IA /12 ;
			 m.setIr(IrM);
			  Dedud = INSS + IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			   m.setNetSalary(netSalry);
		}else if(SAnual > 500000) {
			 SmD = SAnual - 500000;
			 pApli = SmD * 0.30;
			 IA = pApli + 82000;
			 IrM = IA /12 ;
			 m.setIr(IrM);
			  Dedud = INSS  + IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			    m.setNetSalary(netSalry);
		}
		return m;
		
	}
	
}
