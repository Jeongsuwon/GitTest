public class Test06 {

	public static void main(String[] args) {
		int kor, math, eng, sci, play;
		kor = 50;
		math = 60;
		eng = 70;
		sci = 80;
		play = 90;
		
		System.out.println(kor);
		System.out.println(math);
		System.out.println(eng);
		System.out.println(sci);
		System.out.println(play);
		
		// ����ȯ(casting) : ���� �ٸ� Ÿ���� ������ ��ȯ���� �����.
		// ex) int <-> double , String <-> int
		// int<double
		int iValue = 10;
		double dValue = iValue + 0.5; // �ڵ� ����ȯ
		System.out.println("iValue �� : " + iValue);
		System.out.println("dValue �� : " + dValue);
		
		//�� ū ������ Ÿ���� ���� Ÿ�Կ� ���� �� ���� �߻�
		//�����ڰ� � Ÿ������ �ٲܰ��� ���ø� ���༭ ������ �ٲ�
		iValue = (int)dValue;//���� ����ȯ
		
		System.out.println("iValue �� : " + iValue);
		System.out.println("dValue �� : " + dValue);
		
		String str = "1234"+12; // 123412
		//���ڿ��� � ���� ���ϴ� �� == ��x => ���� (������ ��ħ)
		
		int iData = 1234 + 12; //1246
		
		//������ �������� ���� == �� => ���� ��ħ
		
		System.out.println(str);
		
		//str���� ���� 123412��� ���ڿ��� ����Ǿ�����
		System.out.println(Integer.parseInt(str)+1);
		
		// boolean -> true �Ǵ� false�� ������ ������.
		int a=2, b=3;
		System.out.println(a > b ? 3 : 4);
		
	}

}