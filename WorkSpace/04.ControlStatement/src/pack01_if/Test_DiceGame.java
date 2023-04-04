package pack01_if;

import java.util.*;
public class Test_DiceGame {

	public static void main(String[] args) {
		//ex) 사용자가 어떤 동작을 했을 때 게임이 진행되는것==조작
		System.out.println("주사위 게임을  시작합니다.");
		System.out.println("-1을 입력하면 종료합니다. 그 외에는 시작");
		
		Scanner sc = new Scanner(System.in);		
		
		if(Integer.parseInt(sc.nextLine())==-1) {
			System.out.println("게임 종료");
		}else {
			System.out.println("게임 시작");
			System.out.println("사용자가 주사위를 굴릴 차례입니다.(굴리기 ENTER)");
			sc.nextLine();
			int userNum=(int)(Math.random()*6)+1;
			System.out.println("사용자의 수 : " +userNum);
			System.out.println("컴퓨터가 주사위를 굴립니다(진행 ENTER)");
			sc.nextLine();
			int comNum = (int)(Math.random()*6)+1;
			System.out.println("컴퓨터의 수 : "+comNum);
			System.out.println("----------------------------");
			if(userNum>comNum) {
				System.out.println("사용자가 이겼습니다.");
			}else if(userNum<comNum) {
				System.out.println("컴퓨터가 이겼습니다.");
			}else {
				System.out.println("사용자와 컴퓨터가 비겼습니다.");
			}
		}
		
		
		

	}

}
