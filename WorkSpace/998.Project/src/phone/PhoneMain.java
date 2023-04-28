package phone;

import java.util.Scanner;

public class PhoneMain {
public static void main(String[] args) {
	boolean aa = true;
	boolean power = false;
	Scanner sc = new Scanner(System.in);
	PhoneDAO dao = new PhoneDAO();
	dao.mobile();
		if(power==false) {
			System.out.println("현재 휴대폰 전원이 꺼져있습니다.");
			while(aa) {
			System.out.println("1. 전원 켜기 / 2. 전원 끄기");
			int powerState = dao.inputInt();
			if(powerState==1) {
				dao.powerOn();
				dao.call();
				System.out.println("다른 통화를 더 하시겠습니까?");
				System.out.println("1. 네 (다른 통화 연결) / 2. 아니오(휴대폰 종료)");
				int callAdd = dao.inputInt();
				if(callAdd==1) {
					dao.call();  // 오류 -- 다른 통화 연결로 안 넘어감(확인 필요)
				}else {
					
				System.out.println("휴대폰 전원을 종료하시겠습니까?");
				}
				while(aa) {
				System.out.println("전원을 끄시려면 <종료>를 입력해주세요");
				String off = sc.nextLine();
				if(off.equals("종료")) {
					dao.powerOff();
					break;
					}else {
					System.out.println("잘못된 입력입니다.");
				}
				}				
				aa=false;
			}else if(powerState==2){
				System.out.println("오류! 이미 꺼져있는 휴대폰입니다.");
				
			}else {
				System.out.println("잘못된 선택입니다.");
			}

			
			}
		}
}
}
