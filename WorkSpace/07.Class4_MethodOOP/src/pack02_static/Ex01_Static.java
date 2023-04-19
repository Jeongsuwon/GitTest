package pack02_static;

public class Ex01_Static {
	//static의 여부에 따라서 멤버 구분, 메모리에 올라가는 순서가 다르다.
	//멤버 : 클래스의 멤버 -> 클래스의 중괄호 사이에 있는 모든 것들
	
	
	static void sMethod() {
		System.out.println("스태틱 멤버입니다.");
//		iMethod(); //접근 불가 -> static은 프로그램 시작전에 메모리에 할당되어있기에, 다른 메소드 호출 시 존재하는지 알 수가 없음
	}
	
	void iMethod2() {
		iMethod(); //iv 접근가능   -> 인스턴스화 과정 후에 메모리에 할당되기에, 존재하고 있는 것을 알 수가 있어 확실하게 호출할 수 있음..
		sMethod(); //sv 접근가능
	}
	
	
	//인스턴스 멤버 : 인스턴스화 과정 후에 메모리에 할당, 프로그램 종료 시 소멸
	void iMethod() {
		System.out.println("인스턴스 멤버입니다.");
	}
	
	//static 멤버 : 프로그램 시작전에 먼저 메모리에 할당, 프로그램 종료 시 소멸
	public static void main(String[] args) {
//		Ex01_Static st = new Ex01_Static();
//		st.iMethod();
		sMethod();
	}
}
