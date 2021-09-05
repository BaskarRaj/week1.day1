package week1.day1;

public class AssignmentPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 14;
		boolean flag = false;
		for (int a = 2; a <= i / 2; a++) {
			if (i % a == 0) {
				flag = true;
				break;
			}

		}
		if (flag != true) {
			System.out.println("The number " + i + " is prime number");
		} else {
			System.out.println("The number " + i + " is not a prime number");
		}

	}

}
