package dol;

public class monthEmployee extends Person {

	private String eemployeNumb;
	private Double minimumWage;
	private Double netSalary;
	
	public monthEmployee ( ) {
	
	}

	public monthEmployee(String firstName, String secondName, String fisrtLname, String secondLname,
			String eemployeNumb, Double minimumWage, Double netSalary, Integer Id) {
		super(firstName, secondName, fisrtLname, secondLname, Id);
		this.eemployeNumb = eemployeNumb;
		this.minimumWage = minimumWage;
		this.netSalary = netSalary;
	}

	public String getEemployeNumb() {
		return eemployeNumb;
	}

	public void setEemployeNumb(String eemployeNumb) {
		this.eemployeNumb = eemployeNumb;
	}

	public Double getMinimumWage() {
		return minimumWage;
	}

	public void setMinimumWage(Double minimumWage) {
		this.minimumWage = minimumWage;
	}

	public Double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}
	
	

}
