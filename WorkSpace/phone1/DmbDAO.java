package phone1;

public class DmbDAO extends PhoneDAO{
	DmbDTO dmb = new DmbDTO("검정", "햅틱", "종료", "정보없음");
	public void function() {
		System.out.println("dmb방송을 켭니다. 현재 채널:" + dmb.channel);
		while(true) {
			dto.state="DMB시청중";
			System.out.println("1. DMB 채널변경 / 2. DMB 종료");
			int dmbChoice = inputInt();
			if(dmbChoice==1&&dto.state.equals("DMB시청중")) {
				System.out.println("변경하실 채널을 입력해주세요.");
				int channelchg = Integer.parseInt(sc.nextLine());
				System.out.println("DMB방송의 채널을 변경합니다." + dmb.channel +" => " +channelchg );
				dmb.channel = channelchg + "";
			}else if(dmbChoice==2) {
				System.out.println("DMB시청을 종료합니다.");
				break;
			}
		}
		}
		
	public void mobile() {
		System.out.println("2세대 폰 (색상: " + dto.getColor() + ", 모델명: " + dmb.getModel() + ", 상태: " + dto.state +", 채널: "+dmb.channel +")" );
	}
	
	public void powerOn() {
		dmb.state = "전원켜짐";
	}
}
