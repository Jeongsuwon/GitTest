package pack01_nasted;

public class A {
	int aField = 10; //인스턴스 멤버
	
	public A() {
		
	}
	//*내가 알고있는 모든 것들은 필드(멤버)가 될 수 있다.*
	// B가 가지고 있는 변수 bField와 methodB를 main에서 사용해보기
	public class B{
		public B(){System.out.println("B객체 생성됨");}
		int bField;
		void methodB() {
			System.out.println("메소드");
		}
	}
	
	
	static class C{
		static int fieldc;
		C(){System.out.println("C객체가 생성됨");}
		int fieldC;
		void methodC() {
			System.out.println("C메소드");
			
		}
		}
	//A의 멤버
	public void methodD() {
		//A의 멤버일까? 아닐까?
		class D{
			D(){System.out.println("D가 생성됨");}
			int fieldD;
			void methodD() {
				System.out.println("메소드 D");
			}
		}
		D d = new D();
		System.out.println(d.fieldD);
		d.methodD();
	}
	int methodA() {
		int data=10;
		return data;
	}
	
	public static class AA{ //static이라 인스턴스 x
							//하지만 안에 메소드가 인스턴스라 인스턴스화 필요?
		public static class AAB{//static이라 인스턴스 x
			void methodAAB() {
				System.out.println("AAB!");
				}
			//static이 아니므로 인스턴스화 과정 필요, return x
	}
	public class BB{ //인스턴스화 과정 필요
		void methodAAB() {
			System.out.println("BB!");}
		public class CC{
			void methodAAB() {System.out.println("CC");}
			public class DD{
				int a = 10;
			}
		
	}
	
}
}
}