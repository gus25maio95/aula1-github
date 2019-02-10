package entities;

public class Student {
	
	public String name;
	public double gradeOne;
	public double gradeTwo;
	public double gradeThree;
			
	public double finalGrade(){
		return gradeOne + gradeTwo + gradeThree;
	}
	
	public double missingPoints() { 
		return (finalGrade() - 60)*-1;
	}

	public String toString(){
		return String.format("FINAL GRADE: %.2f", finalGrade());	
		}
	
	
}
