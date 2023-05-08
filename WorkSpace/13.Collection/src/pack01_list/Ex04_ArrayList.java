package pack01_list;

import java.util.ArrayList;
import java.util.List;

public class Ex04_ArrayList {
		//사용빈도가 높음. 배열의 단점을 보완하고 불필요한 체이닝, 멀티쓰레딩 등의 기능이 없기때문에 제일 많이 사용됨.
		//List<E> list = new ArrayList<E>();
		//ArrayList<E> list = new ArrayList<E>();
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("정");
		list.add("수원");
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(30);
		listInt.add(40);
		List<Boolean> listIsBool = new ArrayList<Boolean>();
		listIsBool.add(true);
		listIsBool.add(false);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println(listInt.get(i));
			System.out.println(listIsBool.get(i));
		}
		
		//향상된 for문
		//for문과 구조가 다름 : Collection이나 배열 등의 자료구조 내부에 Element를 한 건씩 빼줘서, 가독성을 높인 구조.
		//for(요소:자료구조){알아서 자료구조의 크기만큼 반복을 하며 : 기준 왼쪽 요소에 아이템을 하나씩 빼면서 반복}
		
		for(String str : list) {
			System.out.println(str);
		}
		
		
		for(Integer num : listInt) {
			System.out.println(num);
		}
		
		for(Boolean bool : listIsBool) {
			System.out.println(bool);
		}
		
		
		
	}
}
