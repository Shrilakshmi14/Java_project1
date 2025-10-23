package javaassignments;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=123212;
		int originalnum = num;
		int rev =0;
		
		while(num !=0) {
			int dig = num % 10;
			rev = rev * 10 + dig;
			num = num/10;
		}
		
		if(originalnum == rev) {
			System.out.println("The number is Palindrome");
		}
		else {
			System.out.println("The number is not Palindrome");
		}

	}

}
