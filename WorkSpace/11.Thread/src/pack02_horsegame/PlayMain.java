package pack02_horsegame;

import java.util.Random;
import java.util.Scanner;

public class PlayMain {
	public static int rank = 0;
	public static int choice = 0;
	public static void main(String[] args) {
		//5마리의 말이 있음.
		//사용자로부터 몇 번 말이 1등을 할 것인지를 입력하게 만들고,
		//맞는지 틀린지를 출력하는 로직을 넣어보기.
		Scanner sc = new Scanner(System.in);
		System.out.println("잠시 후 경마게임이 시작됩니다.");
		System.out.println("1등을 할 것 같은 말을 선택해주세요.");
		int choice = Integer.parseInt(sc.nextLine());

		Player p1 = new Player(1, new Random().nextInt(10)+1);
		Player p2 = new Player(2, new Random().nextInt(10)+1);
		Player p3 = new Player(3, new Random().nextInt(10)+1);
		Player p4 = new Player(4, new Random().nextInt(10)+1);
		Player p5 = new Player(5, new Random().nextInt(10)+1);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}
}
