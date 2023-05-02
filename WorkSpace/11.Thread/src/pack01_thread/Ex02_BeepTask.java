package pack01_thread;

import java.awt.Toolkit;

//Runnable이라는 작업 인터페이스 : implements <- 내부에 있는 메소드를 무조건 구현
public class Ex02_BeepTask implements Runnable{

	@Override
	public void run() {
		//자바의 시작점인 이유는 메인쓰레드이기때문( 1개의 작업)
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
	
}
