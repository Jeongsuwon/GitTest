package pack01_thread;

import java.awt.Toolkit;

public class Ex03_BeepThread {

	public static void main(String[] args) {
		//기존에는 Runnable을 상속받은 BeepTask라는 Class를 만들고 해당하는 Class를 이용해서
		//Thread를 생성하여 사용하였음.
		//이번에는 interface타입을 파라메터로 넘겨서 사용하는 방법을 사용해보기.
		Runnable run = new Runnable() {
			
			
			@Override
			public void run() {
				//Runnable이라는 interface인데 interface내부에 있는 메소드는 객체가 생성될 때 반드시
				//구현이 되어야한다. 따라서 메소드가 있어야 할 익명의 지역을 만들고 run메소드가 반드시
				//구현된 형태로 객체 생성이된다
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep(); //절대 외우거나 공부x, 책 예제때문에 사용
					System.out.println("띠로롱");
					//메인 쓰레드가 계속해서 작업을 하는게 아니라, 몇 초정도의 휴지시간(멈춤)을 가지고 동작하게 처리
					try {
						Thread.sleep(1*2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread thread = new Thread(run);
		thread.start();
		
	}

}
