package dol;

import java.util.ArrayList;
import java.util.List;

public class Pp {

	private List<hourEmployee> HEmp;
	private List<monthEmployee> MEmp;
	
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
		}
	}
}
