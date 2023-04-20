package Test_01;

import java.util.*;

public class Toy {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int deposit;
		int choice;
		int withdraw= 0;
		int balance= 3000;
		System.out.println("은행 업무 시작은 1번 / 종료는 0번");
		System.out.print("선택> ");
		int onoff = Integer.parseInt(sc.nextLine());
		int con;
		if(onoff==0) {
			System.out.println("안녕히가세요.");
		}else {
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("1. 예금 ㅣ 2. 출금 ㅣ 3. 잔고 ㅣ 4. 종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			choice = Integer.parseInt(sc.nextLine());
			if(choice==1) {
				System.out.println("얼마를 예금하시겠습니까?");
				System.out.print("금액 :  ");
				deposit = Integer.parseInt(sc.nextLine());
				balance = (deposit + balance);
				System.out.println("현재 예금액은 : " + deposit + "원입니다.");
				System.out.println("다른 업무를 더 보시려면 1번 그만하시려면 2번");
				con = Integer.parseInt(sc.nextLine()); // 현재 업무를 보고 종료하지 않고 다른 업무를 볼 수도 있음

			}else if(choice == 2) {
				System.out.println("현재 계좌금액: " + balance);
				System.out.println("얼마를 출금하시겠습니까?");
				if((balance-withdraw)<withdraw) {
					System.out.println("잔고가 부족합니다."); // 잔고가 부족해도 -로 값이 나옴 
				}else {
				withdraw = Integer.parseInt(sc.nextLine());
				System.out.println(withdraw +"원이 출금되어 계좌금액은 : " + (balance-withdraw) + "입니다.");
				}
			}else if(choice == 3) {
				System.out.println("현재 고객님의 잔고는 " + balance + "원입니다.");
			}else if(choice == 4) {
				System.out.println("종료합니다.");
			}
			
break;
		}
		
		}
	}
	 
}


