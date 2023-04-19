package pack01_base;

public class Ex07_OverLoading {
	//메소드 오버로딩 : 같은 이름의 메소드에 파라미터 개수와 타입을 다르게 설정하여 선택해서 사용할 수 있도록 하는 것
	//대표적 : pritnln() -> 어떤 타입을 넣어도 일단 출력이 되게끔 만들어뒀다.
	
	int iNum;
	String str;
	
	int iNum(int iNum) {
		return 0;
	}
	
	int iNum1(int iNum, String str) {
		return 1;
	}
	
	public static void main(String[] args) {
		Ex07_OverLoading ov = new Ex07_OverLoading();
		
	}
}
