package test;

import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;

public class TestMain {
public static void main(String[] args) {
	UserDAO dao = new UserDAO();
	Scanner sc = new Scanner(System.in);
	System.out.println("DB연결확인 - "+dao.conn());
	System.out.println("=================================");
	System.out.println("                   팀플 프로젝트");
	System.out.println("         (게시판 만들기)");
	System.out.println("=================================");
//	dao.selectList();
	while(true) {
	System.out.println("[1]게시판  [2]날씨 [0]종료");
	int function = dao.intInput();
	if(function==1) {
		System.out.println("[회원이시면 로그인, 아니시면 회원가입을 해주세요.]");
		while(true) {
		System.out.println("[1]로그인  [2]회원가입 [0]이전으로");
		int sign = dao.intInput();
		if(sign==1) {
			if(dao.signIn()==true) {
				if(dao.id.equals("admin")) {
					System.out.println(dao.id+"(관리자)님 로그인되었습니다.");
				while(true) {
				System.out.println("[1]회원조회 [2]회원탈퇴 [3]게시글 작성 [4]게시글 삭제 [5]로그아웃");
				int admin = dao.intInput();
				if(admin==1) {
					dao.selectList();
				}else if(admin==5) {
					System.out.println(dao.id + "(관리자)님 로그아웃됩니다.");
					break;
				}
				}
				}else{
					System.out.println(dao.id +"님 로그인되었습니다.");
					while(true) {
					System.out.println("[1]회원수정 [2]회원탈퇴 [3]게시글 작성 [4]게시글 삭제 [5]로그아웃");
					int user = dao.intInput();
					if(user==1) {
						
					}
					else if(user==2) {
							dao.delete();							
					}else if(user==3) {
						
					}else if(user==4) {
						
					}else if(user==5) {
						System.out.println(dao.id + "님 로그아웃됩니다.");
						break;
					}
				}
				}
			}else if(dao.signIn()==false) {
				
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
//		String url = "https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?";
//		String doc = null;
//		try {
//			doc=Jsoup.connect(url).data("pageNo","1").data("numOfRows","1000").data("dataType","Json").data("base_date","20230514")
//					.data("base_time","0600").data("nx","59").data("ny","75")
//					.data("serviceKey","kmc0ZV1P4EDjawY1Lf6lvCWeZXhgexI8O3A59ZNccISKWGOaO4IIUn+TAO8dYHAhjcPOkkGwsioB7rC1UgPOCQ==")
//					.timeout(1000*10)
//					.userAgent("chrome")
//					.ignoreContentType(true)
//					.execute().body();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		JSONParser parser = new JSONParser(); //문자열 -> JsonObject 형태로 바꿔줌
//		try {
//			JSONObject jsonObj = (JSONObject) parser.parse(doc);
//			System.out.println("파싱성공");
//			JSONArray array = (JSONArray) jsonObj.get("item");
//			System.out.println("array담기 성공(JsonArray)");
//			for(int i=0; i<array.size(); i++) {
//				JSONObject tempObj = (JSONObject) array.get(i);
//				System.out.println("날짜:"+ tempObj.get("baseDate"));
//			}
//		} catch (ParseException e) {
//			//String json이 key와 value를 가진 데이터가 아닌 그냥 일반 문자열이라면 오류가 발생.
//			e.printStackTrace();
//		}
			
//		System.out.println(doc);
		
		String[] v = new String[5];
		String s = Weather1.get(59, 75, v); // 광주광역시 북구 일곡동
		
		if (s == null)
		{ // ok!
			System.out.println("날짜 : " + v[0]);
			System.out.println("시간 : " + v[1]);
			System.out.println("날씨 : " + v[2]);
			System.out.println("기온 : " + v[3] + "℃");
			System.out.println("습도 : " + v[4] + "%");
		}
		else
		{ // error
			System.out.println("Error : " + s);
		}

	}else if(function==0) {
		System.out.println("종료합니다.");
		break;		
	}else {
		System.out.println("잘못된 선택입니다.");
	}
	}
}


}
