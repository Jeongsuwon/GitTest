package pack08_casting;

public class Ex01_Casting {

	public static void main(String[] args) {
		int iNum = 10; //정수형 변수 a를 초기화 하고 10을 담아둠
		double dNum = iNum;//더 큰 타입에 작은 타입을 담으면 자동 형변환
		
		System.out.println(iNum);
		System.out.println(dNum);
		double dNum2 = 30.5;
//		int iNum2 = dNum2; 큰 타입 -> 작은 데이터 타입 오류
//      명시적 형변환, DownCasting ==> casting의 일반적 의미
		int iNum2 = (int)dNum2;
		
		System.out.println(dNum2);
		System.out.println(iNum2);
		// dNum2는 실수형 데이터인데 정수형 데이터로 변환해서 소수점이 없어졌다.
		
		//byte < int
		int iN = 3;
		byte bN = (byte)iN;
		System.out.println(bN);
		
		
		
		
	
		

	}

}
