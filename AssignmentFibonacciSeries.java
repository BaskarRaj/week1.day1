package week1.day1;

public class AssignmentFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 1, sum;
		System.out.println(i);
		System.out.println(j);
		for (int a = 1; a <=8; a++) {
			sum = i + j;
			i = j;
			j = sum;
			System.out.println(sum);
		}

	}
}