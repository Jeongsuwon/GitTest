package pack08_casting;

public class Ex02_Casting {

	public static void main(String[] args) {
		
		//���ڿ� = "12" + 34 = 1234
		//String + int = String
		//why? ���ڿ� + ��� = ���ڿ� ��Ģ!
		//���ڿ� ������ ��Ģ ��
		
		String sum = "12"+34;
		System.out.println(sum);
		
		
		//� ���� String���� �ٲٴ� ���� ��û���� �����ϴ�.
		
		String sum1 = 1234+"";
		System.out.println(sum1);
		
		
		
		//String sum, sum2 ������ ���ڿ��� ���ڸ� �����ص�.
		//�� ���� ���� �˰��ʹ�. "1234" + "1234" = 12341234
		//String => int?
		//int, double ���� ��������� �۾� �ٲ�� �� =>�⺻Ÿ��
		//�빮�ڷ� �����ϴ� ���� ��κ� ClassŸ��
		//�⺻ ������ Ÿ���� Wrapper class��� ���� ������ �ִ�.
		//int => Integer , double Double
		//String�� �ش��ϴ� Ÿ������ �ٲ��ִ� ������ �ϴ� ��
		//String�� �ִ� ""�� �����Ѵ�.
		int num = Integer.parseInt(sum)+1234;
		System.out.println(num);
		
		int num2 = Integer.parseInt(sum1);
		System.out.println(num2);
		
		String sAvg = "88.6";
		double dAvg = Double.parseDouble(sAvg)+10;

		System.out.println(dAvg);
		
		//WrapperClass.parseDataType(String);=> DataType
		
		String str = "������";
		//�ش� �����͸� ���ڷ� �ٲ� �� ������?
		int str1=Integer.parseInt(str);
		//�ܼ� â�� Ȯ���ϱ�( ������ �� == ����)
		
		
		System.out.println(str1);
		

		
	}

}