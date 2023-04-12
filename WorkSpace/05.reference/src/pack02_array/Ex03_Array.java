package pack02_array;

public class Ex03_Array {

	public static void main(String[] args) { 
		//arguments(인수, 파라미터) : main메소드 실행전 필요한 것
		//args[0]을 출력하면 오류 발생, 내가 만든 배열로 똑같은 오류 만들기
		
//		String[] strArray1 = new String[0];
//		System.out.println(strArray1[0]);
		args = new String[1]; // 코드로 푸는 방법
		System.out.println(args[0]);
		
		//String 타입을 가지는 배열 크기는 10
		int[] arrayInt = new int[10];
		//int[0] -> 숫자 형태의 변수타입은 전부 0
//		String[] arrayStr = new String[10];
		//String[0] -> 참조형 변수들의 초기값 null
		String[] arrayStr = {"강아지","고양이","코끼리"};
		System.out.println(arrayStr[0]);
		System.out.println(arrayStr[1]);
		System.out.println(arrayStr[2]);
		
		int[] intArray = {1, 2, 3, 4, 5};
		//배열의 크기가 커지면 불편
	}

}
