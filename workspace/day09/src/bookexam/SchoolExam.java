package bookexam;

public class SchoolExam {	

	String name;
	String school;
	int grade;
	
	
	

	public SchoolExam() { };
	
	
	public SchoolExam(String name,String school, int grade ) {

		this.name = name;
		this.school = school;
		this.grade = grade;
		
				
	}
	

	public void showInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("School : " + this.school);
		System.out.println("Grade : " + this.grade);
		
	}
	
	
	

}
