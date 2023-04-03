
public class Ex09_Oper {

	public static void main(String[] args) {
	
		//score라는 변수의 값이 90보다 크면 A등급, 80보다 크다면 B등급 ....
		
		int score = 61;
		
		String grade = score > 90 ? "A" : score > 80 ? "B" : score > 70 ? "C" : score > 60 ? "D" : "E";
		System.out.println(grade);
	
	}
	

}
