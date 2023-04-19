package pack01_class;
// DAO는 기능을 다루는 클래스
public class StudentDAO {
	
	void display(StudentDTO dto) {
		System.out.println("이름은 " + dto.getName() + "이고 나이는 " + dto.getAge() + " 성별은 " + dto.getSx() + "입니다.");
	}
}
