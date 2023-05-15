package last_test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;

public class TestMain {
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		UserDTO dto = new UserDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("DB연결확인 - "+dao.conn());
		System.out.println("=================================");
		System.out.println("           팀플 프로젝트");
		System.out.println("         (게시판 만들기)");
		System.out.println("=================================");
//		dao.selectList();
		while(true) {
		System.out.println("[1]게시판  [2]날씨 [0]종료");
		int function = dao.intInput();
		if(function==1) {
			System.out.println("[회원이시면 로그인, 아니시면 회원가입을 해주세요.]");
			while(true) {
			System.out.println("[1]로그인  [2]회원가입 [0]이전으로");
			int sign = dao.intInput();
			if(sign==1) {
				if(dao.signIn(dto)==true) {
					if(dto.getMember_id().equals("admin")) {
						System.out.println(dto.getMember_id()+"(관리자)님 로그인되었습니다.");
					while(true) {
					System.out.println("[1]회원조회 [2]회원탈퇴 [3]게시글 작성 [4]게시글 삭제 [5]로그아웃");
					int admin = dao.intInput();
					if(admin==1) {
						dao.selectList();
					}else if(admin==5) {
						System.out.println(dto.getMember_id() + "(관리자)님 로그아웃됩니다.");
						break;
					}
					}
					}else{
						System.out.println(dto.getMember_id() +"님 로그인되었습니다.");
						while(true) {
						System.out.println("[1]회원수정 [2]회원탈퇴 [3]게시글 작성 [4]게시글 삭제 [5]로그아웃");
						int user = dao.intInput();
						if(user==1) {
							dao.update(dto);
						}
						else if(user==2) {
								dao.delete(dto);
								System.out.println(dto.getMember_id());
								if(!dto.getMember_id().equals(null)) {
									continue;
								}else {
									break;
								}
						}else if(user==3) {
							
						}else if(user==4) {
							
						}else if(user==5) {
							System.out.println(dto.getMember_id() + "님 로그아웃됩니다.");
							break;
						}
					}
						
					}
				}
				
			}else if(sign==2) {
				dao.signUp();
			}else if(sign==0) {
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			
			}
		}else if(function==2) {
			String url = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?";
			String doc = null;
			String cty; //category
			Calendar cal = Calendar.getInstance(); 
			cal.setTime(new Date());
			
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1; //0부터 시작하기 때문에 1더해준다
			int day = cal.get(Calendar.DAY_OF_MONTH);
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			int min = cal.get(Calendar.MINUTE);
			int sec = cal.get(Calendar.SECOND);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd");
			String dateYMD = String.format("%t", "" + year + month + day ) ;//String.Format( "{d2:00} 
			String dateHour = "" + hour + "00" ;
			System.out.println(dateYMD);
			System.out.println(dateHour);
			try {
				doc=Jsoup.connect(url).data("pageNo","1").data("numOfRows","1").data("dataType","Json").data("base_date",dateYMD)
						.data("base_time",dateHour).data("nx","126").data("ny","35")
						.data("serviceKey","kmc0ZV1P4EDjawY1Lf6lvCWeZXhgexI8O3A59ZNccISKWGOaO4IIUn+TAO8dYHAhjcPOkkGwsioB7rC1UgPOCQ==")
						.timeout(1000*40)
						.userAgent("chrome")
						.ignoreContentType(true)
						.execute().body();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JSONParser parser = new JSONParser(); //문자열 -> JsonObject 형태로 바꿔줌
			try {
				JSONObject jsonObj = (JSONObject) parser.parse(doc);
				System.out.println("파싱성공");
				jsonObj =  (JSONObject)jsonObj.get("response");
				jsonObj =  (JSONObject)jsonObj.get("body");
				jsonObj =  (JSONObject)jsonObj.get("items");
				JSONArray array = (JSONArray) jsonObj.get("item");
				System.out.println("array담기 성공(JsonArray)");
				for(int i=0; i<array.size(); i++) {
					JSONObject tempObj = (JSONObject) array.get(i);
					System.out.println("날짜:"+ tempObj.get("baseDate") + " | "+ "예보시간:" +  tempObj.get("baseTime") 
										+" | " +"위도:" +tempObj.get("nx") + " | " + "경도:" +tempObj.get("ny"));
					
					//+"날씨: " +tempObj.get(category)
				}
			} catch (Exception e) {
				//String json이 key와 value를 가진 데이터가 아닌 그냥 일반 문자열이라면 오류가 발생.
				e.printStackTrace();
			}
				
			System.out.println(doc);
			
//			String[] v = new String[5];
//			String s = Weather.get(59, 75, v); // 광주광역시 북구 일곡동
//			
//			if (s == null)
//			{ // ok!
//				System.out.println("날짜 : " + v[0]);
//				System.out.println("시간 : " + v[1]);
//				System.out.println("날씨 : " + v[2]);
//				System.out.println("기온 : " + v[3] + "℃");
//				System.out.println("습도 : " + v[4] + "%");
//			}
//			else
//			{ // error
//				System.out.println("Error : " + s);
//			}

		}else if(function==0) {
			System.out.println("종료합니다.");
			break;		
		}else {
			System.out.println("잘못된 선택입니다.");
		}
		}
}
}
