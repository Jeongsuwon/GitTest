package pack02_array;

public class Ex01_Array {
	public static void main(String[] args) {
		//배열이란?
		//자료형 변수를 생성하고 사용할 때 주로 사용.
		//규칙 : "동일한" 데이터 타입을 묶어서 사용하게 하며 정해진 수만큼
		//        저장 처리하는 "객체" -> 한 번 만든 크기는 다시 바꾸는게 불편
		//형태 : dataType[]name = new dataType[size];
		
		//아직 스캐너나 별도의 처리로 점수를 입력하지 않은 변수 5개를 준비만
		int score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0;
		int[]scoreArray=new int[5];
		//배열의 인덱스 규칙 : n의 크기가 주어진 배열은 0부터 n-1까지의 주소
		System.out.println("scoreArray[0]값:" + scoreArray[0]);
		System.out.println(scoreArray);
		//[I@37d31475 -> 배열의 메모리 주소(값 x)
		scoreArray[0] = 10; //배열에 데이터 타입이 주어졌으면 해당하는 타입의 변수
		scoreArray[1] = 20;
		scoreArray[2] = 30;
		scoreArray[3] = 40;
		scoreArray[4] = 50;
		System.out.print(scoreArray[0]);
		System.out.print(scoreArray[1]);
		System.out.print(scoreArray[2]);
		System.out.print(scoreArray[3]);
		System.out.println(scoreArray[4]);
		
		//배열의 크기가 100이였다면 -> 반복문(반복되는 일은 컴퓨터가 잘함)
		
		for(int i=0; i<=4; i++) {
			System.out.println(scoreArray[i]);
		}
		
	}
}
