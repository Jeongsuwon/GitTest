package pack04_oop2;

//Student Class : 학생의 성적정보를 관리할 수 있게 만든 설계도
public class Student {
	//멤버(필드): 학생의 번호, 이름, 국어성적, 수학성적, 영어성적, 총점, 평균
	int num, kor, mat, eng, total;
	double avg;
	String name;

	public Student(int num, int kor, int mat, int eng, String name) {
		this.num = num;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		this.total = this.kor+this.mat+this.eng;
		this.avg = (double)(this.kor+this.mat+this.eng)/3;
		this.name = name;
	}
	
	void display() {
		System.out.println(num);
		System.out.println(kor);
		System.out.println(mat);
		System.out.println(eng);
		System.out.println(name);
	}
	

	
	
	
}
