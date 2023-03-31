package pack03_Decimal;

public class Ex01_Decimal {

	public static void main(String[] args) {
		int i = 1234567890;
		System.out.println(i);
		//int 이상의 값을 담을 수 있는 정수형 데이터 타입이 존재
		
		long l1;
		long l2 = 12345678901L; // 숫자 뒤에 long타입이라는 구분자 L 
		System.out.println(l2);
		
		//실수형 데이터 타입 : float , double
		//실수형은 소숫점이 있는 것을 표현하기 위해 존재
		//float는 long과 마찬가지로 값 뒤에 구분자 F 붙이기
		
		float a;
		a = 3.14234f;
		//float a = 3.14234f; -->초기화
		
		double b;
		b = 3.14;
		//double b = 3.14; --> 초기화
		
		System.out.println(a);
		System.out.println(b);
		
		//대표적 : int, double
	}

}
