package pack04_extend;

public class SmartPhone extends DmbPhone{
//	암시적 슈퍼 생성자 DmbPhone()은 기본 생성자에 대해 정의되지 않습니다. 명시적 생성자를 정의해야 합니다.
	int internet;
	public SmartPhone(int channel, String color, String model, int internet) {
		super(channel, color, model); //부모 클래스가 별도의 생성자 메소드를 가지고 있다면
									  //해당하는 부모 클래스가 인스턴스화 되어야지만, 자식 객체도 생성 가능
		this.internet = internet;
	}
	@Override
	void powerOn() {
		super.powerOn();
	}
	
	public void internetOn() {
		System.out.println("인터넷을 합니다.");
	}
	
	
	
}
