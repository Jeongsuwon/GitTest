package pack04_extend;

public class CellPhone {
	//1세대 폰: 전원을 켜고 끄는 기능과 통화기능이 있는 휴대폰
	String model;
	String color;
	final String chip = ""; //final이란 것은 처음에 값 할당 후 절대로 수정 불가!(final==최종)
							//상수라고도 표현하는데 변수의 이름을 지을 때는 반드시 전체 대문자로 해주기
							//(개발자끼리 알아보기 위한 약속)
	
	//powerOn: syso로 전원을 켭니다가 출력이 되는 return이 없는 메소드
	//powerOff: syso로 전원을 끕니다가 출력이 되는 return이 없는 메소드
	//bell:syso로 벨이 울립니다가 출력
	//sendVoice: String값을 입력받아 나: String 값을 syso로 출력하는 메소드
	//receiveVoice : ↑상대방 : String값 출력
	//hangUp: 전화를 끊습니다가 출력
	
	private void changeFolder() {
		System.out.println("1세대 폰의 모델 특성");
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String voice) {
		System.out.println("나 : " + voice);
	}
	
	void receiveVoice(String voice) {
		System.out.println("↑상대방 : " + voice );
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
