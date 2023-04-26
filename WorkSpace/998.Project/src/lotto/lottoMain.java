package lotto;

import java.util.Scanner;

public class lottoMain {

	public static void main(String[] args) {
		lottoDAO dao = new lottoDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<<<lotto 프로그램>>>");
		
		System.out.println("lotto를 몇 장 구매하시겠습니까?");
		while(true) {
			int cnt = dao.inInput();
			if(cnt<1) {
				System.out.println("개수를 확인해주세요.");
			}else {
			int money = cnt * 1000;
			System.out.println(money+"이 결제됩니다.");
			}
		}
			
		
		
		
		
	}

}
