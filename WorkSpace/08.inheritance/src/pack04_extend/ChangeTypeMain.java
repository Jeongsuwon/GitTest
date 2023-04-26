package pack04_extend;

public class ChangeTypeMain {

	public static void main(String[] args) {
		//CellPhone은 부모클래스이기때문에 자식클래스의 일부가 그대로 존재
		//자식클래스를 부모클래스에 담게 되면 그 기능을 그대로 사용 가능
		
		CellPhone cp = new DmbPhone(1, "색상", "모델");
		CellPhone cp2 = new SmartPhone(1, "색상", "모델",5);
		cp2.powerOn(); //자식 클래스에서 재정의 된 메소드가 호출
		CellPhone[] cpArr = new CellPhone[2];
		cpArr[0] = new DmbPhone(1, "색상", "모델");
		cpArr[1] = new SmartPhone(1, "색상", "모델",5);
		
		for (int i = 0; i < cpArr.length; i++) {
			cpArr[i].powerOn();
		}
		
		//변수타입변환 중에 자동과 강제(ex)int, double
		//자동: double형에 int형을 대입할 때 int형의 메모리 크기가 더 작기때문에 double선언에서는 int 자동변환 
		//강제: int형에 double을 대입할 때는 double의 메모리 크기가 더 크기때문에 강제적으로 int를 선언해줘서 변환
		
		SmartPhone sp = (SmartPhone) new DmbPhone(1, "색상", "모델"); //자식 = 부모; 강제 캐스팅 해줘야 함
		sp.powerOn();
	}

}
