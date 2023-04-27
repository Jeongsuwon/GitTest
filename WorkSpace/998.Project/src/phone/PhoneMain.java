package phone;

public class PhoneMain {
	public static void main(String[] args) {
		boolean power = true;
		PhoneDAO dao = new PhoneDAO();
		System.out.println(dao.dto);
		if(power==false){	
			System.out.println("전원이 꺼져있습니다. 전원을 켜주세요");
			dao.PowerOn();
		}
		
		
		
		
	}

}
