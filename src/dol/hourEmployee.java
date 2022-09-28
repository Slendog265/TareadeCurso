package dol;

public class hourEmployee extends Person {
	
	private int Hour;
	private Integer xtraHours;
	private Integer Tar;
	private Integer xtraTar;
	private Integer BruteWage;
	private Double NetSalary;
	
	
	
	public hourEmployee() {
		
	}

	public hourEmployee(String firstName, String secondName, String fisrtLname, String secondLname, String id, int hour,
			Integer xtraHours, Integer tar, Integer xtraTar, Integer bruteWage, Double netSalary) {
		super(firstName, secondName, fisrtLname, secondLname, id);
		Hour = hour;
		this.xtraHours = xtraHours;
		Tar = tar;
		this.xtraTar = xtraTar;
		BruteWage = bruteWage;
		this.BruteWage = bruteWage;
		NetSalary = netSalary;
		this.NetSalary = netSalary; 
		
	}

	public int getHour() {
		return Hour;
	}

	public void setHour(int i) {
		Hour = i;
	}

	public Integer getXtraHours() {
		return xtraHours;
	}

	public void setXtraHours(Integer xtraHours) {
		this.xtraHours = xtraHours;
	}

	public Integer getTar() {
		return Tar;
	}

	public void setTar(Integer tar) {
		Tar = tar;
	}

	public Integer getXtraTar() {
		return xtraTar;
	}

	public void setXtraTar(Integer xtraTar) {
		this.xtraTar = xtraTar;
	}
	
	
	public Integer getBruteWage() {
		return BruteWage;
	}

	public void setBruteWage(Integer bruteWage) {
		BruteWage = bruteWage;
	}
	
	

	public Double getNetSalary() {
		return NetSalary;
	}

	public void setNetSalary(Double netSalary) {
		NetSalary = netSalary;
	}

	public void showData () {
	
		
		System.out.println("----------------------------------------");
		System.out.printf("|#"+ getId() + "|"+ getFirstName() + " "+ getSecondName() 
		+ " "+ getFisrtLname() + " "+ getSecondLname() +"|"+ getHour()+"|"+ getTar()+"|"+ getXtraHours()
		+"|"+ getXtraTar()+"|"+ getBruteWage()+"|"+ getNetSalary()+"|");

		
	}
	

}
