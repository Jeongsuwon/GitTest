package pack02_static;

public class Ex03_String {
	//String Class : 문자열을 조작하기 위한 기능을 담고 있는 클래스
	//java.lang(패키지).String.class(.java)
	//String 역시 Class이기때문에 멤버를 갖고 있다.
	//다른사람이 만든 클래스의 기능(메소드)를 활용해보기.
	//변수는 소괄호x, 메소드는 소괄호o
	
	public static void main(String[] args) {
		String str1 = "apple"; // 인스턴스화 과정 x
		String str2 = new String("APPLE"); //인스턴스화 과정 o
		
		System.out.println(str1);
		System.out.println(str2);
		
		//length()메소드 : 문자열의 길이를 알 수 있음.
		System.out.println("length() : "+ str1.length());
		
		//toUpperCase(), toLowerCase()
		System.out.println("toUpperCase() : " + str1.toUpperCase());
		System.out.println("toUpperCase() : " + str2.toLowerCase());
		
		//subString() : 특정 문자 추출(index)
		//subString메소드를 코드 자동완성 해보고 호출
		//밑에 substring 오버로딩인거 인지해야함
		System.out.println("substring(int) : " + str1.substring(1)); //내가 준 index 0부터 문자열 끝까지 출력
		System.out.println("substring(int)(int) : "+str1.substring(1, 3)); //index 1부터 3의 앞까지 출력
		
		//charAt() : 문자열에서 특정 문자 한 글자만 추출
		System.out.println("charAt() : " + str1.charAt(4));
		System.out.println(str1.substring(4, 5));
		
		//indexOf() : 문자열에서 특정 문자의 존재여부 ▶ 존재 : index 반환, 실패:-1
		System.out.println(str1.indexOf("l"));
		
		//split():문자열의 분리 ▶ split()메소드를 이용해서 split()메소드가 리턴하는 타입의 데이터에 담아보기.
		
		String[] split = str1.split(str2);
		System.out.println(split.length);
		String str3 = "ab cd ef";
		String[] tempArr = str3.split(" ");
		System.out.println(tempArr.length);
		
		//replaceAll(): 문자열 치환
		//pp라는 글자를 찾아서 @@로 바꾸기
		
		System.out.println(str1.replaceAll("p", "@").length()); //return타입
		
		//trim() : 좌우 공백 제거
		String trimStr = "  abc  def   ";
		System.out.println(trimStr.trim().replaceAll(" ", "").length());
		
		String eqStr1 = "A";
		String eqStr2 = new String("A");
		
		if(eqStr1.equals(eqStr2)) {
			System.out.println("같음");
		}else
			System.out.println("다름");
	}
}
