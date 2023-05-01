package phone1;

import java.util.Scanner;

public class PhoneDAO {
	PhoneDTO dto = new PhoneDTO("검정", "CT폰", "종료");
	boolean power;
	Scanner sc = new Scanner(System.in);
	
	public void mobile() {
		System.out.println("1세대 폰 (색상: " + dto.getColor() + ", 모델명: " + dto.getModel() + ", 상태: " + dto.state +")" );
	}
	int callSign;
	public void function() {
		while(true) {
			if(dto.state.equals("전원켜짐")) {
		System.out.println("1.전화받기 / 2.수신거부");
		callSign = inputInt();
		if(callSign==1) {
			dto.state="전화중";
			System.out.println("전화가 연결되었습니다.(현재상태:" + dto.state +")");
			while(true) {
			System.out.println("↓나의 음성 전송↓");
			String sendStr = sc.nextLine();
			System.out.println("나: " + sendStr);
			System.out.println("↓상대방의 음성 수신↓");
			String recieveStr = sc.nextLine();
			System.out.println("상대방: " + recieveStr);
			System.out.println("1.통화종료 / 2.계속통화 "); // 오류 : try catch문 에러 입력시 반복문 벗어남
			int calling = inputInt();
			if(calling==1) {
				System.out.println("통화를 종료합니다.");
				System.out.println("다른 통화를 더 하시겠습니까?");
				dto.state = "전원켜짐";
				break;
			}else if(calling==2) {
				System.out.println("통화를 이어서 진행합니다.");
				continue;
			}else {
				continue;
			}
			}
		}else if(callSign==2){
			System.out.println("수신을 거절하였습니다.");
			break;
		}else {
			continue;
		}
		}else if(dto.state.equals("전원꺼짐")) {
				System.out.println("1.전화받기 / 2.수신거부");
				if(callSign == 1 || callSign==2) {
				System.out.println("전원이 꺼져있어 기능을 연결할 수 없습니다.(현재상태: " + dto.state + ")");
				System.out.println("전원을 켜주세요.");	
				}
				
		}
	break;
		}
		
	}
	
	public void powerOn() {
		dto.state = "전원켜짐";
		
	}
	
	String callEnd;
	public int inputInt() {
		while(true) {
			try {
				int inputInt = Integer.parseInt(sc.nextLine());
				while(true) {
				if(inputInt<0||inputInt>2) {
					System.out.println("잘못된 선택입니다.");
					
				}
				return inputInt;
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요");
			}
		}
	}
	
	public void gen1() {
		System.out.println("♬상대방에게 전화가 걸려왔습니다♬");
		function();
		while(true) {
		System.out.println("1.통화 / 2.그만한다(종료시점으로 이동)");
		int callBye = inputInt();
		if(callBye==1) {
			System.out.println("♬다른 상대방에게 전화가 걸려왔습니다♬");
			function();
		}else if(callBye==2) {
			System.out.println("휴대폰을 종료하시겠습니까?");
			System.out.println("종료를 원하시면 <종료>입력해주세요.");
			callEnd = sc.next();
			if(callEnd.equals("종료")) {
				dto.state="전원꺼짐";
				System.out.println("휴대폰을 종료합니다.(현재상태:" + dto.state + ")" );
				break;
				
			}
		}else {
			continue;
		}
		}
	}
	
}
