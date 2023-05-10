package phone2;

import java.util.Scanner;

public class SuperPhone {

	public static void main(String[] args) {
		PhoneDAO dao = new PhoneDAO();
		DmbDAO dmbdao = new DmbDAO();
		SmartDAO smdao = new SmartDAO();
		Scanner sc = new Scanner(System.in);
		int power;
		System.out.println("몇 세대 폰을 발급받으시겠습니까?");
		while(true) {
		System.out.println("1번 - 1세대 / 2번 - 2세대 / 3번 - 3세대  / 0.기능종료");
		int gen = dao.intInput();
		if(gen==1) {
			dao.mobile();
			while(true) {
			System.out.println("1.전원켜기 / 2.전원끄기 / 3.전화받기 / 4.전화끊기 / 0.기능종료");
			power = dao.intInput();
			if(power==1) {
				dao.powerOn();
			}else if(power==2) {
				dao.powerOff();
			}else if(power==3) {
				dao.call();
			}else if(power==4) {
				dao.callend();
			}else if(power==0) {
				System.out.println("폰의 기능을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 선택입니다.");
			}
			
			}
		}else if(gen==0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}else if(gen==2) {
			dmbdao.mobile();
			while(true) {
				System.out.println("1.전원켜기 / 2.전원끄기 / 3.전화받기 / 4.전화끊기 / 5.DMB방송 / 0.기능종료");
				power = dao.intInput();
				if(power==1) {
					if(dmbdao.dmbdto.getState().equals("전원꺼짐")||dmbdao.dmbdto.getState().equals("종료")) {
						dmbdao.dmbdto.setState("전원켜짐");
						dao.dto.setState("전원켜짐");
						System.out.println("전원이 켜집니다.(상태:"+dmbdao.dmbdto.getState()+")");
						}else if(dmbdao.dmbdto.getState().equals("전원켜짐")) {
							System.out.println("현재 전원이 켜져있습니다.");
						}else {
							System.out.println("이미 전원이 켜져있고 현재는 통화중입니다.");
						}
				}else if(power==2) {
					if(dmbdao.dmbdto.getState().equals("전원켜짐")) {
						dmbdao.dmbdto.setState("전원꺼짐");
						dao.dto.setState("전원꺼짐");
						System.out.println(dmbdao.dmbdto.getModel()+"의 전원이 꺼졌습니다.(상태:"+dmbdao.dmbdto.getState()+")");
					}else if(dmbdao.dmbdto.getState().equals("종료")||dmbdao.dmbdto.getState().equals("전원꺼짐")) {
						System.out.println("이미 종료되어있는 상태입니다.");
					}else {
						System.out.println("통화를 먼저 종료해주세요.");
					}
				}else if(power==3) {
					dao.call();
				}else if(power==4) {
					dao.callend();
				}else if(power==0) {
					System.out.println("폰의 기능을 종료합니다.");
					break;
				}else if(power==5) {
					dmbdao.dmb();
				}else {
					System.out.println("잘못된 선택입니다.");
				}
			}
		}else if(gen==3) {
			smdao.mobile();
			while(true) {
				System.out.println("1.전원켜기 / 2.전원끄기 / 3.전화받기 / 4.전화끊기 / 5.DMB방송 / 6.인터넷 / 7.웹툰 / 0.기능종료");
				power = dao.intInput();
				if(power==1) {
					if(smdao.smdto.getState().equals("전원꺼짐")||smdao.smdto.getState().equals("종료")) {
						smdao.smdto.setState("전원켜짐");
						dmbdao.dmbdto.setState("전원켜짐");
						dao.dto.setState("전원켜짐");
						System.out.println("전원이 켜집니다.(상태:"+smdao.smdto.getState()+")");
						}else if(smdao.smdto.getState().equals("전원켜짐")) {
							System.out.println("현재 전원이 켜져있습니다.");
						}else {
							System.out.println("이미 전원이 켜져있고 현재는 통화중입니다.");
						}
				}else if(power==2) {
					if(smdao.smdto.getState().equals("전원켜짐")) {
						smdao.smdto.setState("전원꺼짐");
						dmbdao.dmbdto.setState("전원꺼짐");
						dao.dto.setState("전원꺼짐");
						System.out.println(smdao.smdto.getModel()+"의 전원이 꺼졌습니다.(상태:"+smdao.smdto.getState()+")");
					}else if(smdao.smdto.getState().equals("종료")||smdao.smdto.getState().equals("전원꺼짐")) {
						System.out.println("이미 종료되어있는 상태입니다.");
					}else {
						System.out.println("통화를 먼저 종료해주세요.");
					}
				}else if(power==3) {
					dao.call();
				}else if(power==4) {
					dao.callend();
				}else if(power==0) {
					System.out.println("폰의 기능을 종료합니다.");
					break;
				}else if(power==5) {
					dmbdao.dmb();
				}else if(power==6) {
					if(smdao.smdto.getState().equals("종료")||smdao.smdto.getState().equals("전원꺼짐")) {
						System.out.println("전원이 꺼져있어 인터넷 사용이 불가능합니다.");
					}else if(smdao.smdto.getState().equals("전원켜짐")) {
						System.out.println("인터넷을 켭니다.");
						smdao.smdto.setInternet("인터넷사용중");
					}
				}else if(power==7) {
					smdao.webtoon();
				}else {
					System.out.println("잘못된 선택입니다.");
				}
			}
		}
		
	}
	}
}
