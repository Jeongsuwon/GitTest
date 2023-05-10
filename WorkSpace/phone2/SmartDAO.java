package phone2;

public class SmartDAO extends DmbDAO {
	SmartDTO smdto = new SmartDTO("검정", "이니셜-3", "종료", "정보없음", "인터넷꺼짐");
	public void mobile() {
		System.out.println("3세대폰 (색상:"+smdto.getColor()+", 모델:"+smdto.getModel()+", 상태:"+smdto.getState()+", 채널:"+smdto.getChannel()+")가 지급되었습니다.");
	}
	
	public void webtoon() {
		if(smdto.getInternet().equals("인터넷사용중")) {
			System.out.println("웹툰 앱을 켭니다.");
		}else if(!smdto.getInternet().equals("인터넷사용중")) {
			System.out.println("인터넷이 꺼져있어 웹툰 앱을 켤 수가 없습니다.");
		}
	}
}
