package pack03_inter;

public class Television implements RemoteControl {

	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV에 전원을 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("TV에 전원을 끕니다");		
	}
	
	public void audio() {
		System.out.println("TV만의 고유 기능");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else if(volume<MIN_VOLUME){
			this.volume = MIN_VOLUME;
		}else {
		this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
}
