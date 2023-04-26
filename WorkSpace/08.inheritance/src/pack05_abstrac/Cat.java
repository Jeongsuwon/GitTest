package pack05_abstrac;

//고양이 : 동물, 동물의 특성을(기본적인 특성) 상속받아 구현해야될 자식클래스
public class Cat extends Animal{

	@Override
	public void sound() {//추상 메소드에서 abstract로 지정해놓은 구조를 가진 메소드는 반드시
						 //자식 객체가 재정의 후 구현
		System.out.println("야옹");
		
	}

}
