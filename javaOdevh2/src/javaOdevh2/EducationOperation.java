package javaOdevh2;

public class EducationOperation {
	public void finishandcontinue(Education education) {
		System.out.println("Bu bölümü tamamladýnýz.");
		education.completedWeek++;
		
		education.completed += 5;
		
		if(education.completed > 100) {
			education.completed = 100;
		}
	}
	public void sendcomment(String comment) {
		System.out.println(comment);
	}
}
