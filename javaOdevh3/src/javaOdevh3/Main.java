package javaOdevh3;

public class Main {

	public static void main(String[] args) {
		String[] finishedEducations = {"Java"}; 
		Student furkanStudent = new Student(1, "furkan", "12345", finishedEducations);
		String[] educations = {"Java","C#","Python"};
		Instructor enginDemirogInstructor = new Instructor(2, "Engin", "12345", educations);
		
		furkanStudent.singIn();
		enginDemirogInstructor.singIn();
		enginDemirogInstructor.teachACourse(educations[0]);
		furkanStudent.learnJava();
		
		

	}

}
