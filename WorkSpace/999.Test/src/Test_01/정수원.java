package Test_01;

import java.util.Random;
import java.util.Scanner;


//2023 - 04 - 07 
// 작성자 : 김영문
// 내용 : 과제 피드백
// 지적사항 없습니다.
// 고생하셨습니다.
public class 정수원 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int random = new Random().nextInt(100)+1;
		int count = 0;

			System.out.println("테스트용 : "+ random);

			while(true) {

				count++;

				System.out.println("1부터 100사이의 정수를 입력하세요 ▶");

				int num=Integer.parseInt(sc.nextLine());

				if(num==random) {

					System.out.println("맞췄습니다.!");
					System.out.println("시도횟수는 : " + count + "번 입니다.");
					break;

				}else if(num>=random) {
					System.out.println("더 작은 수를 입력하세요!");

				}else {
					System.out.println("더 큰 수를 입력하세요!");

				}

				

			}
			
			boolean isCheck = true;

			while (true) {

				System.out.println("국어점수를 입력하세요 : ");

				int kor = Integer.parseInt(sc.nextLine());

				if (kor >= 0 && kor <= 100) {

					while (true) {

						if (isCheck) {

							System.out.println("수학점수를 입력하세요 : ");

						}

						int mat = Integer.parseInt(sc.nextLine());

						if (mat >= 0 && mat <= 100) {

							isCheck = true;

							while (true) {

								System.out.println("영어점수를 입력하세요 : ");

								int eng = Integer.parseInt(sc.nextLine());

								if (eng >= 0 && eng <= 100) {

									int sum = kor + mat + eng;

									double avg = (kor + mat + eng) / 3;

									System.out.println("총점 : " + sum);

									System.out.println("평균 : " + avg);

									break;



								} else {

									isCheck = false;

									System.out.println("오류! 영어점수를 재입력하세요.");

								}

							}

							break;

						} else {

							isCheck = false;

							System.out.println("오류! 수학점수를 재입력하세요.");



						}



					}

					break;

				} else {

					System.out.println("오류! 국어 점수를 재입력하세요.");



				}



			}
	}
}
