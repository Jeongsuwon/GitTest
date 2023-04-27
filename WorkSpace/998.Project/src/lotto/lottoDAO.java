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
	
	public int lottoNum() {
		int[] lotto = new int[7];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int) (Math.random(45))+1;
		}
		return 0;
	}
}
