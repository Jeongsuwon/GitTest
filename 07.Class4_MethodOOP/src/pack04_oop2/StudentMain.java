package pack04_oop2;

public class StudentMain {
	public static void main(String[] args) {
		
		StudentDTO st = new StudentDTO(1,30,40,50,"정수원");
		StudentDAO da = new StudentDAO();
		da.display(st);
		System.out.println("---------");
		da.display(st);
	}
	
	
}
