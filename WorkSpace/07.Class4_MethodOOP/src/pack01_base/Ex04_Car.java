package pack01_base;

public class Ex04_Car {
	//해당하는 Car클래스는 속성 gas를 가진다.
	//gas는 숫자형태로 속성이 관리가 된다.(Ex04_Car는 gas를 무조건 입력받아야지만 생성이 가능한 클래스)
	
	int gas;

	public Ex04_Car(int gas) {
		this.gas = gas;
	}
	
	//isLeftGas라는 메소드를 구현해보기.
	//해당하는 메소드는 true 또는 false 결과만 리턴하는 메소드이다.
	//true, false의 판단은 gas가 0인경우 "false와 gas가 없습니다"라는 메세지가 콘솔에 출력,
	//그게 아니라면 "true와 gas가 있습니다" 라는 메세지
	boolean isLeftGas() { //앞에 is 또는 뒤에 has로 끝나는 것은 boolean 타입 리턴
		if(gas==0) {
			System.out.println(false + "gas가 없습니다.");
		}else {
			System.out.println(true + " / gas가 있습니다.");
		}
		return true;
	}
	
	

}
