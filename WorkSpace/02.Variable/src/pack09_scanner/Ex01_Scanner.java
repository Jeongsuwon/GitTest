package pack09_scanner;

import java.util.*;

public class Ex01_Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("대기");
		String inputData = sc.nextLine();
		System.out.println("여기까지");
		//외부에서 입력한 숫자는 String형태로 inputData라는 변수에 들어온다.
		//데이터에 +10을 한 결과를 출력해보세요.
		System.out.println(Integer.parseInt(inputData)+10);
		
		
		}

}
