package pack01_base;

public class Ex05_Constructor {
	int id = 2;
	String pw;
	public Ex05_Constructor(String pw) {
		this.pw = pw;
	}
// 1. 쓸데없이 컴퓨터 메모리를 차지 / 2. 어떤 것을 호출할지 모름(컴퓨터는 오류라고 인식 -> true or false)
//	public Ex05_Constructor(String pw) {
//		this.pw = pw;
//	}
	//생성자 메소드 오버로딩 : 같은 이름의 메소드를 파라메터의 개수나 타입을 달리하여 중복시켜 정의하는 것
	
	public static void main(String[] args) {
		Ex05_Constructor cons = new Ex05_Constructor("실습");
		System.out.println(cons.id);
		System.out.println(cons.pw);
	}
	
	
}
