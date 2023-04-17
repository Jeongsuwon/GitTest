package pack01_class;

public class Ex01_StudentMain {
	public static void main(String[] args) {
		//모든 클래스는 우리가 변수처럼 메모리에 올리고 사용이 가능한 것<-
		//클래스의 초기화 식
		//객체지향 : 한 번 만들어놓은 기능을 계속해서 재활용 할 수 있게함.
		//잘 만들어놓은 기능을 여러군데에서 사용하기때문에 기능추가를 하나의 클래스에만 해도 공통적으로 모두 적용
		Ex01_Student es1 = new Ex01_Student();
		es1.나이="12";
		es1.성별="남";
		es1.이름="김학도";
		es1.study();
		Ex01_Student es2 = new Ex01_Student();
		es2.나이="12";
		es2.성별="남";
		es2.이름="김남자";
		es2.study();
		System.out.println(es1.나이+es1.성별+es1.이름);
		System.out.println(es2.나이+es2.성별+es2.이름);
		System.out.println("es1 변수가 Student 객체를 참조합니다." + es1);
//		es1 = null;
//		Ex01_Student es2 = null;
//		
//		if(es1 == es2) {
//			System.out.println("?" + es1 + "/" + es2);
//		}else {
//			System.out.println("참조가 다름");
//		}
		
	}
}
