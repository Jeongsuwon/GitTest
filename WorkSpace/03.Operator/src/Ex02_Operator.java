
public class Ex02_Operator {

	public static void main(String[] args) {
//		증감, 가감
		int num1 = 1, num2=1;
		System.out.println("후행증감 : " + num1++); //후행
		System.out.println("선행증감 : " + ++num2); //선행
		
		System.out.println(num1--); // 2
		System.out.println(--num2); // 1
	}

}
