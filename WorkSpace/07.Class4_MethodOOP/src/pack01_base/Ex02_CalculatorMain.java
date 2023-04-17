package pack01_base;

public class Ex02_CalculatorMain {

	public static void main(String[] args) {
		Ex02_Calculator cc = new Ex02_Calculator();
		cc.powerOn(0);
		cc.powerOff();
		int result = cc.test()+10; // int타입을 무조건 return함. -> int형 변수랑 같이 취급
		System.out.println(result);
		System.out.println(cc.plus(3, 4));
//		System.out.println(cc.plus3());
//		System.out.println(cc.plus3(1, 2, 3)/3);
		
	}

}
