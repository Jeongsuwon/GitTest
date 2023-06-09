package pack01_thread;

public class Ex05_Main {
public static void main(String[] args) {
//	Ex05_ThreadA threadA = new Ex05_ThreadA();
//	System.out.println("작업 이름: "+threadA.getName());
//	threadA.start();
//	
//	Ex05_ThreadB threadB = new Ex05_ThreadB();
//	System.out.println("작업 이름: "+threadB.getName());
//	threadB.start();
	
	Thread[] threadArr = new Thread[3];
	threadArr[0] = new Ex05_ThreadA();
	threadArr[1] = new Ex05_ThreadB();
	threadArr[2] = new Ex05_ThreadC();
	
	//우선순위 : priority -> 큰 의미는 없음(우선순위 안바뀜)
	threadArr[0].setPriority(Thread.MAX_PRIORITY);
	threadArr[1].setPriority(Thread.NORM_PRIORITY);
	threadArr[2].setPriority(Thread.MIN_PRIORITY);
	
	//작업이 여러 개가 있을 때 하나의 구조로 묶어두고 반복문을 이용하면 제어가 편함
	for (int i = 0; i < threadArr.length; i++) {
		System.out.println("작업이름: "+threadArr[i].getName());
		threadArr[i].start();
	}
	System.out.println("여기 실행?");
}
}
