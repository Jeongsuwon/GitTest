package pack01_base;

public class Ex04_CarMain {

	public static void main(String[] args) {
		Ex04_Car car = new Ex04_Car(3);
		while(car.isLeftGas());
		if(car.isLeftGas()) {
			System.out.println("자동차가 달립니다.");
			car.gas--;
		}else {
			
		}
	}

}
