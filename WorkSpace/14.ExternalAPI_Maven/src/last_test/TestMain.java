package last_test;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
	UserDAO dao = new UserDAO();
	Scanner sc = new Scanner(System.in);
//	dao.conn();
	System.out.println("=================");
	System.out.println(" 팀플 프로젝트 ");
	System.out.println("(게시판 만들기)");
	System.out.println("=================");
	System.out.println("1.게시판 / 2.날씨");
	int function = dao.intInput();
	if(function==1) {
		System.out.println("[회원이시면 로그인, 아니시면 회원가입을 해주세요.]");
		System.out.println("1.로그인 / 2.회원가입");
		int sign = dao.intInput();
		if(sign==1) {
//			dao.signIn();
		}else if(sign==2) {
			dao.signUp();
		}
	}
	
}
}
