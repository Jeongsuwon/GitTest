package phone1;

public class SmartDAO extends DmbDAO {
	SmartDTO sdao = new SmartDTO("검정", "아이폰", "전원꺼짐", "정보없음");
	
	public void mobile() {
		System.out.println("2세대 폰 (색상: " + dto.getColor() + ", 모델명: " + sdao.getModel() + ", 상태: " + dto.state +", 채널: "+dmb.channel +")" );
	}
	
	public void internet() {
		dto.state="인터넷켜짐";
		sdao.internet="인터넷켜짐";
		System.out.println("인터넷이 켜집니다."+sdao.internet);
		
		
	}
}
