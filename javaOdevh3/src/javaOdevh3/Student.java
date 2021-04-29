package javaOdevh3;

public class Student extends User implements StudentManager{
	private String[] finishedEducations;
	
	
	public Student(int id, String userName, String password,String[] finishedEducations) {
		super(id, userName, password);
		this.finishedEducations = finishedEducations;
		
	}


	@Override
	public void learnJava() {
		System.out.println("Video izlendi.");
		
	}

}
