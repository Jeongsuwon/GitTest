package pack08_casting;

public class Ex01_Casting {

	public static void main(String[] args) {
		int iNum = 10; //������ ���� a�� �ʱ�ȭ �ϰ� 10�� ��Ƶ�
		double dNum = iNum;//�� ū Ÿ�Կ� ���� Ÿ���� ������ �ڵ� ����ȯ
		
		System.out.println(iNum);
		System.out.println(dNum);
		double dNum2 = 30.5;
//		int iNum2 = dNum2; ū Ÿ�� -> ���� ������ Ÿ�� ����
//      ������ ����ȯ, DownCasting ==> casting�� �Ϲ��� �ǹ�
		int iNum2 = (int)dNum2;
		
		System.out.println(dNum2);
		System.out.println(iNum2);
		// dNum2�� �Ǽ��� �������ε� ������ �����ͷ� ��ȯ�ؼ� �Ҽ����� ��������.
		
		//byte < int
		int iN = 3;
		byte bN = (byte)iN;
		System.out.println(bN);
		
		
		
		
	
		

	}

}