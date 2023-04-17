package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//Test01_Game이라는 클래스를 만듬.
				
				//숫자는 게임의 난이도가 된다.
				//ex)10입력 => 난이도10임.
		
				//사용자는 어느칸에 특정한 값이 숨어있는지 맞추는 게임
				//new Random().nextInt(바운더리);//0~바운더리 내에서 랜덤한수생성
				
				//예시 ) 사용자가 10입력
				// 난이도는 10임.
				// 배열을 만듬 [] [] [] [] [] [] [] [] [] []
				// 배열의 특정한 인덱스에 랜덤하게 다른값을 숨김 [] [] [] [x ][ ][ ][ ][ ][ ] []
				//사용자가 답을 입력함 . 3=> 오답
				// 사용자가 답을 입력함 . 4=> 정답                                    ↑
		
		System.out.println("난이도를 입력하세요:"); // Scanner를 이용하여 숫자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		int stage = Integer.parseInt(sc.nextLine());
		
		int[] array = new int[stage]; //난이도의 크기를 가진 배열을 만들고
		
		int num = new Random().nextInt(stage); 
		System.out.println("랜덤값 확인용 : " + num);  //배열의 랜덤한 인덱스에 특정한 다른 값을 숨김.
		array[num]=num;
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
		int answer = Integer.parseInt(sc.nextLine())-1;
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
