package pack01_thread;

//extends : 클래스 타입의 상속(단일 상속) -> 클래스의 모든 멤버(private제외)를 상속받을 때 사용
//implements: 인터페이스 상속(다중 상속) -> 방법만(메소드를 상속받기위해 주로 사용)
public class Ex04_BeepThread extends Thread{
@Override
public void run() {
	for (int i = 0; i < 5; i++) {
		System.out.println("쓰레드 상속");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
