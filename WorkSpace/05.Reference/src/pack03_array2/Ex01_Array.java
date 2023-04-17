package pack03_array2;

public class Ex01_Array {

	//1차원 배열(Array): 변수는 하나의 정보만 담을 수 있음.
	//연관이 있는 같은 데이터 타입을 하나로 묶어놓은 그룹이라고 생각하면 됨.
	//1차원 배열을 구성하는 요소 -> 변수들(데이터들)
	
	//2차원 배열: 1차원 배열은 x축(가로) 또는 y축(세로) 방향으로 행 또는 열만 있는 구조.
	//2차원 배열은 1차원 배열을 요소로 가지기때문에 x축과 y축을 동시에 가지고 있는 행렬구조
	//규칙 : 차원수 == for문수를 맞춰주면 모든 index(주소)에 접근이 가능
	
	public static void main(String[] args) {
		int[] array = new int[3];
		int[][] array2 = new int[2][3]; //2행 3열을 가지는 배열을 초기화 시킴.
		//배열의 크기 조회..
		System.out.println("배열의 크기 조회 : " + array.length);
		System.out.println("2차원 배열의 크기 조회 : " + array2[0].length );
		System.out.println(array[0]);

		//값을 주고 출력해보기(할당)
		//2차원 배열이 가지고 있는 첫번 째 1차원 배열에 접근.
		//2행3열을 가진 2차원 배열은 총 2x3인 6개의 데이터를 표현 가능.
		array2[0][0]=1;
		array2[0][1]=2;
		array2[0][2]=3;
		array2[1][0]=4;
		array2[1][1]=5;
		array2[1][2]=6;
		System.out.println(array2.length);
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				System.out.print(array2[i][j]);
			}
			System.out.println();
			
		}
	}

}
