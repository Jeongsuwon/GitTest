package pack02_array;

public class Test01_ArraySum {

	public static void main(String[] args) {
		//10개의 크기를 가진 String형 배열 sArr이 있다.
		//sArr내부에는 문자열 1부터 각각의 인덱스에는 10까지 할당
		//sArr내부에 들어있는 문자열을 숫자로바꿔서 누적합을 구하고 출력해보기. 
		
		String[] sArr = new String[10];
		sArr[0] = "1";
		sArr[1] = "2";
		sArr[2] = "3";
		sArr[3] = "4";
		sArr[4] = "5";
		sArr[5] = "6";
		sArr[6] = "7";
		sArr[7] = "8";
		sArr[8] = "9";
		sArr[9] = "10";
		int sum = 0;		
		for(int i=0; i<=9; i++) {
			sum+=Integer.parseInt(sArr[i]);
			
		}
		System.out.println(sum);
		
		
	}

}
