package pack01_inter;

//추상 == abstract : 메소드의 return타입, 메소드명, 파라미터만 지정이 되어있으며 실제 구현은 상속을 받은 객체가 
//					 override를 통해서 해야한다(방법만 제시)
/*
interface : ↑용도로 사용하기 위해서 만든 .java파일
대규모 프로젝트에서 어떤 방법을 일원화하기 위해서 많이 사용됨(전자정부 프레임워크)*/

public interface TestInterface {
	
	String ip=""; //인터페이스 내부에서 만든 변수는 상수(final)
	
	//abstract가 앞에 붙어있다고 생각
	void test1();
		
	boolean join(String id, String pw);
	
	void test2();
	

}
