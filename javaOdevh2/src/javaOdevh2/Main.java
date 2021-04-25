package javaOdevh2;

public class Main {

	public static void main(String[] args) {
		EducationOperation eop = new EducationOperation();
		Teacher teacher1 = new Teacher(1, "Engin", "Demiro�");
		Teacher teacher2 = new Teacher(2, "Furkan", "T�rk");
		
		Education dotnet = new Education("C# Kamp�", 45, teacher1, 4);
		Education java = new Education("Java Kamp�", 32, teacher1, 2);
		
		Teacher[] teachers = {teacher1,teacher2};
		Education[] educations = {dotnet,java};
		
		for (Education education : educations) {
			System.out.println(education.name );
		}
		System.out.println("--------------------------------------------------");
		for (Teacher teacher : teachers) {
			System.out.println(teacher.name + " " + teacher.lastname);
		}
		System.out.println("--------------------------------------------------");
		String comment = "Selam�n aleyk�m ben f.T�rk �devi yap�yom.";
		eop.finishandcontinue(java);
		eop.sendcomment(comment);
	}

}
