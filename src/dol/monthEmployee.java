package dol;

public class monthEmployee extends Person {
	
	private Double minimumWage;
	private Double netSalary;
	
	public monthEmployee ( ) {
	
	}

	public monthEmployee(String firstName, String secondName, String fisrtLname, String secondLname,
			String eemployeNumb, Double minimumWage, Double netSalary, Integer Id) {
		super(firstName, secondName, fisrtLname, secondLname, Id);
		this.minimumWage = minimumWage;
		this.netSalary = netSalary;
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
	
	public void showData2 () {
		System.out.printf("\n#%s %s %s %s %s\n ", 
				getId(),
				getFirstName(),
				getSecondName(),
				getFisrtLname(),
				getSecondLname()
				);
		System.out.printf("\n Salario Minimo = %s \nSalario Neto = %s " ,
				getMinimumWage(),
				getNetSalary()
				);
	}

}
