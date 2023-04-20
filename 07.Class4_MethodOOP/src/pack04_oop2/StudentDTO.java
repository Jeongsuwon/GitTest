package pack04_oop2;

public class StudentDTO {
	//메소드나 변수 앞에 접근제한자라는 것을 사용하면, 외부에서의 접근을 제한할 수 있다.
	//public, protected, default, private
	//지금 사용할 것 : public(공공), private(사적)
	
	//public : 같은 프로젝트 내에서 접근 가능
	//default : 같은 패키지 내에서 접근 가능
	//private : 같은 클래스 내에서 접근 가능
	
	//getter & setter
	//변수 이름 앞에 get을 붙이고 뒤에 변 수이름 첫 번째 글자를 대문자로 바꾼 형태로,
	//외부에서의 접근이 막혀있는 변수를 메소드를 통해서 접근 가능하게 만든 구조
	//score1->getScore1()메소드 -> score1에 들어있는 값을 리턴
	//		  setScore1(int score1) -> score1에 값을 변경해줌
	public int num;
	private int kor; 
	private int mat, eng, total;
	private double avg;
	private String name;
	
	//전체 필드는 외부에서 접근이 불가능한 변수(완)
	//방금 했던 코드 자동완성 기능으로 getter&setter 만들어보기
	




	public StudentDTO(int num, int kor, int mat, int eng, String name) {
		this.num = num;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		this.name = name;
		this.total = kor+mat+eng;
		this.avg = (double)(kor+mat+eng)/3;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
}
