package pack03_constructor;

public class Member {
	String name, id, pw;
	int age;

	
	
	public static void main(String[] args) {
		Member member = new Member();
		member.name = "정수원";
		member.id = "jsw123";
		member.pw = "123";
		member.age = 93;
		System.out.println(member.name);
		System.out.println(member.id);
		System.out.println(member.pw);
		System.out.println(member.age);
		
		MemberDTO dto = new MemberDTO("정수원", "jsw123", "123", 93);
		System.out.println(dto.name);
		System.out.println(dto.id);
		System.out.println(dto.pw);
		System.out.println(dto.age);
	}

}
