package pack01_inputstream;

import java.io.IOException;
import java.io.InputStream;

public class Ex02_InputSingle {
	//-사용자가 영문자를 입력 -> Enter Key 입력
	//-Enter를 입력하는 것은 프로그램의 종료(Terminate: ctrl+c)가 아니다.
	//-CR(Carriage Return) : 커서를 줄의 맨 앞으로 이동(\r)
	//-LF(Line Feed) ; 커서를 한 줄 아래로 이동(\n)
	public static void main(String[] args) {
		InputStream is = System.in;//콘솔창으로부터 입력받을 수 있게 초기화가 되어있음
		System.out.println("영문자 1글자를 입력하세요: ");
		
		try {
			int data=is.read();
			System.out.println(data);//ASCII Code : A를 입력하고 Enter Key를 입력함.
			System.out.println((char)data); // A -> 65 값 나옴
			
			data = is.read();
			System.out.println("남은 데이터 :" + data); // 13(CR)
			data = is.read();
			System.out.println("남은 데이터 :" + data); // 10(LF)
			data = is.read();
			System.out.println("남은 데이터 :" + data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
