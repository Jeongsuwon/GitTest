
public class Ex07_Oper {

	public static void main(String[] args) {
		
//		0~4
		
		System.out.println("초과, 미만 : 1, 2, 3");
		System.out.println("이상, 이하 : 0, 1, 2, 3, 4");
		
		int num = 8;
		String result = num == 10 ? "맞다" : "틀리다" ;
		System.out.println(result);
		
		// 숫자가 10이면 1을 그리고 아니라면 2를 담는 이항연산자 써보기.
		
		int resultInt = num == 10 ? 1 : 2;
		System.out.println(resultInt);
		
		//num에 있는 수가 9이하라면 true 그외에는 false를 담을 수 있는 식을 완성
		
		boolean num1 = num <= 9 ? true : false;
		System.out.println(num1);
		System.out.println(!num1);
		
	}

}
