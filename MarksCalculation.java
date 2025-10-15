package firstpackage;

public class MarksCalculation {

	public static void main(String[] args) {
		
		int math = 100;
		int science = 90;
		int english = 97;
		
		int total = math+science+english;
		
		//double average = total/3.0;
		float average = total/3.0f;
		
		System.out.println("Math marks = "+ math);
		System.out.println("Science marks = "+ science);
		System.out.println("English marks = "+ english);
		
		System.out.println("Total Marks = "+ total);
		System.out.println("Average Marks = "+ average);

	}

}
