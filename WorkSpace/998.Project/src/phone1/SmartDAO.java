package phone1;

public class SmartDAO extends DmbDAO {
SmartDTO sdao = new SmartDTO("검정", "아이폰", "종료", "정보없음","인터넷꺼짐");
	
	public void mobile() {
		System.out.println("3세대 폰 (색상: " + dto.getColor() + ", 모델명: " + sdao.getModel() + ", 상태: " + dto.state +", 채널: "+dmb.channel +")" );
	}
	
	public void internet() {
		sdao.setInternet("인터넷꺼짐");
		while(true) {
		if(dto.state.equals("전화중")&&sdao.internet.equals("인터넷꺼짐")) {
						System.out.println("인터넷을 켜주세요.");
		}
		
		
		}
		
	}
	public void gen3() {
		dto.setState("전원켜짐");
		System.out.println("♬상대방에게 전화가 걸려왔습니다♬");
		System.out.println(dto.state);
		function3();
		while(true) {
		System.out.println("1.통화 / 2.그만한다(종료시점으로 이동)");
		int callBye = inputInt();
		if(callBye==1) {
			System.out.println("♬다른 상대방에게 전화가 걸려왔습니다♬");
			function();
		}else if(callBye==2) {
			break;
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		break;
		}
	}
	
	
	int callSign;
	public void function3() {
		while(true) {
			if(dto.state.equals("전원켜짐")) {
		System.out.println("1.전화받기 / 2.수신거부");
		callSign = inputInt();
		if(callSign==1) {
			dto.setState("전화중");
			System.out.println("전화가 연결되었습니다.(현재상태:" + dto.state +")");
			while(true) {
			System.out.println("↓나의 음성 전송↓");
			String sendStr = sc.nextLine();
			System.out.println("나: " + sendStr);
			if(sdao.internet.equals("인터넷사용중")) {
				System.out.println();
			}else {
			System.out.println("웹툰 앱 켜기 (on)");
			while(true) {
			String webtoon = sc.nextLine();
			if(sdao.internet.equals("인터넷꺼짐")&&webtoon.equals("on")) {
				System.out.println("인터넷을 먼저 켜주세요.");
				System.out.println("인터넷 켜기(on)");
				String it = sc.nextLine();
				if(it.equals("on")) {
					sdao.internet="인터넷사용중";					
					System.out.println("인터넷이 켜졌습니다.("+sdao.internet+")");
				}
				if(sdao.internet.equals("인터넷사용중")) {
					System.out.println("웹툰 앱을 켭니다.");
					break;
				}
			}else {
				System.out.println("on을 입력해주세요.");
			}
			}
			}
			
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
		}
	break;
		}
	}
}
