package test;

import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;


	public class UserDAO {
		Scanner sc = new Scanner(System.in);
		String id, pw, name, call;
		int age;
		int result=0;
		Connection conn;
		PreparedStatement ps;
		ResultSet rs;
		
		public int intInput() { //정수만 입력받기
			while(true) {
			try {
				int intInput = Integer.parseInt(sc.nextLine());
				return intInput;
				
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
			}
		}
	 
		public Connection conn() { //db연결

			String url = "jdbc:oracle:thin:@211.223.59.99:1521:xe";
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, "hanul", "0000");
			} catch (Exception e) {
				System.out.println("알 수 없는 오류 발생! 개발자에게 문의하세요.");
			}
			return conn;
		}
//		String id, String pw, String name, String call, int age
		
		public void signUp() {	 //회원가입 //select문 추가해야함!!
			try {
				conn = conn();
				ps = conn.prepareStatement(" INSERT INTO member (member_id, member_pw, member_name, member_call, member_age) "
						+ " VALUES (?, ?, ?, ?, ?) ");
				System.out.print("아이디: ");
				exceptionId();
				ps.setString(1, id);
				System.out.print("비밀번호: ");
				exceptionPw();
				ps.setString(2, pw);
				System.out.print("이름: ");
				name = sc.nextLine();
				ps.setString(3, name);
				System.out.print("전화번호: ");
				call = sc.nextLine();
				ps.setString(4, call);
				System.out.print("나이: ");
				age = intInput();
				ps.setInt(5, age);
				result = ps.executeUpdate();
				if(result!=0) {
					System.out.println("회원가입이 완료되었습니다.");
				}else{
					System.out.println("회원가입에 실패하였습니다.");
				}
				
			} catch (SQLException e) {
				System.out.println("JswSqlplus Exception : " + e.getMessage());
			} finally {
				// conn , ps , rs 세가지 객체 전부 null로 비워줘야함.(DB Close)
				dbClose();
			}
		}

	//	
		public boolean signIn(UserDTO dto ) { //로그인
			String member = "select * from member where member_id=? and member_pw=?";
			try {
				while(true) {
				conn = conn();
				ps = conn.prepareStatement(member);
				System.out.print("아이디:");
				dto.setMember_id(sc.nextLine());
				ps.setString(1, dto.getMember_id());
				System.out.print("비밀번호:");
				dto.setMember_pw(sc.nextLine());
				ps.setString(2, dto.getMember_pw());
				rs = ps.executeQuery();
				if(rs.next()) {
					dto.getMember_id();
					dto.getMember_pw();
					return true;
				}
				else {
					System.out.println("id 또는 비밀번호를 확인하세요.");
					System.out.println("다시 입력 : r / 이전으로 : x");
					String again = sc.nextLine();
					if(again.equals("r")) {
						continue;
					}else if(again.equals("x")) {
						break;
					}else {
						System.out.println("잘못된 입력입니다.");
					}
					return false;
				}
				}
							
				
			} catch (SQLException e) {
				System.out.println("login sql문 오류");
			}finally {
				dbClose();
			}
			
			return false;
		}
		
		
		
		public void exceptionId() { //ID 제약조건
			try {
				while(true) {												 
				id = sc.nextLine();
				if(id.length()>20) {
					System.out.println("아이디는 20자 이내로 작성해주세요.");
					System.out.print("아이디: ");

				}else if(id.length()==0) {
					System.out.println("아이디를 입력해주세요.");
					System.out.print("아이디: ");

				}else {
					break;
				}
				}
			} catch (Exception e) {
			}
		}
		
		public void exceptionPw() { //PW 제약조건
			
			try {
				while(true) {
				pw = sc.nextLine(); 
				if(pw.length()==0) {
					System.out.println("비밀번호를 입력해주세요.");
					System.out.println("비밀번호: ");
				}else if(pw.length()>20) {
					System.out.println("비밀번호는 20자 이내로 작성해주세요.");
					System.out.println("비밀번호: ");
				}else {
					break;
				}
			}
			} catch (Exception e) {
				
			}
			
		}


		public void dbClose() { // conn , ps , rs 세가지 객체 전부 null로 비워줘야함.(DB Close)
			try {
				if(rs != null ) { rs.close() ; }
				if(ps != null ) {ps.close();}
				if(conn != null ) {conn.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


	//-------------관리자 메소드------------------------------------
		public void selectList() { // 가입되어있는 User 조회
			try {
				conn = conn();//DB 연결객체 초기화 시키기
				ps = conn.prepareStatement("select member_id, member_name, member_call, member_age from member");
				rs = ps.executeQuery();
				System.out.println("아이디 / 이름 / 전화번호 / 나이");
				while(rs.next()) {
					System.out.println(rs.getString("member_id") + " / " + rs.getString("member_name") +
							" / "+ rs.getString("member_call") + " / " + rs.getInt("member_age"));
				}
				
			} catch (SQLException e) {
				System.out.println("JswSqlplus Exception : " + e.getMessage());
			} finally {
				
				dbClose();
			}
		}
		
		
	//-------------사용자 메소드------------------------------------
	    public void update(UserDTO dto) { //회원정보 수정
	    	System.out.println(dto.getMember_id());
	    	System.out.println(dto.getMember_pw());
	    	System.out.println(dto.getMember_name());
	    	System.out.println(dto.getMember_call());
	    	System.out.println(dto.getMember_age());
	    	String sql = "select * from member where member_id = ?";
	    	try {
	    		selectList();
				conn = conn();
//				ps = conn.prepareStatement(sql);
//				rs = ps.executeQuery();
				ps = conn.prepareStatement
				(" update member set member_pw = ?, member_name = ?, member_call = ?, member_ age = ? where member_id = ?");
				System.out.println("[1]비밀번호 [2]이름 [3]전화번호 [4]나이 [5]종료");
				int num = intInput();
				switch(num) {
				case 1:
					System.out.print("변경할 비밀번호:");
					pw=sc.nextLine();
					dto.setMember_pw(pw);
					System.out.println(pw);
					ps.setString(1, dto.getMember_pw());
					break;
				case 2:
					System.out.print("변경할 이름:");
					name=sc.nextLine();
					dto.setMember_pw(name);
					ps.setString(2, dto.getMember_name());
					break;
				case 3:
					System.out.print("변경할 전화번호:");
					call=sc.nextLine();
					dto.setMember_pw(call);
					ps.setString(3, dto.getMember_call());
					break;
				case 4:
					System.out.print("변경할 나이:");
					age=intInput();
					dto.setMember_age(age);
					ps.setInt(4, dto.getMember_age());
					break;
				case 5:
					break;
				}
				ps.setString(5, dto.getMember_id());
				
				result = ps.executeUpdate();
				if(result!=0) {
					System.out.println("회원수정이 완료되었습니다.");
				}else{
					System.out.println("회원수정에 실패하였습니다.");
				}
				
			} catch (SQLException e) {
				System.out.println("JswSqlplus Exception : " + e.getMessage());
			} finally {
				// conn , ps , rs 세가지 객체 전부 null로 비워줘야함.(DB Close)
				dbClose();
			}
	    }
		
	    public boolean delete(UserDTO dto) { //회원탈퇴
	    	System.out.println(dto.getMember_id());
	    	try {
	    		while(true) {	
	    		System.out.println("아이디를 다시 입력해주세요.");
	    		id = sc.nextLine();
	    		if(dto.getMember_id().equals("admin")) {
    				System.out.println("관리자 아이디는 삭제가 불가능합니다.");
    				return false;
	    		}else {
	    			if(dto.getMember_id().equals(id)) {
	    				System.out.println("확인되었습니다.");
	    				dto.setMember_id(id);
	    	    		conn = conn();
	    				ps = conn.prepareStatement("delete from member where member_id=?");
	    				id=dto.getMember_id();
	    				ps.setString(1, dto.getMember_id());
	    				result = ps.executeUpdate();
	    			}else {
	    				System.out.println("현재 로그인 중인 아이디가 아닙니다.");
	    				System.out.println("재입력 : r / 이전으로 : x");
						String again =sc.nextLine();
						if(again.equals("r")) {
							continue;			
						}else if(again.equals("x")) {
							break;
						}else {
							System.out.println("잘못된 입력입니다.");
						}
	    				
	    			}	
	    			}
				if(result != 0) {
					System.out.println("삭제가 완료되었습니다.");
					break;
					
				}else {
					System.out.println("아이디를 다시 확인해주세요.");
						
						return true;
//					}
				}
	    		}
			} catch (Exception e) {
				System.out.println("JswSqlplus Exception : " + e.getMessage());
	    	
			}
			return false;
	    }
	
	    public void board() {
	    	
	    }
}