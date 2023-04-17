package pack02_trycatch;

import java.util.Random;
import java.util.Scanner;

public class Test01_TryCatch {
	public static void main(String[] args) {
		
		//배열의 랜덤한 공간에 숫자 숨기기 게임.
		//기존로직은 그대로 사용
		//단, 사용자의 입력은 자유로운데 잘못입력시"잘못된 입력입니다. 숫자범위 ?~?까지만 입력해주세요"
		//가 나오고 프로그램은 강제로 종료되는 경우가 없다.(게임 끝까지)
		
		System.out.println("난이도를 입력하세요:"); // Scanner를 이용하여 숫자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		int stage = 0; //숫자 외 값 오류
		int[] array = new int[0]; 
		while(array.length<2) {
		try {
			if(stage==0||stage==1) {
				System.out.println("2이상의 숫자값만 입력해주세요.");
			}
			stage=Integer.parseInt(sc.nextLine());
			array = new int[stage];
		} catch (NumberFormatException e) {
			System.out.println("잘못된 입력입니다. 2이상의 숫자만 입력해주세요.");	
		} catch(NegativeArraySizeException e) {
			System.out.println("잘못된 입력입니다. 2이상의 숫자만 입력해주세요.");	
		} 
		}
		 
		int num = new Random().nextInt(stage);
		
		array[num]=num;
		System.out.println("랜덤값 확인용 : " + num);  //배열의 랜덤한 인덱스에 특정한 다른 값을 숨김.
		for(int i=0; i<array.length; i++) {
			array[i]=i;
			System.out.print(array[i]+ " ");
		}
		String[] result = new String[stage];
		for(int j=0; j<result.length;j++) {
			result[j]="?";
		}
		System.out.println();
		
		System.out.println("랜덤한 숫자가 숨어있는 곳을 찾아보세요.");
		
		
		// 배열의 특정한 인덱스에 랜덤하게 다른값을 숨김 [] [] [] [x ][ ][ ][ ][ ][ ] []
		
		System.out.println();
		int answer = 0;
		while(answer<=0) {
		try{
			
			answer = Integer.parseInt(sc.nextLine())-1;
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다. 1이상의 숫자만 입력해주세요.");	
		
		while(true) {
			for(int j=0; j<result.length;j++) {
				System.out.println(j+1+"["+result[j]+"],");
			}
			if(num==answer) {
				System.out.println("정답입니다.");
				break;
			}
			
			else {
				result[answer]="X";
				System.out.println("오답입니다. 다시 찾아보세요");
				answer = Integer.parseInt(sc.nextLine());
			}
		}
		}	
		}	
	}
}
