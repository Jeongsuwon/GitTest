package Test_01;

import java.util.Random;
import java.util.Scanner;


//2023 - 04 - 07 
// �ۼ��� : �迵��
// ���� : ���� �ǵ��
// �������� �����ϴ�.
// ����ϼ̽��ϴ�.
public class ������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int random = new Random().nextInt(100)+1;
		int count = 0;

			System.out.println("�׽�Ʈ�� : "+ random);

			while(true) {

				count++;

				System.out.println("1���� 100������ ������ �Է��ϼ��� ��");

				int num=Integer.parseInt(sc.nextLine());

				if(num==random) {

					System.out.println("������ϴ�.!");
					System.out.println("�õ�Ƚ���� : " + count + "�� �Դϴ�.");
					break;

				}else if(num>=random) {
					System.out.println("�� ���� ���� �Է��ϼ���!");

				}else {
					System.out.println("�� ū ���� �Է��ϼ���!");

				}

				

			}
			
			boolean isCheck = true;

			while (true) {

				System.out.println("���������� �Է��ϼ��� : ");

				int kor = Integer.parseInt(sc.nextLine());

				if (kor >= 0 && kor <= 100) {

					while (true) {

						if (isCheck) {

							System.out.println("���������� �Է��ϼ��� : ");

						}

						int mat = Integer.parseInt(sc.nextLine());

						if (mat >= 0 && mat <= 100) {

							isCheck = true;

							while (true) {

								System.out.println("���������� �Է��ϼ��� : ");

								int eng = Integer.parseInt(sc.nextLine());

								if (eng >= 0 && eng <= 100) {

									int sum = kor + mat + eng;

									double avg = (kor + mat + eng) / 3;

									System.out.println("���� : " + sum);

									System.out.println("��� : " + avg);

									break;



								} else {

									isCheck = false;

									System.out.println("����! ���������� ���Է��ϼ���.");

								}

							}

							break;

						} else {

							isCheck = false;

							System.out.println("����! ���������� ���Է��ϼ���.");



						}



					}

					break;

				} else {

					System.out.println("����! ���� ������ ���Է��ϼ���.");



				}



			}
	}
}
