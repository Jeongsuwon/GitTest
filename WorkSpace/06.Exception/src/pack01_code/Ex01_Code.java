package pack01_code;

import java.util.Scanner;

public class Ex01_Code {
	public static void main(String[] args) {
		//코드에서 바로 검출되는 예외(오류)가 아니라, 실행해야지만 알 수 있는 오류를 만들어보기
		//int[] arr = 10; <- 바로 IDE(이클립스)가 오류 인식
		
//		String str = null;
//		System.out.println(str.length());
		
		Scanner sc = null;
		sc=new Scanner(System.in);
		sc.nextLine();
		
		System.out.println(args[1]); //java.lang.ArrayIndexOutOfBoundsException 오류
	}
}
