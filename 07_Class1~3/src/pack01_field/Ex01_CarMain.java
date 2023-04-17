package pack01_field;

public class Ex01_CarMain {
	public static void main(String[] args) {
		
		Ex01_Car car = new Ex01_Car();//인스턴스화: 객체(클래스)를 메모리에 올려서 사용하게 만드는 것
									  //+내부에 있는 모든 멤버가 메모리에 올라가는 것
		System.out.println("제조사: "+car.company);
		System.out.println("차종: "+car.model);
		System.out.println("색상: "+car.color);
		System.out.println("최고속도: "+car.maxSpeed);
		System.out.println("현재속도: "+car.speed);
		
		System.out.println("사용자가 화면에 앞으로 가기를 눌렀다.");
		car.speed=30;
		System.out.println(car.model+"가 " + car.speed +  "속도로 앞으로 달리기 시작");
	}
}
