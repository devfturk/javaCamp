package Entities;

public class Customer {
	public int id;
	public String firstName;
	public String lastName;
	public String dateString;
	public String nationalId;
	
	public Customer(int id, String firstName, String lastName, String dateString, String nationalId) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateString = dateString;
		this.nationalId = nationalId;
	}
	
	
}
