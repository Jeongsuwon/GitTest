package pack05_email;

import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void main(String[] args) {
		SendEmail send = new SendEmail();
//		send.sendSimple();
//		send.sendMulti();
		send.sendHtml();
	}
	
	//1. 단순하게 텍스트만 있는 이메일 : SimpleEmail
	//2. 첨부파일이나 url등으로 이미지가 있는 이메일 : MultiPartEmail
	//3. 모든 기능을 가지고 html 태그까지 사용가능한 이메일 : HtmlEmail
	public void sendSimple() {
		SimpleEmail mail = new SimpleEmail();
		//smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8"); //한글깨짐방지
		mail.setDebug(true); //오류를 찾아서 개발을 하고있는 과정인지.
		
		mail.setAuthentication("id", "pw");
		mail.setSSLOnConnect(true);
		//====================고정 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할 수 있는 고객인증
		
		try {
			mail.setFrom("id@naver.com", "한울JSW");
			mail.addTo("id@naver.com", "한울JSWTO"); //여러 개 하면 여러 명한테 전송
			mail.setSubject("회원가입 축하 메시지");
			mail.setMsg("내용입니다~");
			
			//↑mail객체가 모든 정보를 갖고 전송할 준비를 마침.
			
			mail.send();
			
			
			
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Email오류 아닌거"+e.getMessage());
		}
		
	}
	
	public void sendMulti() {
	   MultiPartEmail mail = new MultiPartEmail();
		//smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8"); //한글깨짐방지
		mail.setDebug(true); //오류를 찾아서 개발을 하고있는 과정인지.
		
		mail.setAuthentication("id", "pw");
		mail.setSSLOnConnect(true);
		//====================고정 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할 수 있는 고객인증
		
		
		
		try {
			mail.setFrom("id@naver.com", "한울JSW");
			mail.addTo("id@naver.com", "한울JSWTO"); //여러 개 하면 여러 명한테 전송
			mail.setSubject("회원가입 축하 메시지");
			mail.setMsg("내용입니다~");

			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_Java\\dog.jpg"); //이미지 파일 경로를 넣어줌.(경로를 찾을 수 없습니다. 나오면 주석처리)
			mail.attach(file);
			
			//↑mail객체가 모든 정보를 갖고 전송할 준비를 마침.
			
			file = new EmailAttachment();
			file.setURL(new URL("https://search.naver.com/search.naver?where=image&sm=tab_jum&query=%EA%B0%95%EC%95%84%EC%A7%80"));
			mail.attach(file);
			
			
			mail.send();
			
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Email오류 아닌거"+e.getMessage());
		}
	}
	
	public void sendHtml() {
		HtmlEmail mail = new HtmlEmail();
		//smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8"); //한글깨짐방지
		mail.setDebug(true); //오류를 찾아서 개발을 하고있는 과정인지.
		
		mail.setAuthentication("id", "pw");
		mail.setSSLOnConnect(true);
		//====================고정 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할 수 있는 고객인증
		
		try {
			mail.setFrom("id@damain", "한울JSW");
			mail.addTo("id@damain", "한울JSWTO"); //여러 개 하면 여러 명한테 전송
			mail.setSubject("회원가입 축하 메시지");
			mail.setMsg("내용입니다~");
			
			
			//메일의 내용이 일반 글자가 아니라 html형태로 보낼꺼이기 때문에 바꿈.
			StringBuffer msg = new StringBuffer();
			msg.append("<html>");//
			msg.append("<body>");
			//html String으로 만들기 경연대회
			msg.append("<h3><strong>경연대회</strong></h3>");
			msg.append("<img src=D:\\Study_Java\\pet.jpg");
			msg.append("<ul>");
			msg.append("<li>너무 어렵다...</li>");
			msg.append("<li>외우고 있는 것 같다...</li>");
			msg.append("<li>더 열심히 복습해야겠다...</li>");
			msg.append("</ul>");
			msg.append("</body>");
			msg.append("</html>");//
			
			mail.setHtmlMsg(msg.toString());
			
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_Java\\dog.jpg"); //이미지 파일 경로를 넣어줌.(경로를 찾을 수 없습니다. 나오면 주석처리)
			mail.attach(file);
			
			//↑mail객체가 모든 정보를 갖고 전송할 준비를 마침.
			
			file = new EmailAttachment();
			file.setURL(new URL("https://search.naver.com/search.naver?where=image&sm=tab_jum&query=%EA%B0%95%EC%95%84%EC%A7%80"));
			mail.attach(file);
			
			mail.send();
			
			
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Email오류 아닌거"+e.getMessage());
		}
	}
}
