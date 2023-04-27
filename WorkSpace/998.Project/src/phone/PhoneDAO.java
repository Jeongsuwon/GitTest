package phone;

import java.util.Scanner;

public class PhoneDAO {
	PhoneDTO dto = new PhoneDTO("검정", "이니셜-1", false);
	boolean power = true;
	Scanner sc = new Scanner(System.in);
	public void PowerOn() {
		if(power) {
			 System.out.println("전원이 켜졌습니다.");
			 
		}
			
		
	}
	
}
