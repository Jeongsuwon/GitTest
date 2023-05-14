package test;

public class UserDTO {
	private String member_id, member_pw, member_name, member_call;
	private int member_age;
	public UserDTO(String member_id, String member_pw, String member_name, String member_call, int member_age) {
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_name = member_name;
		this.member_call = member_call;
		this.member_age = member_age;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_call() {
		return member_call;
	}
	public void setMember_call(String member_call) {
		this.member_call = member_call;
	}
	public int getMember_age() {
		return member_age;
	}
	public void setMember_age(int member_age) {
		this.member_age = member_age;
	}
}