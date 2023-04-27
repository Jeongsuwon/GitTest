package pack03_inter;

public class RemoteMain {

	public static void main(String[] args) {
		Audio audio = new Audio();
		
		audio.turnOn();
		audio.turnOff();
		audio.setVolume(100); //인터페이스 부분을 이용해서 audio의 최소 볼륨과 최대 볼륨을 기입해주면 좋음

		Television tv = new Television();
		
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(100); //인터페이스 부분을 이용해서 audio의 최소 볼륨과 최대 볼륨을 기입해주면 좋음
		
		//다형성 : 인터페이스를 상속받은 객체 Audio & Television은 공통적으로 turnOn, turnOff, setVolume을
		//			가지고 있음. 따라서 RemoteControl(Interface)==Audio==Television
		
		RemoteControl[] rcArr = new RemoteControl[2];
		rcArr[0] = new Television();
		rcArr[1] = new Audio();
		for (int i = 0; i < rcArr.length; i++) {
			rcArr[i].turnOn();
		}
		
	}

}
