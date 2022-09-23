package dol;

import java.util.ArrayList;
import java.util.List;

import ui.Menu;
import ui.MenuMEmp;

public class Pp {

	private List<hourEmployee> HEmp;
	private List<monthEmployee> MEmp;
	Menu q = new Menu();
	MenuMEmp w = new MenuMEmp();
	
	public Pp() {
		HEmp = new ArrayList<hourEmployee>();
		MEmp = new ArrayList<monthEmployee>();
		
	}
	public Pp(List<hourEmployee> hEmp, List<monthEmployee> mEmp) {
		super();
		HEmp = hEmp;
		MEmp = mEmp;
	}
	public List<hourEmployee> getHEmp() {
		return HEmp;
	}
	public void setHEmp(List<hourEmployee> hEmp) {
		HEmp = hEmp;
	}
	public List<monthEmployee> getMEmp() {
		return MEmp;
	}
	public void setMEmp(List<monthEmployee> mEmp) {
		MEmp = mEmp;
	}
	public void addHoEmp (hourEmployee m) {
		this.HEmp.add(m);
	}
	public void addMEmp (monthEmployee f) {
		this.MEmp.add(f);
	}
	public void showData() {
		System.out.println("----------------------------------------");
		System.out.println("Listado de Empleados");
		System.out.println("----------------------------------------");
		for(int i=0; i<HEmp.size();i++) {
			HEmp.get(i).showData();
	    System.out.println("----------------------------------------");
	    System.out.println();
	    q.show();
	    
		}
	}
	
	public void showData2() {
		
		System.out.println("----------------------------------------");
		System.out.println("Listado de Empleados");
		System.out.println("----------------------------------------");
		for(int i=0; i<MEmp.size();i++) {
			MEmp.get(i).showData2();
	    System.out.println("----------------------------------------");
	    System.out.println();
	    w.show2();
	    
		}
	}
	
}
