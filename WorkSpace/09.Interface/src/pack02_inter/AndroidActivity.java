package pack02_inter;

public class AndroidActivity {
	//Activity는 화면이 동작하게 하는 클래스
	public static void main(String[] args) {
		//익명의 메소드
		AndroidOnclick ao = new AndroidOnclick() {
			
			@Override
			public void onClick() {
				System.out.println("익명의 메소드");
			}
		};
		ao.onClick();
	}
	
	void test(AndroidOnclick ao) {
		
	}
}
