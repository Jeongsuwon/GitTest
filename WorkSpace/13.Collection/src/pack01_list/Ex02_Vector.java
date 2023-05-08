package pack01_list;

import java.util.List;
import java.util.Vector;

public class Ex02_Vector {
public static void main(String[] args) {
	//사용 빈도가 없거나 매우 낮기때문에 이론만 살펴보고 넘어가기.
	//List라는 Interface를 상속받았기에 기본 구조는 ArrayList, LinkedList, Vector 전부 비슷함.
	//? TestDTO라는 클래스를 묶어서 저장하고싶다. ?에는 무엇을 넣을까.
	//1.List 생성
	//2.List에 요소 추가해보기.(TestDTO)
	//3.List에 있는 요소 내용 출력
	
	List<TestDTO> list = new Vector<TestDTO>();
	list.add(new TestDTO("정", "수원")); //-->한 줄로 코딩
	System.out.println(list.get(0).getFirstName());
	System.out.println(list.get(0).getLastName());
	
	
}
}
