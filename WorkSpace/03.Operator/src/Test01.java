
public class Test01 {

	public static void main(String[] args) {
		int iNum = 1;
		long lNum = 292929292L;
		double dNum = 3.14;
		float fNum = 3.14f;
		String str = "한울";
		char chr = 'a';		
		
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(dNum);
		System.out.println(fNum);
		System.out.println(str);
		System.out.println(chr);
		
//		--캐스팅-
		String str1 = "123";
		int str2 = 123;
		System.out.println(Integer.parseInt(str1)+10);
		System.out.println(str2+"");
	}

}
