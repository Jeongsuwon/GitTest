package pack01_thread;

public class Ex02_BeefMain {
	public static void main(String[] args) {
//		Ex02_BeepTask eb = new Ex02_BeepTask(); -> 인스턴스화 : 객체를 메모리에 올려서 (eb) 사용할 준비
		Runnable eb = new Ex02_BeepTask(); //같은 구조를 가지고 있기때문에.(run)
		//객체를 생성할 때 쓰이는 메소드 : 생성자 메소드
		//생성자 메소드는 클래스의 이름과 똑같음.
		//메소드이기때문에 오버로딩이 가능하다.(같은 이름으로 타입이나, 파라메터 개수를 바꿔 중첩)
		Thread thread = new Thread(eb);
		thread.start();
		System.out.println("여기는 내가 쓴 코드가 있습니다.");
		for (int i = 0; i < 5; i++) {
			System.out.println("메인 띠로롱");
			try {
				Thread.sleep(2000); // 메인 쓰레드의 휴지(main메소드에 잠깐의 텀)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
