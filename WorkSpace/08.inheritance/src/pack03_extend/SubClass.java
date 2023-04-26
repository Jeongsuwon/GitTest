package pack03_extend;

public class SubClass extends SuperClass{
	//Sub클래스에서 부모클래스의 기능을 그대로 사용하는게 아니라 달리하고싶음.
	//오버라이드(Override): 재정의
	//부모 클래스의 메소드 형태는 유지하되, 내용을 바꿔 정의하는 것
	
	@Override// annotation: 주석, 컴퓨터가 해석하는 것
	public int sum(int x, int y) {
		return x + y + 3; //부모 클래스의 기능을 바꾸는 것
		
	}
	
	public int nanugi(int x, int y) {
		return x-y;
		
	}
	public int namuzi(int x, int y) {
		return x%y;
		
	}
	
}
