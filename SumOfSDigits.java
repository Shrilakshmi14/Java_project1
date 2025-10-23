package javaassignments;

public class SumOfSDigits {

	public static void main(String[] args) {
		
		int num=12350;
		int sum =0;
		
		while(num !=0) {
			int dig = num % 10;
			sum = sum + dig;
			num = num/10;
		}
		
		System.out.println("The sum is "+sum);
	}

}
