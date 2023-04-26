package pack03_extend;

public class ExamMain {
	//1.상속 방법:class 클래스(자식) extends 클래스(부모)
	//2.자식 클래스는 부모 클래스로부터 메소드와 필드 물려받아 사용
	//3.부모 클래스는 자식 클래스에서 정의한 메소드나 필드를 사용하지 못한다.
	//4. * extends로 클래스의 상속은 한가지만 가능하다(단일 상속)
	//5.부모 클래스는 여러 자식 클래스가 있을 수 있다.
	//6.자식 클래스가 당연하게도 더 많은 기능을 가지고 있기때문에 특별한 경우가 아니면
	//  자식 클래스를 인스턴스화하는게 효율적이고 생산적

	public static void main(String[] args) {
		
		SuperClass sc = new SuperClass();
		sc.sum(2, 1);
		sc.minus(2, 1);
		
		SubClass sub = new SubClass();
		sub.sum(2, 1);
		sub.nanugi(2, 1);
		
	}

}
