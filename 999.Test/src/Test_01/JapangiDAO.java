package Test_01;

import java.util.Scanner;

public class JapangiDAO {
		private JapangiDTO[] jpArr;
		public JapangiDAO(JapangiDTO[] jpArr) {
			this.jpArr=jpArr;
		}
	
		public void moneyScanner() {
		System.out.println("�ݾ��� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int money = 0;
		while(true) {
			try{
				money = Integer.parseInt(sc.nextLine());
			}catch(Exception e) {
				System.out.println("���ڿܿ� ���� �ԷµǾ����ϴ�.");
			}
		if(money<0) {
			System.out.println("0�̻��� ���� �Է����ּ���");
		}else {
			while(true) {
				if(money%10==0 || money%50==0 || money%100==0 || money%500==0 || money%1000==0) {
					System.out.println(jpArr[0].getCount());
					break;
				}else {
					System.out.println("10, 50, 100, 500, 1000���� �������� ������ ��� �ݺ��˴ϴ�.");
					break;
				}
			}
		}
		
		}	
	}
	
	public void drink(JapangiDTO[] jpArr) {
//		System.out.println("��ȣ    ����     ����  ����");
//		System.out.println("============================");
		
			
			
		}
	}
	


