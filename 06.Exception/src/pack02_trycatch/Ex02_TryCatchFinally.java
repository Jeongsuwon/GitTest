package pack02_trycatch;

public class Ex02_TryCatchFinally {

	public static void main(String[] args) {
		try {
			System.out.println("가스불 ON");
			System.out.println("요리 시작");
//			int errorInt = 10/0; //요리하다가 갑자기 무슨 일이 생김.(예외)
//			System.out.println("요리 끝");
//			System.out.println("가스불 OFF");   -> 주석 처리 안하면 finally가 무조건 실행되기에 중복 실행될 수 있음.
//			System.out.println("종료");
		} catch (Exception e) {
			System.out.println("예외 발생");
		}finally {
			//반드시 실행되어야하는 로직(코드)이 있다면 넣어주는 부분
			System.out.println("요리 끝");
			System.out.println("가스불 OFF");
			System.out.println("종료");
		}
	}

}
