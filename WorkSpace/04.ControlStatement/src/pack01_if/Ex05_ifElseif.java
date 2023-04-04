package pack01_if;

public class Ex05_ifElseif {

	public static void main(String[] args) {
		/*if else 문으로는 어떤 조건을 줄 때 true인지와 false인지 두 가지 경우만 만들 수 있음
		if(조건식 A){
			조건식 A가 TRUE일 때 실행할 코드를 넣어줌.
			}else if{
		
				} else{
	  	조건식A가 true가 아닐 때 실행할 코드를 넣어줌
	}
		*/
		
		int score = 60; //기존 방식으로 score가 90점 이상이면 A, 80점이상이면 B,
						//70점 이상이면 C 그 외에는 D
		
		if(score>=90) {
			System.out.println("A");
		}else{
			if(score>=80) {
				System.out.println("B");
			}else {
				if(score>=70) {
					System.out.println("C");
				}else {
					System.out.println("D");
				}
			}
		}
		System.out.println("----------------------");
		
		if(score>=90) {
			System.out.println("A");
		}if(score>= 80 && score < 90 ){
			System.out.println("B");
		}if(score>= 70 && score < 80) {
			System.out.println("C");
		}if(score>= 60 && score < 70) {
			System.out.println("D");
		}
		System.out.println("---------------------");
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
			
		}else if(score>=70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
			
		
		
				
			
			
		
	
	
	
	}

}
