package pack05_public_private;

import pack04_oop2.StudentDTO;

public class Test {

	public static void main(String[] args) {
		//패키지가 다른 곳에 Test를 만들고 , public 접근 제한자를 가진 생성자 '메소드'에 접근
		
		
		//접근제한자가 없는 경우 default 접근제한자로 같은 패키지 내부에 있는 클래스 가능
		StudentDTO dto = new StudentDTO(0, 0, 0, 0, null);
		System.out.println(dto.num);
		
	}

}
