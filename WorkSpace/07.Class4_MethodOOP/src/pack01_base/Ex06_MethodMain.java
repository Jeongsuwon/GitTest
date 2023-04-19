package pack01_base;

public class Ex06_MethodMain {

	public static void main(String[] args) {
		Ex06_Method me = new Ex06_Method();
		me.plus(1);
		me.plus1();
		me.plus2(3);		
		me.isPlus3();
		
		//메소드에 리턴타입이 주어지면 해당하는 타입의 변수
		//메소드에 리턴타입이 없으면 아무 타입도 아님
		
		System.out.println(me.aMethod()[0]);
		System.out.println(me.dMethod());
		System.out.println(me.sMethod());
		
		
	}

}
