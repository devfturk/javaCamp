package javaOdevh3;

public class User implements UserManager {
	private int id; 
	private String userName;
	private String password;
	
	
	public User(int id, String userName, String password) {
		
		this.id = id;
		this.userName = userName;
		this.password = password;
	}


	@Override
	public void singIn() {
		System.out.println(userName + " Giriþ yapýldý.");
		
	}
	
	
	
}
