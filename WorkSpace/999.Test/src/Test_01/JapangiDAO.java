package Test_01;

import java.util.Scanner;

public class JapangiDAO {
		private JapangiDTO[] jpArr;
		public JapangiDAO(JapangiDTO[] jpArr) {
			this.jpArr=jpArr;
		}
			
		public void moneyScanner() {
			boolean input = true;
		System.out.println("금액을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int numInput = 0;
		while(input) {
			try{
				money = Integer.parseInt(sc.nextLine());
				System.out.println("현재 금액은 " + money +"원 입니다.");
			}catch(Exception e) {
				System.out.println("숫자외에 값이 입력되었습니다.");
			}
		if(money<0) {
			System.out.println("0이상의 값을 입력해주세요");
		}else {
			while(true){
				if(money%10==0 || money%50==0 || money%100==0 || money%500==0 || money%1000==0) {
					System.out.println("주문하실 음료 번호를 선택해주세요");
					System.out.println(jpArr[0].getNum()+ ". " +jpArr[0].getDrink()+ "  " + jpArr[0].getPrice()+"원  "+jpArr[0].getCount()+"개");
					System.out.println(jpArr[1].getNum()+ ". " +jpArr[1].getDrink()+ "  " + jpArr[1].getPrice()+"원  "+jpArr[1].getCount()+"개");
					System.out.println(jpArr[2].getNum()+ ". " +jpArr[2].getDrink()+ "  " + jpArr[2].getPrice()+"원  "+jpArr[2].getCount()+"개");
					numInput = Integer.parseInt(sc.nextLine());
					if(numInput==1 && money>=jpArr[0].getPrice()) {
					 money -= jpArr[0].getPrice();
					 jpArr[0].getPrice();
					 System.out.println("잔액은 " + money + "입니다.");
					}else if(numInput==2 && money>=jpArr[1].getPrice()) {
						money -= jpArr[1].getPrice();
					 }else if(numInput==3 && money>=jpArr[2].getPrice()) {
						 money -= jpArr[2].getPrice();
					 }else {
						 System.out.println("금액이 부족합니다.");
						 input = false;
					 }break;
				}else {
					System.out.println("금액이 10, 50, 100, 500, 1000으로 나누어질 때까지 계속 반복됩니다.");
				}
				break;
				}
			}
			
		}
		
		}	
	

	public void drink(JapangiDTO[] jpArr) {
//		System.out.println("번호    음료     가격  수량");
//		System.out.println("============================");
		
			
			
		}
	}
	


