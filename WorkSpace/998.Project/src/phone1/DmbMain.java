package phone1;

import java.util.Scanner;

public class DmbMain {

	public static void main(String[] args) {
		boolean power;
		String callEnd;
		Scanner sc = new Scanner(System.in);
		PhoneDAO dao = new PhoneDAO();
		DmbDAO dmb = new DmbDAO();
		System.out.println("핸드폰 세대를 골라주세요.");
		System.out.println("1. 1세대(전화) / 2. 2세대(전화, DMB)");
		int gen = dao.inputInt();
		if(gen==1) {
		dao.mobile();
		while(true) {
			System.out.println("현재 휴대폰의 전원 상태: " +dao.dto.state);
			power=false;
			dao.dto.state="전원꺼짐";
			while(true) {
			if(power==false) {
				if(dao.dto.state.equals("전원꺼짐")) {
				System.out.println("1.전원켜기 / 2.전원끄기 / 0.기능종료");
				int powersc = dao.inputInt();
				if(powersc==1) {
					dao.powerOn();
					System.out.println("전원이 켜졌습니다.(현재상태:" + dao.dto.state + ")");
					dao.gen1();
					dao.function();
				}else if(powersc==2) {
					System.out.println("이미 종료되어있는 휴대폰입니다.");
				}else if(powersc==0) {
					System.out.println("기능을 종료합니다.");
					break;
				}
			}else if(dao.dto.state.equals("전원켜짐")) {
				System.out.println("전원을 종료하시겠습니까?");
				System.out.println("종료를 원하시면 <종료>입력해주세요.");
				callEnd = sc.next();
				if(callEnd.equals("종료")) {
					dao.dto.state="전원꺼짐";
					System.out.println("휴대폰을 종료합니다.");
					break;
				
			}
			}
			}	
			}
			break;
			}
		
		}else if(gen==2) {
			dmb.mobile();
			while(true) {
				System.out.println("현재 휴대폰의 전원 상태: " +dao.dto.state);
				power=false;
				dao.dto.state="전원꺼짐";
				while(true) {
				if(power==false) {
					if(dao.dto.state.equals("전원꺼짐")) {
					System.out.println("1.전원켜기 / 2.전원끄기 / 0.기능종료");
					int powersc = dao.inputInt();
					if(powersc==1) {
						dao.powerOn();
						System.out.println("전원이 켜졌습니다.(현재상태:" + dao.dto.state + ")");
						System.out.println("1.DMB시청 / 2.전화");
						int genCho = dao.inputInt();
						if(genCho==1) {
							dmb.function();
							while(true) {
							System.out.println("yes - 전화도 하겠다. / no - 종료하겠다.");
							String dmbBye = sc.nextLine();
							if(dmbBye.equals("yes")) {
								dao.gen1();
								dao.function();
							}else if(dmbBye.equals("no")) {
								
							}else {
								System.out.println("잘못된 입력입니다.");
							}
							break;
							}
							
						}else if(genCho==2) {
						dao.gen1();
						dao.function();
						}
					}else if(powersc==2) {
						System.out.println("이미 종료되어있는 휴대폰입니다.");
					}else if(powersc==0) {
						System.out.println("기능을 종료합니다.");
						break;
					}
				}else if(dao.dto.state.equals("전원켜짐")) {
					System.out.println("전원을 종료하시겠습니까?");
					System.out.println("종료를 원하시면 <종료>입력해주세요.");
					callEnd = sc.next();
					if(callEnd.equals("종료")) {
						dao.dto.state="전원꺼짐";
						System.out.println("휴대폰을 종료합니다.");
						break;
					
				}
				}
				}	
				}
				break;
				}
			
		}
	
		
		
	}
	
}
