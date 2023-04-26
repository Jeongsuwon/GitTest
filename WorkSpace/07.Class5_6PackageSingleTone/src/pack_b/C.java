package pack_b;

import pack_a.B;
//import 다른 패키지의 클래스를 사용하겠다의 선언
//같은 이름의 메소드를 오류 없이 선언하여 사용하고 싶을 때 -->오버로딩
public class C {
	B b;
	C c1 = new C(1);
	C c2 = new C("한울");
	C c3 = new C(1, "한울");
	//필드부에서 C를 객체로 각각의 생성자 메소드를 이용해서 생성해보기.
	
	//생성자 메소드를 사용할 때 접근제한자의 차이를 만들어보기
	public C(int a, String b) {
		
	}
	

	C(int a){
		
	}
	
	private C(String b) {
		
	}
	
}
