package pack04_extend;

public class DmbPhone extends CellPhone{
	int channel;

	public DmbPhone(int channel, String color, String model) {
		super();
		this.channel = channel;
		this.color = color;
		this.model = model;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신시작");
	}
	
	void turnOffDmb() {
		System.out.println("방송 수신을 종료");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		turnOnDmb();
	}
	
	
}
