package Test_01;

import java.util.Scanner;

public class JapangiDAO {
		private JapangiDTO[] jpArr;
		public JapangiDAO(JapangiDTO[] jpArr) {
			this.jpArr=jpArr;
		}
	
		public void moneyScanner() {
		System.out.println("금액을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int money = 0;
		while(true) {
			try{
				money = Integer.parseInt(sc.nextLine());
			}catch(Exception e) {
				System.out.println("숫자외에 값이 입력되었습니다.");
			}
		if(money<0) {
			System.out.println("0이상의 값을 입력해주세요");
		}else {
			while(true) {
				if(money%10==0 || money%50==0 || money%100==0 || money%500==0 || money%1000==0) {
					System.out.println(jpArr[0].getCount());
					break;
				}else {
					System.out.println("10, 50, 100, 500, 1000으로 나누어질 때까지 계속 반복됩니다.");
					break;
				}
			}
		}
		
		}	
	}
	
	public void drink(JapangiDTO[] jpArr) {
//		System.out.println("번호    음료     가격  수량");
//		System.out.println("============================");
		
			
			
		}
	}
	


