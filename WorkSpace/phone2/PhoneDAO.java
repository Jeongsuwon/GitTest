package phone2;

import java.util.Scanner;

public class PhoneDAO {
	PhoneDTO dto = new PhoneDTO("검정", "이니셜-1", "종료");
	Scanner sc = new Scanner(System.in);
	
	public void powerOff() {
		if(dto.getState().equals("전원켜짐")) {
			dto.setState("전원꺼짐");
			System.out.println(dto.getModel()+"의 전원이 꺼졌습니다.(상태:"+dto.getState()+")");
		}else if(dto.getState().equals("종료")||dto.getState().equals("전원꺼짐")) {
			System.out.println("이미 종료되어있는 상태입니다.");
		}else {
			System.out.println("통화를 먼저 종료해주세요.");
		}
	}
	public void powerOn() {
		if(dto.getState().equals("전원꺼짐")||dto.getState().equals("종료")) {
		dto.setState("전원켜짐");
		System.out.println("전원이 켜집니다.(상태:"+dto.getState()+")");
		}else if(dto.getState().equals("전원켜짐")) {
			System.out.println("현재 전원이 켜져있습니다.");
		}else {
			System.out.println("이미 전원이 켜져있고 현재는 통화중입니다.");
		}
	}
	
	public void call() {
		if(dto.getState().equals("전원꺼짐")||dto.getState().equals("종료")) {
			System.out.println("전원이 꺼져있어 전화받기가 불가능합니다.");
		}else if(dto.getState().equals("전원켜짐")) {
			dto.setState("전화중");
			System.out.println("전화가 와서 전화를 받았습니다.");
		    System.out.println("↓나의 음성전송↓");	 
			String sendVc = sc.nextLine();
			System.out.println("나:"+sendVc);
			System.out.println("↓상대방의 음성수신↓");
			String reVc = sc.nextLine();
			System.out.println("상대방:"+reVc);
		}else if(dto.getState().equals("전화중")) {
			System.out.println("이미 통화중입니다.");
		}
	}
	
	public void callend() {
		if(dto.getState().equals("전화중")) {
			dto.setState("전원켜짐");
			System.out.println("전화를 끊습니다.");
		}else if(!dto.getState().equals("전화중")&&dto.getState().equals("전원켜짐")) {
			System.out.println("전화중이 아닙니다.");
		}else if(dto.getState().equals("전원꺼짐")||dto.getState().equals("종료")) {
			System.out.println("전원이 꺼져있어 전화 끊기가 불가능합니다.");
		}
	}
	
	public void mobile() {
		System.out.println("1세대폰 (색상:"+dto.getColor()+", 모델:"+dto.getModel()+", 상태:"+dto.getState()+")가 지급되었습니다.");
	}
	
	public int intInput() {
		while(true) {
			try {
				int intInput = Integer.parseInt(sc.nextLine());
				return intInput;
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
			
		}
	}
}
