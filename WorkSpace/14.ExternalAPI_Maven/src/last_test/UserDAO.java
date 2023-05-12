package last_test;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;


	public class UserDAO {
		Scanner sc = new Scanner(System.in);
//		String id, pw, name, call;
//		int age;
		Connection conn;
		PreparedStatement ps;
		ResultSet rs;
		
		public int intInput() {
			while(true) {
			try {
				int intInput = Integer.parseInt(sc.nextLine());
				return intInput;
				
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
			}
		}
	 
		public Connection conn() {

			String url = "jdbc:oracle:thin:@211.223.59.99:1521:xe";
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, "hanul", "0000");
			} catch (Exception e) {
				System.out.println("알 수 없는 오류 발생! 개발자에게 문의하세요.");
			}
			return conn;
		}
		
		
		public void signUp(String id, String pw, String name, String call, int age) {
//			System.out.println("아이디: ");
//			id = sc.nextLine();
//			System.out.println("비밀번호: ");
//			pw = sc.nextLine(); 
//			System.out.println("이름: ");
//			name = sc.nextLine(); 
//			System.out.println("전화번호: ");
//			call = sc.nextLine(); 
//			System.out.println("나이: ");
//			age = Integer.parseInt(sc.nextLine());
//			int age;
			try {
				conn = conn();//DB 연결객체 초기화 시키기
				ps = conn.prepareStatement(" INSERT INTO member (member_id, member_pw, member_name, member_call, member_age) "
						+ " VALUES (?, ?, ?, ?, ?) ");//사용자가 글의 식별자가 되는 글번호를 직접 입력을 할까?
																 // 한다 vs 안한다 방법 ?
				ps.setString(1, id);
				ps.setString(2, pw);
				ps.setString(3, name);
				ps.setString(4, call);
				ps.setInt(5, age);
				//rs = ps.executeQuery();
				int result = ps.executeUpdate();
				System.out.println(result);
				
			} catch (SQLException e) {
				System.out.println("JswSqlplus Exception : " + e.getMessage());
			} finally {
				// conn , ps , rs 세가지 객체 전부 null로 비워줘야함.(DB Close)
				dbClose();
			}
		}
		
		public boolean signIn(String id, String pw) {
//			System.out.println("아이디:");
//			id = sc.nextLine();
//			System.out.println("비밀번호:");
//			pw = sc.nextLine();
			String member = "select * from member where member_id=? and member_pw =?";
			try {
				conn = conn();
				ps = conn.prepareStatement(member);
				ps.setString(1, id);
				ps.setString(2, pw);
				rs = ps.executeQuery();
				if(rs.next()) {
					return true;
				}
				return false;
				
			} catch (SQLException e) {
				System.out.println("login sql문 오류");
			}finally {
				dbClose();
			}
			
			return false;
		}
		
		public void selectList() {
			try {
				conn = conn();//DB 연결객체 초기화 시키기
				ps = conn.prepareStatement("select member_id from member");
				rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt("member_id"));
				}
				
			} catch (SQLException e) {
				System.out.println("JswSqlplus Exception : " + e.getMessage());
			} finally {
				// conn , ps , rs 세가지 객체 전부 null로 비워줘야함.(DB Close)
				dbClose();
			}
		}
		


		public void dbClose() {
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	

}
