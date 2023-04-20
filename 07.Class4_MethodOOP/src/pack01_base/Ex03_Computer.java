package pack01_base;

public class Ex03_Computer {
	
	int sum1(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; //<- 배열이기에 i가 아닌 arr[i] 
		}
		return sum;
	}
	
	//많이 안쓰는 형태의 메소드 파라미터
	int sum2(int ...values) {
		int sum = 0;
		for(int i=0;i<values.length;i++) {
			sum += i;
		}
		return sum;
	}

}
