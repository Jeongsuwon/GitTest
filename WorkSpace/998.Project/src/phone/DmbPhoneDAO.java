package phone;

import java.util.Scanner;

public class DmbPhoneDAO extends PhoneDAO {
	Scanner sc = new Scanner(System.in);
	DmbPhoneDTO dto = new DmbPhoneDTO("검정", "아이폰11", "종료", "정보없음");
	public void mobile() {
	System.out.println("2세대 폰(색상:" + dto.color + ", 모델명: " + dto.model + ", 상태: " + dto.state + ", 채널: " + dto.channel + ")가 지급되었습니다.");
	}
	
	
	public void powerOn() {
		dto.state = "전원 켜짐";
		if(dto.state.equals("전원 켜짐")) {
			System.out.println("현재 상태: " + dto.state);
		}
	}
	
	public void powerOff() {
		dto.state = "전원 꺼짐";
		System.out.println("휴대폰이 꺼집니다.(상태: " + dto.state+ ")");
		if(dto.state.equals("전원 꺼짐")) {
			System.out.println("전원이 꺼져있어 전화 받기와 끊기가 불가능합니다.");
		}
	}
	
	public int inputInt() {
		while(true) {
			try {
				int inputInt = Integer.parseInt(sc.nextLine());
				return inputInt;
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요");
			}
		}
	}
	
	public void call() {
		while(true) {
			if(dto.state.equals("전원 켜짐")&&!dto.state.equals("전화중")) {
		    dto.state="전화가능";
		    System.out.println("상태: 통화가능");
			System.out.println("1, 전화받기 / 2, 전화거절");
			int calling = inputInt();
			if(calling==1) {
				dto.state="전화중";
				System.out.println("전화를 받았습니다. (상태: " + dto.state +")" );
				if(dto.state.equals("전화중")) {
					while(true) {
					System.out.println("↓나의 음성전송↓");
					String inputStr = sc.nextLine();
					System.out.println("나: " + inputStr);
					System.out.println("↓상대방 음성수신↓");
					String outStr = sc.nextLine();
					System.out.println("상대방: " + outStr);
					System.out.println("전화를 끊으시겠습니까?");
					System.out.println("1, 끊기 / 2, 아니오");
					int bye = inputInt();
					if(bye==1) {
						System.out.println("전화를 끊습니다.");
						dto.state="전화가능";
						break;
					}else if(bye==2) {
						continue;
					}else {
						System.out.println("잘못된 선택입니다.");
					}
					}					
					}
				
			
				}else if(calling==2) {
					System.out.println("수신을 거절하였습니다.");
					
				}else {
					System.out.println("잘못된 선택입니다.");
				}
			break;
				}
	}
	}
//	
//	public void dmb() {
//		if(channel.)
//	}
	
}
