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
		
		double numb = f.getMinimumWage();
		double SmD = 0, IrM = 0, pApli = 0,Dedud = 0, netSalry = 0, IA = 0;
		double INSS = numb * 0.07;
		
		f.setINSS(INSS);
		double BImpo = numb - INSS;
		double SAnual = BImpo * 12;
		if(SAnual <  199999  ) {
			 SmD = SAnual - 100000;
			 pApli = SmD * 0.15;
			 IrM = pApli/12;
			f.setIr(IrM);
			  Dedud = INSS +IrM;
				f.setToDedud(Dedud);
			     netSalry = numb -Dedud;
	f.setNetSalary(netSalry);
		}else if(SAnual < 349999 ) {
			 SmD = SAnual - 200000;
			 pApli = SmD * 0.20;
			
			 IA = pApli + 15000;
			 IrM = IA /12 ;
			 f.setIr(IrM);
			  Dedud = INSS + IrM;
				f.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			    f.setNetSalary(netSalry);
		}else if(SAnual  < 499999 ) {
			 SmD = SAnual - 350000;
			 pApli = SmD * 0.25;
			 IA = pApli + 45000;
			 IrM = IA /12 ;
			 f.setIr(IrM);
			  Dedud = INSS + IrM;
				f.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			   f.setNetSalary(netSalry);
		}else if(SAnual >= 500000) {
			 SmD = SAnual - 500000;
			 pApli = SmD * 0.30;
			 IA = pApli + 82000;
			 IrM = IA /12 ;
			 f.setIr(IrM);
			  Dedud = INSS  + IrM;
				f.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			    f.setNetSalary(netSalry);

		}
		
		
		return f;
	    
		
		
		
	}
		
	
	
	}
	
	
