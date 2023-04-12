package pack01_string;

import java.util.Scanner;

public class Ex01_String {

	public static void main(String[] args) {
		//String : 기본형 변수 x, 참조형 변수
		//참조형 변수는 스택이라는 메모리 공간에 힙 영역의 주소만 저장, 실제 값은 힙 영역
		//(기본형 변수는 힙 영역 사용 x)
		
		String strVar1="JSW";
		String strVar2="JSW";
		//두 개를 비교시 결과가 TRUE / FALSE?
		//1. 답 : FALSE / 메모리에 주소만 저장되어있고 값은 저장되어 있지 않기에  
		
		//2. if문으로 비교
		if(strVar1==strVar2) {
			System.out.println("같다");
		}else {
			System.out.println("같지않다");
		}
		
		
		//new <- 힙 영역에 공간을 만들다.
		String strVar3 = new String("JSW");
		String strVar4 = new String("JSW");
		
		Scanner sc = new Scanner(System.in);
		
		String strVar5 = sc.nextLine(); // 이니셜을 대문자로 입력하기.
		
		if(strVar1==strVar5) {
			System.out.println("strVar1==strVar5");
		}else if(strVar1==strVar3) {
			System.out.println("strVar1==strVar3");
		}else {
			System.out.println("strVar1, strVar3, strVar5");
		}
		
		if(strVar3==strVar4) {
			System.out.println("같다");
		}else {
			System.out.println("같지않다");
		
		}
		
	}

}
