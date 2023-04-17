package pack02_array;

public class Ex02_Array {

	public static void main(String[] args) {

//		array[0] = 10;   
//		array[1] = 20;   
//		array[2] = 30;   
//		array[3] = 40;   
//		array[4] = 50;   
//		array[5] = 60;   
//		array[6] = 70;   
//		array[7] = 80;   
//		array[8] = 90;   
//		array[9] = 100;
		
		
		//1. 크기가 10인 int형 배열을 만들고 값을 10~100까지 할당하고 출력해보기
		//출력 결과 : 배열이름[인덱스] :
		
		int[] array = new int[10];
		int sum = 0; 
		double avg = 0;
		
		for(int i=0; i<=9; i++) {
			array[i]=(i+1)*10;
			sum += array[i];
			avg = (double)sum/(i+1);
			System.out.println("배열이름["+i+"]: "+array[i]);
			}
		//배열의 누적합
		System.out.println(sum);
		//배열의 평균
		System.out.println(avg);
			
	}

}
