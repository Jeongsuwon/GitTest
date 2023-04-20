package pack01_base;

import java.util.Scanner;

public class Ex06_Method {
	//return이 없는 메소드 2개(파라미터 있음, 없음)
	//return이 있는 메소드 2개(파라미터 있음, 없음)
	

	int iNum;
	String str;
	
	void plus(int iNum) {
		System.out.println("return이 없고 파라미터 있다." + iNum);
	}
	void plus1(){
		
		System.out.println("return이 없고 파라미터 없다.");
	}
	
	int plus2(int iNum) {	
		System.out.println("return이 있고 파라미터 있다."+ iNum);
		return iNum;
		
	}
	
	boolean isPlus3() {
		System.out.println("return이 있고 파라미터 없다.");
		return true;
	}
	
	String sMethod() {
		return "실습";
	}
	
	double dMethod() {
		return 3.14;
	}
	
	int[] aMethod() {
		return new int[1] ;
	}
	
	Scanner scanMethod() {
		return null ; // 해당 메소드를 이용해서 스캐너 기능 사용시 NullPointerException발생
	}
	
}
