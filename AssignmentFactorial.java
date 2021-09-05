package week1.day1;

public class AssignmentFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 6;
		int fact = 1;
		for (int a = 1; a <= i; a++) {
			fact = fact * a;
		}
		System.out.println("The factorial of number " + i + " is" + fact);
	}

}
