package lotto;

import java.util.Scanner;

public class lottoDAO {
	
	public int inInput() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				int inputInt = Integer.parseInt(sc.nextLine());			
				return inputInt;
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}
	}
	}
}
