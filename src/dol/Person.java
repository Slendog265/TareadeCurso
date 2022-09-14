package dol;

public class Person {
	
	private String firstName;
	private String secondName;
	private String fisrtLname;
	private String secondLname;
	private Integer Id;

	public Person() {
		super();
	}

	public Person(String firstName, String secondName, String fisrtLname, String secondLname, Integer id) {
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

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

}