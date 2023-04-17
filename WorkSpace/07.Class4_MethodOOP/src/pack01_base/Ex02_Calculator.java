package pack01_base;

public class Ex02_Calculator {
	//static 키워드가 있는지 없는지의 판단 (멤버 구분의 매우 중요!!)
	//메소드의 구조.
	//생성자 메소드(Constuctor) : 객체를 생성할 때 필요한 메소드
	
	//void 메소드이름(파라미터부){
	// 메소드 내용(코드)
	//}
	//파라미터부: 어떤 것이든 메소드가 실행될 때 필요한 변수, 클래스 등의 
	//			  정보가 있다면 받아오게끔 처리하는 부분
	
	void powerOn(int power) {
		if(power<1) {
			System.out.println("배터리가 부족합니다. 충전하세요!");
			powerOff();
		}else
		System.out.println("전원을 켭니다.");
	}
	
	//powerOff에서 메인에 접근이 되는 이유 : main의 static은 인스턴스화 과정이 없이 *메모리에 항상 먼저 올라가있기때문에*
	//main에서 powerOff에 접근이 안되는 이유 : iv는 인스턴스화를 거쳐야하기에 static이 호출 시 메모리에 존재하고 있을지 의문
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//void인지 void가 아닌지에 따라 리턴타입이 결정된다.
	//내가 알고있는 모든 타입 -> 리턴 타입으로 사용이 가능
	//void : return이 없는 타입 -> 작업 후 결과가 필요가 없는 타입
	
	//return 타입이 void가 아니게 주어지면 해당하는 타입을 반환하는 return 키워드가 반드시 필요하다.
	int test() {
		return 0;
	}
	
	int plus(int x, int y) {
		return x+y;
		//return하면 메소드 자체가 메모리에서 사라짐!
	}
	
	int plus3(int arr[]) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += i;
		}
		return sum;
	}
}	
