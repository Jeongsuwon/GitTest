package pack07_last.jdbc;

import java.util.Scanner;

public class BoardMain {
	//main => html, jsp, android app화면 등의 실제 사용자 눈에 보이는 메인화면
	

public void displayMenu() {
	System.out.println("게시판 프로그램");
	System.out.println("=======메뉴=======");
	System.out.println("게시글 조회 : S"); // select -> Create
	System.out.println("게시글 추가 : I"); // insert -> Read
	System.out.println("게시글 수정 : U"); // update
	System.out.println("게시글 삭제 : D"); // delete
	System.out.println("종료 : E");
	System.out.println("===============");
}

//static 멤버는 먼저 메모리에 로딩되어야하기때문에 같은 static멤버로 만들거나,
//아니면 클래스를 인스턴스화하여 static멤버의 메모리 공간에 올려서 사용.

public static void main(String[] args) {
	
	BoardDAO dao = new BoardDAO();
//	dao.selectList();
	//사용자가 검색한 내용을 토대로 목록을 보여주기
	Scanner sc = new Scanner(System.in);
	dao.getConn();
	dao.selectList();
	
	
//	BoardMain bm = new BoardMain();
//	bm.displayMenu();
	
//	Scanner sc = new Scanner(System.in);
//	String testMenu = sc.nextLine();
//	System.out.println(testMenu);
// 나중에 기능 완료 후 재사용이 가능하게 반복문 사용
}
}
