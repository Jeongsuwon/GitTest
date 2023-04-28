package phone;

import java.util.Scanner;

public class PhoneDAO {
	
	Scanner sc = new Scanner(System.in);
	PhoneDTO dto = new PhoneDTO("검정", "CT폰", "종료");
	public void mobile() {
	System.out.println("1세대 폰(색상:" + dto.color + ", 모델명: " + dto.model + ", 상태: " + dto.state + ")가 지급되었습니다.");
	}
	
	
	public void powerOn() {
		dto.state = "전원 켜짐";
		if(dto.state.equals("전원 켜짐")) {
			System.out.println("전원이 켜졌습니다!(현재 상태: " + dto.state + ")");
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
	
	public void state() {
		
		}
	
	public void call() {
		if(dto.state.equals("전원 켜짐")&&!dto.state.equals("전화중")) {
			dto.state="전화 가능";
			System.out.println(dto.state);
		System.out.println("======================");
		System.out.println("♬상대방에게 전화가 왔습니다♬");
		System.out.println("현재 상태: "+dto.state);
		System.out.println("1. 전화받기 / 2. 수신 거절");
		int callOk = inputInt();
		while(true) {
		if(callOk==1) {
			dto.state = "전화중";
			if(dto.state.equals("전화중")) {
				System.out.println("통화를 시작합니다.(현재 상태 :" + dto.state + ")");
				System.out.println("↓나의 음성 전송↓");
				String send = sc.nextLine();
				System.out.println("나: " + send);
				System.out.println("↓상대방의 음성 수신↓");
				String recieve = sc.nextLine();
				System.out.println("상대방: " + recieve);
				System.out.println("전화를 종료하시겠습니까?");
//				while(true) {
				System.out.println("1. 전화 끊기 / 2. 계속 통화");
				int callAdd = inputInt();
				if(callAdd==1) {
					System.out.println("통화를 종료하였습니다.");
					dto.state="전화 가능";
					break;					
			}else if(callAdd==2) {
				continue;
			}else {
				System.out.println("잘못된 선택입니다.");
			}
//				}
			}
		}else if(callOk==2) {
			System.out.println("수신을 거절하였습니다.");
			break;
		}else {
			System.out.println("잘못된 선택입니다.");
			continue;
		}
		
		
		
		
		
		
		
		}
	}
		}
	
}
