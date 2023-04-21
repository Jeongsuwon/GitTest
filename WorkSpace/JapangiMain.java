package Test_01;

public class JapangiMain {

	public static void main(String[] args) {
		JapangiDTO[] jpArr = new JapangiDTO[4];
		JapangiDAO dao = new JapangiDAO();
		
		jpArr[0]= new JapangiDTO(1, "콜라", 800, 8);
		jpArr[1]= new JapangiDTO(2, "사이다", 1000, 5);
		jpArr[2]= new JapangiDTO(3, "환타", 900, 1);
		
		dao.admin(jpArr);
		dao.moneyScanner();
		dao.drink(jpArr);

	}

}
