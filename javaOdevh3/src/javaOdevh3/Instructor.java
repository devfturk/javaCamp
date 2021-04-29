package javaOdevh3;

public class Instructor extends User implements InstructorManager{
	private String[] educations;
	
	public Instructor(int id, String userName, String password,String[] educations) {
		super(id, userName, password);
		this.educations = educations;
	}

	@Override
	public void teachACourse(String course) {
		System.out.println(course + "Eðitim veriliyor.");
		
	}
	
}
