package pack01_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex03_LinkedList {
		//사용빈도가 낮음. 인덱스끼리 체이닝(연결) 구조를 가지고있어서 장점이 한 두가지 있지만
		//실제 사용 용도로는 느리고 불편함.(눈으로 확인이 데이터 건수가 낮을 때는 식별불가)
	
		//책 예제: system.nanoTime();이라는 메소드를 이용해서 ArrayList vs LinkedList를 비교
	public static void main(String[] args) {
		List<String> listArray = new ArrayList<String>();
		List<String> listLinkeded = new LinkedList<String>();
		
		long startTime;
		long endTime;
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			listArray.add(0, i+"");
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList의 작업 시간: " +(endTime-startTime)+" ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			listLinkeded.add(0, i+"");
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList의 작업 시간: " +(endTime-startTime)+" ns");
		
	}
}
