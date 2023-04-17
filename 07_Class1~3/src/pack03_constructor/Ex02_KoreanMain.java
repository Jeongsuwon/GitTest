package pack03_constructor;

public class Ex02_KoreanMain {

	public static void main(String[] args) {
		
		Ex02_Korean ko = new Ex02_Korean("김한국","123456-1234567");
		//강제로 데이터의 정합성: 이름과 주민번호가 없는 데이터(객체)하나는 실제하면 안됨.
		System.out.println(ko.nation + ko.name + ko.ssn);
	
	}

}
