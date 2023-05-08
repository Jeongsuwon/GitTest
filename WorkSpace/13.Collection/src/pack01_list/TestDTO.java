package pack01_list;

public class TestDTO {
	//DB에서 조회해온 것 받아서 묶어 저장하기 위한 객체
	//hr(employees) : first_name, last_name, salary ....
	private String firstName, lastName;
	//private를 외부에서 변수에 바로 접근을 막았을 때 만들어줘야하는 것 -> getter, setter
	
	public TestDTO(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
