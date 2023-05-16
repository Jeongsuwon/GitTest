package last_test;


	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.Scanner;

	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;
	import org.json.simple.parser.JSONParser;
	import org.jsoup.Jsoup;


	public class UserDAO {
		UserDTO dto = new UserDTO();
		Scanner sc = new Scanner(System.in);
		String id = dto.getMember_id();
		String pw = dto.getMember_pw();
		String name = dto.getMember_name();
		String call = dto.getMember_call();
		int age = dto.getMember_age();
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
		
		public void signUp() {	 //회원가입
			String sql = "select * from member";
			try {
				conn = conn();
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				System.out.println("<현재 만들어져있는 아이디들>");
				while(rs.next()) {
					System.out.print(rs.getString("member_id") + " / ");
					
				}
				ps = conn.prepareStatement(" INSERT INTO member (member_id, member_pw, member_name, member_call, member_age) "
						+ " VALUES (?, ?, ?, ?, ?) ");
				System.out.println();
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
					System.out.println("현재 로그인 된 아이디:" + dto.getMember_id());
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
	    	String sql = "select * from member where member_id = ?";
	    	try {
				conn = conn();
				ps = conn.prepareStatement(sql);
				ps.setString(1, dto.getMember_id());
				rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println("아이디 / 이름 / 전화번호 / 나이");
					System.out.println(rs.getString("member_id") + " / " + rs.getString("member_name") +
							" / "+ rs.getString("member_call") + " / " + rs.getInt("member_age"));
				}
				
//				ps = conn.prepareStatement
//						(" update member set member_pw = ?, member_name = ?, member_call = ?, member_ age = ? where member_id = ?");
				
				
				
				
				System.out.println("[1]비밀번호 [2]이름 [3]전화번호 [4]나이 [5]종료");
				int num = intInput();
				switch(num) {
				case 1:
					String pwUp = "update member set member_pw=? where member_id =?";
					ps=conn.prepareStatement(pwUp);
					System.out.print("변경할 비밀번호:");
					pw=sc.nextLine();
					dto.setMember_pw(pw);
					System.out.println(pw);
					ps.setString(1, dto.getMember_pw());
					ps.setString(2, dto.getMember_id());
					break;
				case 2:
					String nameUp = "update member set member_name=? where member_id =?";
					ps=conn.prepareStatement(nameUp);
					System.out.print("변경할 이름:");
					name=sc.nextLine();
					dto.setMember_name(name);
					ps.setString(1, dto.getMember_name());
					ps.setString(2, dto.getMember_id());
					break;
				case 3:
					String callUp = "update member set member_call=? where member_id =?";
					ps=conn.prepareStatement(callUp);
					System.out.print("변경할 전화번호:");
					call=sc.nextLine();
					dto.setMember_call(call);
					ps.setString(1, dto.getMember_call());
					ps.setString(2, dto.getMember_id());
					break;
				case 4:
					String ageUp = "update member set member_age=? where member_id =?";
					ps=conn.prepareStatement(ageUp);
					System.out.print("변경할 나이:");
					age=intInput();
					dto.setMember_age(age);
					ps.setInt(1, dto.getMember_age());
					ps.setString(2, dto.getMember_id());
					break;
				case 5:
					break;
				}				
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
	    	try {
	    		while(true) {	
	    		System.out.println("아이디를 다시 입력해주세요.");
	    		id = sc.nextLine();
	    		if(dto.getMember_id().equals("admin")) {
    				System.out.println("관리자 아이디는 삭제가 불가능합니다.");
    				return false;
	    		}else {
	    			if(dto.getMember_id().equals(id)) {
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
					dto.setMember_id("");
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
	    
	    public void weather() {
	    	String[][] tempCategory = { 
					{"T1H" , "기온" },
					{"RN1" , "1시간 내 강수량" },
					{"REH" , "습도" },
					{"PTY" , "강수형태" },
					{"VEC" , "풍향" },
					{"WSD" , "풍속" }
				};
				
				String url = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?";
				String doc = null;
				String cty; // category
				// T1H(기온 ℃), RN1(1시간 강수량 mm), REH(습도 %), PTY(강수형태), VEC(풍향 deg), WSD(풍속 m/s)
				// 강수형태 수치에 대해서 -> 의미없음(0), 비(1), 비/눈(2), 눈(3), 소나기(4), 빗방울(5), 빗방울/눈날림(6),
				// 눈날림(7)

				Date date = new Date();
				SimpleDateFormat sdformat = new SimpleDateFormat("yyyyMMdd");
				Calendar cal = Calendar.getInstance();
				cal.setTime(date);
				String today = sdformat.format(cal.getTime()); //날짜
				
				cal.add(Calendar.HOUR, -1); //현 시간부터 1시간 전
				SimpleDateFormat sdtime = new SimpleDateFormat("HH" + "00");
				String hour = sdtime.format(cal.getTime());
				
				SimpleDateFormat sddate = new SimpleDateFormat("yyyy-MM-dd"); //날짜 형식 바꾸기
				cal.setTime(date);
				String formatdate  = sddate.format(cal.getTime());
				
				cal.add(Calendar.HOUR, -1);
				SimpleDateFormat sdhour = new SimpleDateFormat("HH시"); //시간 형식 바꾸기
				String formathour = sdhour.format(cal.getTime());
				
				
				
				
				try {
					doc = Jsoup.connect(url).data("pageNo", "1").data("numOfRows", "10").data("dataType", "Json")
							.data("base_date", today).data("base_time", hour).data("nx", "58").data("ny", "74")
							.data("serviceKey",
									"kmc0ZV1P4EDjawY1Lf6lvCWeZXhgexI8O3A59ZNccISKWGOaO4IIUn+TAO8dYHAhjcPOkkGwsioB7rC1UgPOCQ==")
							.timeout(1000 * 40).userAgent("chrome").ignoreContentType(true).execute().body();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JSONParser parser = new JSONParser(); // 문자열 -> JsonObject 형태로 바꿔줌
				try {
					JSONObject jsonObj = (JSONObject) parser.parse(doc);
					System.out.println("파싱성공");
					jsonObj = (JSONObject) jsonObj.get("response");
					jsonObj = (JSONObject) jsonObj.get("body");
					jsonObj = (JSONObject) jsonObj.get("items");
					JSONArray array = (JSONArray) jsonObj.get("item");
					System.out.println("array담기 성공(JsonArray)");
					System.out.println("날짜:" + formatdate + " | " + "예보시간:" + formathour + " | 위치:광주광역시");
					System.out.println("========================================");
					for (int i = 0; i < array.size(); i++) {
						JSONObject tempObj = (JSONObject) array.get(i);
					//	System.out.println("카테고리 obj"+tempObj.get("category"));
						for(int j = 0 ; j< tempCategory.length ; j ++) {
						//	System.out.println("배열"+tempCategory[j][0]);
							if (tempObj.get("category").equals(tempCategory[j][0])) {
								System.out
										.println(tempCategory[j][1] + ": " + tempObj.get("obsrValue"));

	
							}
						}

					}
				} catch (Exception e) {
					// String json이 key와 value를 가진 데이터가 아닌 그냥 일반 문자열이라면 오류가 발생.
					e.printStackTrace();
				}
				
				System.out.println(doc);
	    }
	    
	    public boolean boardAdd(BoardDTO bdto , String member_id) {
	    	String sql = "select b.board_no, b.board_title, b.board_content, m.member_id from mboard b, member m where b.member_id = m.member_id"
	    			+ " and b.member_id = ?";
			try {
				conn = conn();
				ps = conn.prepareStatement(sql);
				ps.setString(1, member_id);
				rs = ps.executeQuery();
				System.out.println("<현재 게시판>");
				while(rs.next()) {
					System.out.print(rs.getInt("b.board_no") + " | " + rs.getString("b.board_title") + " | " + rs.getString("b.board_content") + " | "
							+ rs.getString("m.member_id"));
					
				}
				
				ps = conn.prepareStatement(" INSERT INTO mboard VALUES ("
						+ "(select nvl(max(board_no)+1,1) from mboard), ?, ?, ?)"); 
				System.out.print("제목:");
				String title = sc.nextLine();
				bdto.setBoard_title(title);
				ps.setString(1, bdto.getBoard_title());
				System.out.print("내용:");
				String content = sc.nextLine();
				bdto.setBoard_content(content);
				ps.setString(2, content);
				ps.setString(3, member_id);
				result = ps.executeUpdate();
				if(result!=0) {
					System.out.println("게시글 작성이 완료되었습니다.");
					return true;
				}else{
					System.out.println("게시글 작성에 실패하였습니다.");
					return false;
				}
				
			} catch (SQLException e) {
				System.out.println("JswSqlplus Exception : " + e.getMessage());
			} finally {
				// conn , ps , rs 세가지 객체 전부 null로 비워줘야함.(DB Close)
				dbClose();
			}
			return false;
	    }
}