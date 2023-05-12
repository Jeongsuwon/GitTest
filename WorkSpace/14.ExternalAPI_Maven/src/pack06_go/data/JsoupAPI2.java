package pack06_go.data;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;

public class JsoupAPI2 {
	public static void main(String[] args) {
		//https://apis.data.go.kr/6290000/tourdestbaseinfo/gettourdestbaseinfo?serviceKey=kmc0ZV1P4EDjawY1Lf6lvCWeZXhgexI8O3A59ZNccISKWGOaO4IIUn%2BTAO8dYHAhjcPOkkGwsioB7rC1UgPOCQ%3D%3D&numOfRows=2&pageNo=2&type=Json
		//Jsoup API를 사용하기 : http형태로 되어있는 데이터를 json 또는 xml등의 형태로 String을 가져옴
		//String을 JsonParser, JsonObject를 이용하여 우리가 활용가능한 변수 타입으로 각각을 빼오는 작업을 한다.
		//http의 요청은 인터넷 주소인 URL을 알아야함. URL기준으로 ? 뒤에 파라미터를 정확하게 넣어야, 원하는 결과 반환
		//우리가 인터넷 주소에 요청할 때 보내주는 파라미터는 전부 String
		String url = "https://apis.data.go.kr/6290000/tourdestbaseinfo/gettourdestbaseinfo";
		String doc = null;
		try {
			 doc = Jsoup.connect(url).data("numOfRows", "4").data("pageNo", "4").data("type", "Json").data("totalPage", "10")
			.data("serviceKey", "kmc0ZV1P4EDjawY1Lf6lvCWeZXhgexI8O3A59ZNccISKWGOaO4IIUn+TAO8dYHAhjcPOkkGwsioB7rC1UgPOCQ==")
			.timeout(1000*10)
			.userAgent("chrome")
			.ignoreContentType(true)
			.execute().body();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(doc);
		//json: key와 value로 구분되어있는 규칙을 가진 데이터타입(String)이다.
		//중괄호: 하나의 Object(int, String, DTO 등)
		//대괄호: array ↑ 위의 데이터를 여러 건 가진 형태
		
		//JsonParser를 이용해서 String으로 되어있는 Json을 하나씩 빼오는 작업을 할 예정
		JSONParser parser = new JSONParser(); //문자열 -> JsonObject 형태로 바꿔줌
		try {
			JSONObject jsonObj = (JSONObject) parser.parse(doc);
			System.out.println("파싱성공");
			JSONArray array = (JSONArray) jsonObj.get("TourDestBaseInfo");
			System.out.println("array담기 성공(JsonArray)");
			for(int i=0; i<array.size(); i++) {
				JSONObject tempObj = (JSONObject) array.get(i);
				System.out.println("관광지:"+ tempObj.get("tourDestNm") + "/ 주소:" + tempObj.get("addrRoad") + "/ 연락처:" + tempObj.get("mngAgcTel")+"/");
				System.out.println("정보 :" + tempObj.get("tourDestIntro"));
				System.out.println();
			}
		} catch (ParseException e) {
			//String json이 key와 value를 가진 데이터가 아닌 그냥 일반 문자열이라면 오류가 발생.
			e.printStackTrace();
		}
		
		
//		System.out.println(doc);
	}
}
