package javaassignments;

public class CalculateDigits {

	public static void main(String[] args) {
		
//		int num=1232120;
//		int originalnum = num;
//		int rev =0;
//		int count=0;
//		
//		while(num !=0) {
//			int dig = num % 10;
//			rev = rev * 10 + dig;
//			num = num/10;
//			count ++;
//		}
		
		int count =0;
		int num=12340;
		
		while(num>0)
		{
			num = num/10;
			count++;
		}
		
		System.out.println(count);

	}

}
