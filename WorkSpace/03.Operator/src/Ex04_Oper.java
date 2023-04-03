
public class Ex04_Oper {

	public static void main(String[] args) {
		//사칙연산 + 나머지
		int value1 = 5, value2 = 2;
		
		//소괄호로 연산 우선순위를 높여주기.
		System.out.println("value1 + value2 = " + (value1 + value2));
		System.out.println("value1 - value2 = " + (value1 - value2));
		System.out.println("value1 * value2 = " + (value1 * value2));
		System.out.println("value1 / value2 = " + (value1 / value2));
		
		System.out.println("나머지는 %로 구한다 = " + (value1 % value2));
	}

}
