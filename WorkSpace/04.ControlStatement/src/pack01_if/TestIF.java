package pack01_if;

public class TestIF {

	public static void main(String[] args) {
		
		/*int형 변수 code를 만든다. code의 값이 1이면 '남자'
	      2이면 '여자', 3이면 '남자', 4이면 '여자' 출력 그 외에 값은 '오류' 출력
	      
	      int random = (int)(Math.random()*6)+1; <- 해당 코드가 실행되고 나면
	      											1~6까지의 수가 랜덤하게 할당
	      
	      조건문을 이용해서 random의 숫자가 몇인지를 출력하기.
	      ex)random(1): 1이 출력이 되었습니다. */
		
		int code = (int)(Math.random()*6)+1;
		
		System.out.println(code);
		if(code==1 || code==3 ) {
			System.out.println("남자");
		}else if (code==2 || code==4) {
			System.out.println("여자");
		}else{
			System.out.println("오류");
		}
		
		System.out.println("-----------------------------------------------------");
		
		if(code == 1) {
			System.out.println("random(1) : "+ code + "이 출력되었습니다.");
		}else if(code == 2) {
			System.out.println("random(2) : "+ code + "가 출력되었습니다.");
		}else if(code == 3) {
			System.out.println("random(3) : "+ code + "이 출력되었습니다.");
		}else if(code == 4) {
			System.out.println("random(4) : "+ code + "가 출력되었습니다.");
		}else if(code == 5) {
			System.out.println("random(5) : "+ code + " 출력되었습니다.");
		}else {
			System.out.println("random(6) : "+ code + "이 출력되었습니다.");
		}
		
		System.out.println("-----------------------------------------------------");
		
		int me = (int)(Math.random()*6)+1;
		int com = (int)(Math.random()*6)+1;
		if(me<com) {
			System.out.println("컴퓨터 숫자 : "+ com + " / 유저의 숫자 : "+ me +" -> 컴퓨터가 이겼습니다.");
		}else if(me>com) {
			System.out.println("컴퓨터 숫자 : "+ com + " / 유저의 숫자 : "+ me +" -> 유저가 이겼습니다.");
		}else {
			System.out.println("컴퓨터 숫자 : "+ com + " / 유저의 숫자 : "+ me +" -> 컴퓨터와 유저가 비겼습니다.");
		}
	
		
	}

}
