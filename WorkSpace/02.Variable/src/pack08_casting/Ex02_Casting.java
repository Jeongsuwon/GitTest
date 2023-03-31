package pack08_casting;

public class Ex02_Casting {

	public static void main(String[] args) {
		
		//문자열 = "12" + 34 = 1234
		//String + int = String
		//why? 문자열 + 어떤값 = 문자열 규칙!
		//문자열 결합의 법칙 ↑
		
		String sum = "12"+34;
		System.out.println(sum);
		
		
		//어떤 값을 String으로 바꾸는 것은 엄청나게 간단하다.
		
		String sum1 = 1234+"";
		System.out.println(sum1);
		
		
		
		//String sum, sum2 변수에 문자열로 숫자를 저장해둠.
		//두 개의 합을 알고싶다. "1234" + "1234" = 12341234
		//String => int?
		//int, double 등의 보라색으로 글씨 바뀌는 것 =>기본타입
		//대문자로 시작하는 것은 대부분 Class타입
		//기본 데이터 타입은 Wrapper class라는 것을 가지고 있다.
		//int => Integer , double Double
		//String을 해당하는 타입으로 바꿔주는 행위를 하는 것
		//String에 있는 ""를 제거한다.
		int num = Integer.parseInt(sum)+1234;
		System.out.println(num);
		
		int num2 = Integer.parseInt(sum1);
		System.out.println(num2);
		
		String sAvg = "88.6";
		double dAvg = Double.parseDouble(sAvg)+10;

		System.out.println(dAvg);
		
		//WrapperClass.parseDataType(String);=> DataType
		
		String str = "정수원";
		//해당 데이터를 숫자로 바꿀 수 있을까?
		int str1=Integer.parseInt(str);
		//콘솔 창을 확인하기( 빨간색 줄 == 오류)
		
		
		System.out.println(str1);
		

		
	}

}
