package pack01_nasted;

import pack01_nasted.A.AA;
import pack01_nasted.A.B;
import pack01_nasted.A.C;

public class Main {
	//클래스의 중괄호 사이에 있는 모든 것 -> *멤버* : 인스턴스 멤버, 스태틱 멤버(static 여부)
	//전역 변수 : 클래스 내부에서 어디서든 사용가능
	
	//외부 클래스에서 다른 클래스 멤버에 접근 하는 방법
	//인스턴스 멤버 :  인스턴스화 과정 거쳐야만 접근 가능
	//스태틱 멤버 : 해당하는 클래스에 .찍어도 접근이 가능
public static void main(String[] args) {
	//인스턴스화 과정 : 생성자 메소드를 이용하거나 값 할당 등을 해서 null이 아닌 참조 상태로 만듦
	A a = new A(); //A클래스의 중괄호 사이의 모든 것(접근제한자 차이 제외)을 사용 가능
	System.out.println(a.aField);
	
	B b = a.new B();
	System.out.println(b.bField);
	b.methodB();
	
	System.out.println(C.fieldc);
	C c = new A.C();
	c.methodC();
	
	
	AA aa = new AA();
	AA.AAB aab = new AA.AAB();
	
	aab.methodAAB();
	
	A.AA.BB b1 = aa.new BB();
	b1.methodAAB();
	
	A.AA.BB.CC cc = b1.new CC();
	cc.methodAAB();
	
	A.AA.BB.CC.DD dd = cc.new DD();
	System.out.println(dd.a);
	
	
	
	

	
	
	

	
			
	
	
	
	
}
}
