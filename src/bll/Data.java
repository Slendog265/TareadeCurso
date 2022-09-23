package bll;

import dol.Pp;
import dol.hourEmployee;
import dol.monthEmployee;
import ui.addHourEmp;

public final class Data {

	public static Pp G = new Pp();
	
	public static void addHoEmp (hourEmployee m ) {
		G.addHoEmp(m);
	} 
	public static void catchHEmployee() {
		addHourEmp em = new addHourEmp();
		addHoEmp(em.HEmployee());
	}
	
	public static void addMoEmp(monthEmployee f) {
		
	}
	
	public static void catchMEmployee() {
		
	}
	
	public static void showDataHEmployee() {
		G.showData();
	}
}
