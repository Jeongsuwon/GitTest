package pack07_oop3;

import java.lang.reflect.Array;
import java.util.Iterator;

public class ProductMain {

	public static void main(String[] args) {
		String[] strArr = new String[5];
		strArr[0] = "null";
		strArr[1] = "null";
		strArr[2] = "null";
		strArr[3] = "null";
		strArr[4] = "null";
		
		//1. 처음보는 타입을 배열로 묶을 때 어려움이 있으면 해당하는 타입을 먼저 객체로 생성해보기
		//2. 생성한 객체를 배열의 임의의 인덱스에 넣어보기.
		//3. 객체 생성시 사용한 생성자 또는 값을 배열의 인덱스에 넣게 수
		
		System.out.println(strArr.length);
		ProductDTO[] dtoArr = new ProductDTO[5];
		
		dtoArr[0] = new ProductDTO(1, "음료수", 10000, 10);
		dtoArr[1] = new ProductDTO(2, "과자", 20000, 5);
		dtoArr[2] = new ProductDTO(3, "아이스크림", 20000, 5);
		dtoArr[3] = new ProductDTO(4, "커피", 20000, 5);
		dtoArr[4] = new ProductDTO(5, "라면", 20000, 5);
		
		
		ProductDAO dao = new ProductDAO();
		dao.Array(dtoArr);

		// 1. dtoArr : 1, 1~4 인덱스에는 Null?
		
		// 2. dtoArr[0] : ? 값 대입을 뭘 해줘야할까?
	
	}

}
