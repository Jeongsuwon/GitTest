package pack01_list;

import java.util.ArrayList;
import java.util.List;

public class Ex01_List {
public static void main(String[] args) {
	//Collection Framework
	//Collection : 자료를 수집해서 가지고 있을 수 있는 기능을 가진 자료구조(클래스, 배열)
	//FrameWork : 어떤 목적이나 기능을 미리 쉽게 사용하게 만들어놓은 것 (복잡)
	//List<Extends Object> list = new ...<>();
	//List는 Object를 상속받은 객체 타입만 데이터를 수집하게 해놓음.(클래스)
	//List< 묶을 데이터타입(DTO)>list=new 자료구조타입(...);
	//ArrayList는 Ex03~04 사용 예정
	List<String> list = new ArrayList<String>();  //-> E(Element)는 요소 : 어떤 내용이 내부에 묶여서 저장이 될지
	list.add("Java1");//List가 String타입을 묶어놓기로 약속이 되어있기때문에 String만 요소로 넣을 수 있음.
	list.add("Java2");
	list.add("Java3");
	list.add("Java4");
	list.add("Java5");
	list.add(3, "끼워넣기"); //결과 예측 : 용어 : 메소드가 파라메터나 타입다르고 똑같은 이름을 가진 것 -> 오버로딩
							 //잘 사용안함(DB에서 정렬해 온 정보가 정합성을 가지고 있기때문에
	System.out.println(list.size()); //배열의 크기는 arr.length
	System.out.println(list.get(0)); //list도 배열과 마찬가지로 0부터 시작해서 크기 -1까지의 index를 가짐.
	
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
		
	}
}
}
