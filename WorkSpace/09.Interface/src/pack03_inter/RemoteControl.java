package pack03_inter;

public interface RemoteControl {
	//Audio, Tv 공통된 기능을 무조건 구현하게 만들 예정
	//전원을 on, off
	//볼륨 조절
	int MIN_VOLUME = 0;
	int MAX_VOLUME = 10;
	//추상 메소드
	void turnOn(); //전원을 on
	void turnOff(); //전원을 off
	
	void setVolume(int volume);
	
}
