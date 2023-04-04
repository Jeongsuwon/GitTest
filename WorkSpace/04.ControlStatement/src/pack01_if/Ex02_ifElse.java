package pack01_if;

public class Ex02_ifElse {

	public static void main(String[] args) {
		//if문 : 단순 if 조건식을 주고 해당하는 조건식이 TRUE인 경우의 블러킹을 만들어 실행
		//if-else문: 단순 if문은 조건식이 TRUE일 때만 실행이되는 번거러움이 있음.
		
		int score = 85;
		if(score%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		//int형 변수 num1과 num2를 나열을 통해서 초기화
		//if-else문을 통해서 두 수를 비교하고 어떤 수가 큰지 콘솔창에 출력하게 코딩
		
		int num1 = 80, num2 = 80;
		if(num1>num2) {
			System.out.println("큰 수는 : " + num1);
		}
		else if(num1<num2) {
			System.out.println("큰 수는 :" + num2);
		}
		else {
			System.out.println("두 수의 크기는 같습니다.");
		}
			
	}

}
