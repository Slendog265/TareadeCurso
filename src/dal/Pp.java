package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dol.hourEmployee;
import dol.monthEmployee;
import ui.Menu;
import ui.MenuMEmp;

public class Pp {

	private List<hourEmployee> hEmp;
	private List<monthEmployee> MEmp;
	private String filePath;
	private String fileName;
	//Menu q = new Menu();
	MenuMEmp w = new MenuMEmp();
	
	public Pp() {
		hEmp = new ArrayList<hourEmployee>();
		MEmp = new ArrayList<monthEmployee>();
		
	}
	public Pp(List<hourEmployee> hEmp, List<monthEmployee> mEmp) {
		super();
		this.hEmp = hEmp;
		MEmp = mEmp;
	}
	public List<hourEmployee> getHEmp() {
		return hEmp;
	}
	public void setHEmp(List<hourEmployee> hEmp) {
		this.hEmp = hEmp;
	}
	public List<monthEmployee> getMEmp() {
		return MEmp;
	}
	public void setMEmp(List<monthEmployee> mEmp) {
		MEmp = mEmp;
	}
	public void addHoEmp (hourEmployee m) {
		this.hEmp.add(m);
	}
	public void addMEmp (monthEmployee f) {
		this.MEmp.add(f);
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void saveList() {
		
		File file = new File(filePath + "\\" + fileName);
		try {
			
			ObjectOutputStream os =  new ObjectOutputStream(new FileOutputStream(file));
			os.writeObject(hEmp);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<hourEmployee> openList() {
		File file = new File(filePath);
		try {
			ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
			List<hourEmployee> he = (List<hourEmployee>) o.readObject();
			o.close();
			return he;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void showData() {
		System.out.println("\033[35m===================================================\u001B[0m");
		System.out.println("|              Listado de Empleados               |");
		System.out.println("\033[35m===================================================\u001B[0m");
		for(int i=0; i<hEmp.size();i++) {
			//System.out.println("|     ID      |\n|   Nombres   |\n|  Apellidos  |\n|    Horas    |\n|   Tarifa    |\n| Horas Extra |\n|Tarifa Extra |\n|Salario Bruto|\n|Salario Neto |");
			hEmp.get(i).showData();
	    System.out.println("\n\033[35m===================================================\u001B[0m");
	    //System.out.println();
	    
	    
		}
	}
	
	public void showData2() {
		
		System.out.println("\033[35m===================================================\u001B[0m");
		System.out.println("|              Listado de Empleados               |");
		System.out.println("\033[35m===================================================\u001B[0m");
		for(int i=0; i<MEmp.size();i++) {
			MEmp.get(i).showData2();
	    System.out.println();
	    System.out.println("\033[35m===================================================\u001B[0m");
	    //System.out.println();
	  
	    
		}
	}
	
}
