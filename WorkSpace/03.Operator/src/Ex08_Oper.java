
public class Ex08_Oper {

	public static void main(String[] args) {
		//비교 연산자 : 조건문에 많이 사용된다.
		//조건 : 어떤 식이 참 또는 거짓 판단
		
		int num1 = 10, num2 = 10;
		
		//조건식을 사용 후에 결과가 반드시 true, false
		
		boolean result = num1 == num2 ? true : false; //true
		boolean result1 = num1 != num2 ? true : false; // false
		boolean result2 = num1 <= num2 ? true : false; // true
		boolean result3 = num1 >= num2 ? true : false; 
		boolean result4 = num1 > num2 ? true : false; 
		boolean result5 = num1 < num2 ? true : false;  
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3); //true
		System.out.println(result4); // false
		System.out.println(result5); // false
		
		//식을 연결 : 논리연산자 (여러 개의 조건을 판단)
		System.out.println("------------");
		System.out.println(10>5 && 20>6);
		System.out.println(10>5 && 20<6); // true(1) * false(0) = false(0)  
		System.out.println(5>10 && 20>5);   
		System.out.println(5>10 && 5>20);   
		
		System.out.println("------------");
		System.out.println(10>5 || 20>6); // true(1) + true(1) = true(1)
		System.out.println(10>5 || 20<6); // true(1) + false(0) = true(1)  
		System.out.println(5>10 || 20>5); // false(0) + true(1) = true(1)  
		System.out.println(5>10 || 5>20); // false(0) + false(0) = false(0) 
	}

}
