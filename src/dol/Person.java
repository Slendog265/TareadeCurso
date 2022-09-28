package dol;

public class Person {
	
	private String firstName;
	private String secondName;
	private String fisrtLname;
	private String secondLname;
	private String Id;

	public Person() {
		super();
	}

	public Person(String firstName, String secondName, String fisrtLname, String secondLname, String id) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.fisrtLname = fisrtLname;
		this.secondLname = secondLname;
		this.Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFisrtLname() {
		return fisrtLname;
	}

	public void setFisrtLname(String fisrtLname) {
		this.fisrtLname = fisrtLname;
	}

	public String getSecondLname() {
		return secondLname;
	}

	public void setSecondLname(String secondLname) {
		this.secondLname = secondLname;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

}