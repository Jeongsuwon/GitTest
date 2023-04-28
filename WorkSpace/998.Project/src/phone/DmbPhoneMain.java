package phone;

import java.util.Scanner;

public class DmbPhoneMain {
	public static void main(String[] args) {
		boolean power = false;
		Scanner sc = new Scanner(System.in);
		DmbPhoneDAO dao = new DmbPhoneDAO();
		dao.mobile();
			System.out.println("현재 휴대폰 전원이 꺼져있습니다.");
			while(true) {
			System.out.println("1. 전원켜기 / 2. 전원끄기(숫자 입력)");
			int powInfo = dao.inputInt();
			if(power==false) {
				if(powInfo==1) {
					dao.powerOn();
					power=true;
					while(true) {
					System.out.println("=============================");
					System.out.println("♬상대방에게 전화가 왔습니다♬");
					dao.call();
					System.out.println("휴대폰 전원을 끄시겠습니까?");
					System.out.println("1. 예 / 2. 아니오");
					int powOff=dao.inputInt();
					if(powOff==1) {
						power=false;
						dao.powerOff();
					break;
				}else if(powOff==2) {
					System.out.println("전화를 더 하시겠습니까?");
					System.out.println("1. 예 / 2. 아니오");//아니오 했을 때 오류
					if(powOff==1) {
						dao.call();
						continue;
					}
				}
				}
				
			}else if(powInfo==2) {
				System.out.println("오류! 이미 꺼져있는 상태입니다.");			
			}else {
				System.out.println("잘못된 선택입니다.");
			}		
			}
	}
		
		
		
	}
}
