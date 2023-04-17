package pack03_array2;

import java.util.Iterator;

public class Ex02_Array {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3}; //int형 1차원 배열 array1을 초기화.
		
		for(int i = 0 ; i < array1.length ; i ++) {
			System.out.println(array1[i]);
		}
		
		
		int[] array2 = {4, 5}; // int형 1차원 배열 array2을 초기화.
		
		for(int i = 0 ; i < array2.length ; i ++) {
			System.out.println(array1[i]);
		}
		
		
		int[][] arrayA2 = {
				array1,		//int형 2차원 배열에 1차원 배열 array1, array2 할당하여 초기화.
				array2,
				{7,8,9}
		};
		//구조 설명을 코드리뷰해보기.
		for(int i=0; i<arrayA2.length; i++) { //행의크기 : i, arrayA2.length : 1차원 배열의 크기까지 반복
			for(int j=0; j<arrayA2[i].length; j++) { //열의 크기: j, arrayA2[i].length : 
			System.out.print(arrayA2[i][j]);
			}
			System.out.println();
		}
	}

}
