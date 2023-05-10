package phone2;

public class DmbDAO extends PhoneDAO{
	DmbDTO dmbdto = new DmbDTO("검정", "이니셜-2", "종료", "정보없음"); 
	public void mobile() {
		System.out.println("2세대폰 (색상:"+dmbdto.getColor()+", 모델:"+dmbdto.getModel()+", 상태:"+dmbdto.getState()+", 채널:"+dmbdto.getChannel()+")가 지급되었습니다.");
	}
	
	
	public void dmb() {
		if(dmbdto.getState().equals("종료")||dmbdto.getState().equals("전원꺼짐")) {
			System.out.println("전원이 꺼져있어 DMB방송을 켤 수가 없습니다.");
		}else if(dmbdto.getState().equals("전원켜짐")&&!dmbdto.getState().equals("전화중")){
			dmbdto.setState("DMB시청중");
			System.out.println("DMB방송을 켭니다.(현재채널:"+dmbdto.getChannel()+")");
			while(true) {
			System.out.println("1.채널변경 / 2.DMB종료");
			int dmbCho = intInput();
			if(dmbCho==1) {
				System.out.println("변경할 채널을 입력하세요");
				int channel = Integer.parseInt(sc.nextLine());
				if(dmbdto.getChannel().equals(channel+"")) {
					System.out.println("이미 시청중인 채널입니다.");
				}else {
				System.out.println("DMB방송의 채널을 변경합니다 :" + dmbdto.getChannel() +" -> "+ channel +"번으로 변경 됨");
				dmbdto.setChannel(channel+"");
				}
					
				
			}else if(dmbCho==2) {
				dmbdto.setState("전원켜짐");
				System.out.println("DMB방송을 종료합니다.");
				break;
			}
			}
		}else {
			System.out.println("전화중에는 DMB방송을 켤 수가 없습니다.");
		}
		
	}
	
	
}
