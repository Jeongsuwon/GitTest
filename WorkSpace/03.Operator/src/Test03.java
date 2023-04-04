import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		//다항 연산자 또는 이항연산자를 이용해서 문제 풀어보기.
		//scanner이용해보기.
		Scanner sc = new Scanner(System.in);
		String inputData1 = sc.nextLine();
		
		int iNum = Integer.parseInt(inputData1);
		String num1 = iNum % 2 == 0 ? "짝수" : "홀수";
		String num2 = iNum % 2 == 0 ? "홀수" : "짝수";
//		boolean bNum = iNum % 2 == 0 ? true : false;
//		int bNum = iNum % 2 == 0 ? 1 : 2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("----------------------");
		
		num1 = sc.nextLine();
		num2 = sc.nextLine();
		
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
		System.out.println(Integer.parseInt(num1)-Integer.parseInt(num2));
		System.out.println(Integer.parseInt(num1)*Integer.parseInt(num2));
		System.out.println(Integer.parseInt(num1)/Integer.parseInt(num2));
		
		System.out.println("----------------------");
		
		System.out.println(Integer.parseInt(num1) > Integer.parseInt(num2) ? num1 : num2);
		
		
		
	
		
		
	}

}
