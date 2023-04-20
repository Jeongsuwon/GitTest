package pack02_static;

import java.util.Scanner;

public class Test01_Method {
	
	String id;
	String pw;

	public Test01_Method(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	boolean isLogin() {
		if(id.equals("master") && pw.equals("master1234")) {
		System.out.println(id + "님 로그인이 되셨습니다.");
		return true;
	}else{
		System.out.println("아이디 또는 비밀번호를 확인하세요!");
		return false;
	}
	
}
	Scanner sc(String id, String pw) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		pw = sc.nextLine();
		
		return new Scanner(System.in);
	}
}
