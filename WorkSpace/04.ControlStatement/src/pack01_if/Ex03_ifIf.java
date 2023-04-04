package pack01_if;

public class Ex03_ifIf {

	public static void main(String[] args) {
		//블럭킹 => { }(지역)
		//int num1 = 10;(변수 초기화 시 메모리 어느 부분에 값 저장 후 변수명으로 찾아 사용
		//변수는 언제까지 메모리에 저장이 되어있을까?
		//블럭킹이 닫히는 구간까지
		
		int num1 = 10;
		System.out.println(num1);
		if(num1==10) {
//			int num1 = 10; 1. main에서 이미 같은 변수를 초기화해서 
			int num2 = 10; //2. if문의 블럭킹이 닫히기 전까지
			System.out.println(num2);
		}
		
		{
			int num2=10; //3. 이미 if문 내에서 사용가능한 num2 변수메모리가 없어졌기에
		}
	}

}
