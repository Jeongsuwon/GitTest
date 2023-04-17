package pack03_array2;

import java.util.Random;
import java.util.Scanner;


public class TestCompare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("레벨을 입력하세요.");
		int lev=Integer.parseInt(sc.nextLine()); //숫자 외에 값 입력 오류!
		int[]array=new int [lev];//-값 또는 들어오면 오류
		
		for(int i=0; i<lev; i++) {
			array[i]=i+1;
		}
		int random = new Random().nextInt(lev);
		array[random]=random;
		System.out.println("숫자를 맞추세요.");

		for(;;) {

			int num=Integer.parseInt(sc.nextLine());

			if(num==random) {

				System.out.println("딩동댕");

				break;

			}else if(num>random) {

				System.out.println("땡! 더 작은 수를 입력하세요");

			}else {

				System.out.println("땡! 더 큰 수를 입력하세요");

			}
	}
	}
	}
