package pack01_inter;
/*
extends <- 클래스 상속 : 내부에 있는 모든 멤버를 물려받아 사용을 가능하게 한다.(단일 상속)
implements <- 인터페이스 상속 : 인터페이스 내부에 있는 모든 메소드들을 재정의해서 구현할 수 있게 해줌*/
//인터페이스: 어떤 방법(메소드)을 구현할 것을 강제한다.
public class TestMain implements TestInterface {
	public static void main(String[] args) {
//		ip="1234"; // 상수이기에 인터페이스에서 최초에 값 할당 이후 값 수정 불가능.
		System.out.println(ip);
	}
	
	@Override
	public void test1() {
		
	}
	
	@Override
	public boolean join(String id, String pw) {
		return false;
	}
	
	@Override
	public void test2() {
		
	}

}
