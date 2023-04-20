package Test_01;

import java.util.Scanner;

public class JapangiDAO1 {
	boolean input = true;
	int money = 0;
	Scanner sc = new Scanner(System.in);
	
	private JapangiDTO[] jpArr;
	public JapangiDAO1(JapangiDTO[] jpArr) {
		this.jpArr=jpArr;
	}
	
	public void money() {
		
		while(true) {
			if(input) {
				System.out.println("금액을 입력하세요");
				money = Integer.parseInt(sc.nextLine());
				input=false;
			}
			if(money<0) {
				
			}
			
		}
	}
	
	
}
