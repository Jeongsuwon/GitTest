package pack01_thread;

public class Ex06_ThreadTest {
	//YoutubeThread라는 작업을 하나 별도로 만듦.
	//MelonThread라는 작업을 하나 별도로 만듦.
	//ThreadTest에서는 YoutubeThread와 MelonThread를 각각 실행함.
	
	//두개의 기능이 각각 실행되게 처리.
	public static void main(String[] args) {
		Ex06_YoutubeThread yt = new Ex06_YoutubeThread();
		Ex06_MelonThread mt = new Ex06_MelonThread();
		yt.start();
		mt.start();
	}
}
