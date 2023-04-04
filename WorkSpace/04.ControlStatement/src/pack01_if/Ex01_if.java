package pack01_if;

public class Ex01_if {

	public static void main(String[] args) {
		//if문 : 제어문 중에 조건문
		//어떤 조건을 주고 해당 조건이 True일 때의 지역을 만들고 그 지역 코드 실행
		//이항 연산자 부분은 값만 결과로 사용가능
		
		int score = 81;
		if(score%2==0) {
			//조건식이 TRUE일 때만 실행가능
			System.out.println("score는 짝수입니다.");			
		}
		if(score%2==1) {
			System.out.println("score는 홀수입니다.");
		}
		
	}
	//score의 숫자가 홀수인지 짝수인지를 판단해서 if문 코딩
}
