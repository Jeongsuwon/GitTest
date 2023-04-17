package pack02_trycatch;

public class Ex04_TryNewCatch {
	public static void main(String[] args) {
		int sum = 0;
		//throw : 강제로 예외를 발생시켜 catch 블럭을 실행시킨다.
		for(int i=1; i<=100; i++) {
			sum +=i;
			if(sum>=777) {
				break;
			}
			
			}
		System.out.println(sum);
		
		}
}

