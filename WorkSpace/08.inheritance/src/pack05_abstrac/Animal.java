package pack05_abstrac;

//추상 클래스라는 것은 객체로 만들려고 사용하는게 아니다.
//객체로 만드는게 아니라 부모로써 상속받은 객체들의 방법을 미리 저장해놓은 것(구조)
public abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("동물이 숨을 쉰다.");
	}
	
	public abstract void sound(); // abstract메소드는 메소드의 리턴타입이나 메소드의 이름, 매개변수 등의
								  // 구조만 만드는 형태, 실제 구현은 자식클래스가 재정의
	
}
