package entities;

public class Student {

	public String name;
	public double a1;
	public double a2;
	public double a3;

	public double finalGrade() {
		return (a1 + a2 + a3);
	}

	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}
	}

}
