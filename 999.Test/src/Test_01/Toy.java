package Test_01;

import java.util.*;

public class Toy {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int deposit;
		int choice;
		int withdraw= 0;
		int balance= 3000;
		System.out.println("���� ���� ������ 1�� / ����� 0��");
		System.out.print("����> ");
		int onoff = Integer.parseInt(sc.nextLine());
		int con;
		if(onoff==0) {
			System.out.println("�ȳ���������.");
		}else {
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("1. ���� �� 2. ��� �� 3. �ܰ� �� 4. ����");
			System.out.println("------------------------------------------");
			System.out.print("����> ");
			choice = Integer.parseInt(sc.nextLine());
			if(choice==1) {
				System.out.println("�󸶸� �����Ͻðڽ��ϱ�?");
				System.out.print("�ݾ� :  ");
				deposit = Integer.parseInt(sc.nextLine());
				balance = (deposit + balance);
				System.out.println("���� ���ݾ��� : " + deposit + "���Դϴ�.");
				System.out.println("�ٸ� ������ �� ���÷��� 1�� �׸��Ͻ÷��� 2��");
				con = Integer.parseInt(sc.nextLine()); // ���� ������ ���� �������� �ʰ� �ٸ� ������ �� ���� ����

			}else if(choice == 2) {
				System.out.println("���� ���±ݾ�: " + balance);
				System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");
				if((balance-withdraw)<withdraw) {
					System.out.println("�ܰ� �����մϴ�."); // �ܰ� �����ص� -�� ���� ���� 
				}else {
				withdraw = Integer.parseInt(sc.nextLine());
				System.out.println(withdraw +"���� ��ݵǾ� ���±ݾ��� : " + (balance-withdraw) + "�Դϴ�.");
				}
			}else if(choice == 3) {
				System.out.println("���� ������ �ܰ�� " + balance + "���Դϴ�.");
			}else if(choice == 4) {
				System.out.println("�����մϴ�.");
			}
			
break;
		}
		
		}
	}
	 
}


