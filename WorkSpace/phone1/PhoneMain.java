package phone1;

import java.util.Scanner;

public class PhoneMain {
		public static void main(String[] args) {
			boolean power;
			String callEnd;
			Scanner sc = new Scanner(System.in);
			PhoneDAO dao = new PhoneDAO();
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
					System.out.println("♬상대방에게 전화가 걸려왔습니다♬");
					dao.function();
					while(true) {
					System.out.println("1.통화 / 2.그만한다(종료시점으로 이동)");
					int callBye = dao.inputInt();
					if(callBye==1) {
						System.out.println("♬다른 상대방에게 전화가 걸려왔습니다♬");
						dao.function();
					}else if(callBye==2) {
						System.out.println("휴대폰을 종료하시겠습니까?");
						System.out.println("종료를 원하시면 <종료>입력해주세요.");
						callEnd = sc.next();
						if(callEnd.equals("종료")) {
							dao.dto.state="전원꺼짐";
							System.out.println("휴대폰을 종료합니다.(현재상태:" + dao.dto.state + ")" );
							dao.function();
							break;
							
						}
					}else {
						continue;
					}
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
