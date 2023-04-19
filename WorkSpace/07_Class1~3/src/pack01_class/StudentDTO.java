package pack01_class;
//DTO는 속성 / 변수 선언하는 클래스
public class StudentDTO {
	private int age;
	private String sx, name;
	public StudentDTO(int age, String sx, String name) {
		this.age = age;
		this.sx = sx;
		this.name = name;
	}
	public StudentDTO() {
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSx() {
		return sx;
	}
	public void setSx(String sx) {
		this.sx = sx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
