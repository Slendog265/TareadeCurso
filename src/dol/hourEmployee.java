package dol;

public class hourEmployee extends Person {
	
	private Integer Hour;
	private Integer xtraHours;
	private Integer Tar;
	private Integer xtraTar;
	
	
	
	public hourEmployee() {
		
	}

	public hourEmployee(String firstName, String secondName, String fisrtLname, String secondLname, Integer hour,
			Integer xtraHours, Integer tar, Integer xtraTar) {
		super(firstName, secondName, fisrtLname, secondLname, xtraTar);
		Hour = hour;
		this.xtraHours = xtraHours;
		Tar = tar;
		this.xtraTar = xtraTar;
	}

	public Integer getHour() {
		return Hour;
	}

	public void setHour(Integer hour) {
		Hour = hour;
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
	
	public void showData () {
		System.out.printf("\n#%s %s %s %s %s\n ", 
				getId(),
				getFirstName(),
				getSecondName(),
				getFisrtLname(),
				getSecondLname()
				);
		System.out.printf("\n Horas de Trabajo = %s \nHoras de Trabajo Extras = %s \nTarifa = %s \nTarifa Extras = %s\n" ,
				getHour(),
				getTar(),
				getXtraHours(),
				getXtraTar());
	}
	

}
