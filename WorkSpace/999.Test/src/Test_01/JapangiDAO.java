package Test_01;

import java.util.Scanner;

public class JapangiDAO {
		private JapangiDTO[] jpArr;
		public JapangiDAO(JapangiDTO[] jpArr) {
			this.jpArr=jpArr;
		}
			
		public void moneyScanner() {
			boolean input = true;
		System.out.println("�ݾ��� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int numInput = 0;
		while(input) {
			try{
				money = Integer.parseInt(sc.nextLine());
				System.out.println("���� �ݾ��� " + money +"�� �Դϴ�.");
			}catch(Exception e) {
				System.out.println("���ڿܿ� ���� �ԷµǾ����ϴ�.");
			}
		if(money<0) {
			System.out.println("0�̻��� ���� �Է����ּ���");
		}else {
			while(true){
				if(money%10==0 || money%50==0 || money%100==0 || money%500==0 || money%1000==0) {
					System.out.println("�ֹ��Ͻ� ���� ��ȣ�� �������ּ���");
					System.out.println(jpArr[0].getNum()+ ". " +jpArr[0].getDrink()+ "  " + jpArr[0].getPrice()+"��  "+jpArr[0].getCount()+"��");
					System.out.println(jpArr[1].getNum()+ ". " +jpArr[1].getDrink()+ "  " + jpArr[1].getPrice()+"��  "+jpArr[1].getCount()+"��");
					System.out.println(jpArr[2].getNum()+ ". " +jpArr[2].getDrink()+ "  " + jpArr[2].getPrice()+"��  "+jpArr[2].getCount()+"��");
					numInput = Integer.parseInt(sc.nextLine());
					if(numInput==1 && money>=jpArr[0].getPrice()) {
					 money -= jpArr[0].getPrice();
					 jpArr[0].getPrice();
					 System.out.println("�ܾ��� " + money + "�Դϴ�.");
					}else if(numInput==2 && money>=jpArr[1].getPrice()) {
						money -= jpArr[1].getPrice();
					 }else if(numInput==3 && money>=jpArr[2].getPrice()) {
						 money -= jpArr[2].getPrice();
					 }else {
						 System.out.println("�ݾ��� �����մϴ�.");
						 input = false;
					 }break;
				}else {
					System.out.println("�ݾ��� 10, 50, 100, 500, 1000���� �������� ������ ��� �ݺ��˴ϴ�.");
				}
				break;
				}
			}
			
		}
		
		}	
	

	public void drink(JapangiDTO[] jpArr) {
//		System.out.println("��ȣ    ����     ����  ����");
//		System.out.println("============================");
		
			
			
		}
	}
	


