package week1.day1;

public class AssignmentConvertNegativeToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = -40;
		int positiveNum;
		if (number < 0) {
			positiveNum = Math.abs(number);
			System.out.println("Converted " + number + " to positive number " + positiveNum);
		} else if (number > 0) {
			System.out.println("The number is positive " + number);
		} else {
			System.out.println("The number is " + number + " is neither positive or negative");
		}
	}

}
