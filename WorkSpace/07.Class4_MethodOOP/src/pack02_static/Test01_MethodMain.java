package pack02_static;
import java.util.Scanner;
public class Test01_MethodMain {

	public static void main(String[] args) {
		String id="";
		String pw="";
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("아이디를 입력하세요 ↓");
//		id = null;
//		try {
//			id = sc.nextLine();
//		}
//		catch(NullPointerException e){
//			System.out.println("아이디를 입력하세요");
//		}
//		System.out.println("비밀번호를 입력하세요 ↓");
//		pw = sc.nextLine();
		Test01_Method mt = new Test01_Method(id, pw); 
		mt.sc(id, pw);
		mt.isLogin();
		
	}

}

