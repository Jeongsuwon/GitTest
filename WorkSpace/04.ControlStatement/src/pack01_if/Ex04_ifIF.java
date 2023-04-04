package pack01_if;

public class Ex04_ifIF {

	public static void main(String[] args) {
		//블럭킹의 기본 개념 : { <=메모리에 올림} <= 메모리에서 내림
		//자바프로그램은 메모리를 효율적으로 쓰기 위해서 메모리에 올리고 내리는 과정 존재
		//블럭킹(지역)은 계속해서 중첩 가능
		
		int score = 1;
		
		if(score%2==0) {
				System.out.println("짝수");
			if(score==10){
				System.out.println("10");
			if(score<11) {
				System.out.println("11보다 작음");
			}
			}
			
		}

		System.out.println("-------------------------");
		if(score%2==0) {
			System.out.println("짝수");
			if(score==10) {
				System.out.println("10");
				if(score<11){
					System.out.println("11보다 작음");
				}else {
					System.out.println("11이상");
				}
			}else {
				System.out.println("10아님");
			}
		}else {
			System.out.println("홀수");
		}
		
	}

}
