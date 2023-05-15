package test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;

import oracle.sql.DATE;

public class TestMain {
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		UserDTO dto = new UserDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("DB연결확인 - " + dao.conn());
		System.out.println("=================================");
		System.out.println("           팀플 프로젝트");
		System.out.println("         (게시판 만들기)");
		System.out.println("=================================");
//		dao.selectList();
		while (true) {
			System.out.println("[1]게시판  [2]날씨 [0]종료");
			int function = dao.intInput();
			if (function == 1) {
				System.out.println("[회원이시면 로그인, 아니시면 회원가입을 해주세요.]");
				while (true) {
					System.out.println("[1]로그인  [2]회원가입 [0]이전으로");
					int sign = dao.intInput();
					if (sign == 1) {
						if (dao.signIn(dto) == true) {
							if (dto.getMember_id().equals("admin")) {
								System.out.println(dto.getMember_id() + "(관리자)님 로그인되었습니다.");
								while (true) {
									System.out.println("[1]회원조회 [2]회원탈퇴 [3]게시글 작성 [4]게시글 삭제 [5]로그아웃");
									int admin = dao.intInput();
									if (admin == 1) {
										dao.selectList();
									} else if (admin == 5) {
										System.out.println(dto.getMember_id() + "(관리자)님 로그아웃됩니다.");
										break;
									}
								}
							} else {
								System.out.println(dto.getMember_id() + "님 로그인되었습니다.");
								while (true) {
									System.out.println("[1]회원수정 [2]회원탈퇴 [3]게시글 작성 [4]게시글 삭제 [5]로그아웃");
									int user = dao.intInput();
									if (user == 1) {
										dao.update(dto);
									} else if (user == 2) {
										dao.delete(dto);
										System.out.println(dto.getMember_id());
										if (!dto.getMember_id().equals(null)) {
											continue;
										} else {
											break;
										} // 질문사항 1
									} else if (user == 3) {

									} else if (user == 4) {

									} else if (user == 5) {
										System.out.println(dto.getMember_id() + "님 로그아웃됩니다.");
										break;
									}
								}

							}
						}

					} else if (sign == 2) {
						dao.signUp();
					} else if (sign == 0) {
						break;
					} else {
						System.out.println("잘못된 입력입니다.");
					}

				}
			} else if (function == 2) {
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



			} else if (function == 0) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}
	}
}