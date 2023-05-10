package pack04_sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;



public class SendSMS {
	public static void main(String[] args) {
		  //Git-hub 샘플 : https://github.com/coolsms/coolsms-java-examples/
		  //샘플이 interface와 여러 class로 분리를 해놔서 현재 보기가 힘듦
		
		final String APIKEY = "NCSWMKFZ41AOFV9M";
		final String APISECRET = "KTN3MKATAWE0I3B3WW02T7MUIRBBBYCP";
		
		Message sms = new Message(APIKEY, APISECRET);
		HashMap<String, String> params = new HashMap<>();
		params.put("to", "01074754549");
		params.put("from", "01074754549");
		params.put("type", "SMS");
		params.put("text", "문자 자바로 보내기 테스트중");
		params.put("app_version", "JAVA SDK v1.2");
		
		try {
		   JSONObject obj = sms.send(params);
		   System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			e.printStackTrace();
		}
	}
}
