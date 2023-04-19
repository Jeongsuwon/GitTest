package pack04_oop2;

import java.util.Scanner;

public class StudentDAO {
	void display(StudentDTO st) {
		System.out.println("번호 : " + st.getNum());
		System.out.println("국어 : " + st.getKor());
		System.out.println("수학 : " + st.getMat());
		System.out.println("영어 : " + st.getEng());
		System.out.println("이름 : " + st.getName());
		System.out.println("총합 : " + st.getTotal());
		System.out.println("평균 : " + st.getAvg());
	}
	

}