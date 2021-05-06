package Entities;

public class Player {
	private int id;
	private String firstName;
	private String LastName;
	private int birthOfYear;
	private String NationalId;
	
	public Player() {
	}
	
	public Player(int id, String firstName, String lastName, int birthOfYear, String nationalId) {
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.birthOfYear = birthOfYear;
		NationalId = nationalId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}

	public String getNationalId() {
		return NationalId;
	}

	public void setNationalId(String nationalId) {
		NationalId = nationalId;
	}
	
	
}
