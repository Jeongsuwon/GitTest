package test01_Variable;

public class Test {

	public static void main(String[] args) {
		
		//정수형 변수
		int a;
		a = 14;
		int b = 2;
		 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		byte b1; // -128~127까지의 정수
		b1 = 120;
		byte b2 = 127;
		System.out.println(b1);
		System.out.println(b2);
		
		long l1;
		l1 = 202020202L;
		long l2 = 20202020L;
		System.out.println(l1);
		System.out.println(l2);
		
		//실수형 변수
		float f1; 
		f1=3.14f;
		float f2 =3.1f;
		System.out.println(f1);
		System.out.println(f2);
		
		double d1;
		d1=3.1;
		double d2 = 3.4;
		System.out.println(d1);
		System.out.println(d2);
		
		/*int iNum;
		System.out.println(iNum);
		왜 오류일까? : iNum 변수만 선언되고 값이 초기화 되어 있지 않아서.*/
	}

}
