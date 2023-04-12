package pack03_array2;

import java.util.Arrays;

public class TestLast {
														
	public static void main(String[] args) {
		
		//2차원 배열을 만듦.
		//2차원 배열의 크기와 타입은 자유롭게 하면 됨.
		//2차원 배열에 구구단 2~9단의 답을 저장하고 2차원 배열을 통해 출력까지 해보기.
		//*for문을 이용해서 풀 것 *
													
		int[][] gugudan = new int[8][9];
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				gugudan[i-2][j-1]=i*j;
				System.out.print(gugudan[i-2][j-1]+" ");
			}
			System.out.println();
		}
		
		
		
		//1차원 배열이 2개가 있음.
		//arrA = {1, 2, 3, 4}
		//arrB = {4, 5, 6, 7}
		//변경 후,
		//arrA = {4, 5, 6, 7}
		//arrB = {1, 2, 3, 4}
		
		int[] arrA = {1, 2, 3, 4};
		int[] arrB = {4, 5, 6, 7};
		int[] temp;
		
		temp=arrA;
		arrA=arrB;
		arrB=temp;
		
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));
		
		
		//심화 ) int[] arr = { 3 , 4 , 6 , 7 , 8 , 9 , 1 , 2 , 5 }
		//해당 내용을 오름차순 또는 내림차순으로 정렬해서 보여주기.
		//작업후 => arr => { 1 ,~~~9 } { 9~~1 }
		
		int[] arr = {3, 4, 6, 7, 8, 9, 1, 2, 5};
		
		for(int i=0; i<=arr.length; i++) {
			for(int j=i+1; j<=arr.length; j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}System.out.println(Arrays.toString(arr));
		}
		
	}

}
