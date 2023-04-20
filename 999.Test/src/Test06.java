public class Test06 {

	public static void main(String[] args) {
		int kor, math, eng, sci, play;
		kor = 50;
		math = 60;
		eng = 70;
		sci = 80;
		play = 90;
		
		System.out.println(kor);
		System.out.println(math);
		System.out.println(eng);
		System.out.println(sci);
		System.out.println(play);
		
		// 형변환(casting) : 서로 다른 타입의 변수를 변환시켜 사용함.
		// ex) int <-> double , String <-> int
		// int<double
		int iValue = 10;
		double dValue = iValue + 0.5; // 자동 형변환
		System.out.println("iValue 값 : " + iValue);
		System.out.println("dValue 값 : " + dValue);
		
		//더 큰 데이터 타입을 작은 타입에 담을 때 오류 발생
		//개발자가 어떤 타입으로 바꿀건지 명시를 해줘서 강제로 바꿈
		iValue = (int)dValue;//강제 형변환
		
		System.out.println("iValue 값 : " + iValue);
		System.out.println("dValue 값 : " + dValue);
		
		String str = "1234"+12; // 123412
		//문자열에 어떤 값을 더하는 것 == 합x => 결합 (글자의 합침)
		
		int iData = 1234 + 12; //1246
		
		//숫자형 데이터의 합은 == 합 => 값의 합침
		
		System.out.println(str);
		
		//str에는 현재 123412라는 문자열이 저장되어있음
		System.out.println(Integer.parseInt(str)+1);
		
		// boolean -> true 또는 false만 저장이 가능함.
		int a=2, b=3;
		System.out.println(a > b ? 3 : 4);
		
	}

}
