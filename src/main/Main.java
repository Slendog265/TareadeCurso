package main;

import dol.hourEmployee;
import ui.addHourEmp;

public class Main {
	private String FirstName;
	hourEmployee m = new hourEmployee(FirstName, null, null, null, null, null, null, null);
	public static void main(String[] args) {

		addHourEmp p = new addHourEmp();
		p.HEmployee();
		
		
	}

	
	public void prueba() {
		System.out.println(m.getFirstName());
	}
}
