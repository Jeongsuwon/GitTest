package pack01_toy;

import java.util.Scanner;

public class JapangiDAO {
	
	private JapangiDTO[] jpArr;
	boolean input = true;
	int money = 0; //소지금
	int choice; // 음료 선택
	int num; // 음료 개수
	int adChoice;
	Scanner sc = new Scanner(System.in);
	
	
	//금액 입력받기
	public void moneyScanner() {
	System.out.println("금액을 입력해주세요");
	while(true) {
		if(input) {
		try{
			money = Integer.parseInt(sc.nextLine());
			if(money%10==0 || money%50==0 || money%100==0 || money%500==0 || money%1000==0) {
				input=false;
				System.out.println("현재 금액은 " + money +"원 입니다.");
				break;
			}else if(money<0){
				System.out.println("0이상의 값을 입력해주세요.");
			}else {
				System.out.println("10, 50, 100, 500, 1000으로 나누어 떨어지는 수를 입력해주세요");
			}
		}catch(Exception e) {
			System.out.println("숫자외에 값이 입력되었습니다.");
		}
		}
	}
	//문제점 : 최저 값보다 적게 입력했을 시
	}

//기능2,3 음료 뽑기 /자판기 종료 
	public void drink(JapangiDTO[] jpArr) {
		while(true) {
			System.out.println("<<<<음료 자판기>>>>");
			System.out.println("번호|음료|가격|재고");
			System.out.println("================");
			System.out.println(jpArr[0].getNum()+ ". " +jpArr[0].getDrink()+ "  " + jpArr[0].getPrice()+"원  "+jpArr[0].getCount()+"개");
			System.out.println(jpArr[1].getNum()+ ". " +jpArr[1].getDrink()+ "  " + jpArr[1].getPrice()+"원  "+jpArr[1].getCount()+"개");
			System.out.println(jpArr[2].getNum()+ ". " +jpArr[2].getDrink()+ "  " + jpArr[2].getPrice()+"원  "+jpArr[2].getCount()+"개");
			System.out.println("＊구매를 원하지 않으시면 0번＊");
			System.out.println("주문하실 음료 번호를 선택해주세요");
			choice = Integer.parseInt(sc.nextLine());
				if(choice==1 && jpArr[0].getCount() ==0) {
					System.out.println("콜라 재고가 부족합니다. 다른 음료수를 골라주세요.");
				}else if(choice==1 && money>=jpArr[0].getPrice()) {
					System.out.println("몇 개 구매하시겠습니까?");
					num=Integer.parseInt(sc.nextLine());
					if(money>=jpArr[0].getPrice()*num) {
						money -= jpArr[0].getPrice()*num;
						System.out.println("콜라를 " +num+ "개 구매하셨습니다. 잔액은 " + money + "입니다.");
						jpArr[0].setCount(num);
					}else {
						System.out.println("금액이 부족합니다.");
					}
				}else if(choice==2 && jpArr[1].getCount() ==0) {
					System.out.println("사이다 재고가 부족합니다. 다른 음료수를 골라주세요.");	
					
				}else if(choice==2 && money>=jpArr[1].getPrice()) {
					System.out.println("몇 개 구매하시겠습니까?");
					num=Integer.parseInt(sc.nextLine());
					if(money>=jpArr[1].getPrice()*num) {
						money -= jpArr[1].getPrice()*num;
						System.out.println("사이다를 구매하셨습니다. 잔액은 " + money + "입니다.");
						System.out.println(jpArr[1].getCount());
						jpArr[1].setCount(num);
					}else {
						System.out.println("금액이 부족합니다.");
					}
				}else if(choice==3 && jpArr[2].getCount() ==0) {
					System.out.println("환타 재고가 부족합니다. 다른 음료수를 골라주세요.");
				}else if(choice==3 && money>=jpArr[2].getPrice()) {
					System.out.println("몇 개 구매하시겠습니까?");
					num=Integer.parseInt(sc.nextLine());
					if(money>=jpArr[2].getPrice()*num) {
						money -= jpArr[2].getPrice()*num;
						System.out.println("사이다를 구매하셨습니다. 잔액은 " + money + "입니다.");
						System.out.println(jpArr[2].getCount());
						jpArr[2].setCount(num);
					}else {
						System.out.println("금액이 부족합니다.");
					}
				}else if(choice<1 || choice >3){
					System.out.println("번호를 잘못입력했습니다. 다시 입력해주세요.");
				}else {
					System.out.println("안녕히가세요");
					System.out.println("잔액: " + money); // 정해진 단위로 반환해야함
					break;
				}
				
		}
	}
	
	public void admin(JapangiDTO[] jpArr) {
		String adminId = sc.nextLine(); 
		String adminPw = sc.nextLine();
			if(adminId.equals("master")&&adminPw.equals("admin")) {
				while(true) {
					System.out.println("0번 어떤 기능이든 음료의 전체 목록을 보여준다.");
					System.out.println("1번 음료 추가 - 음료의 목록에 새로운 음료를 추가한다.");
					System.out.println("2번 음료 수정 - 음료의 목록에 있는 정보를 수정한다.");
					System.out.println("3번 음료 삭제 - 음료의 목록에 있는 정보를 삭제한다.");
					adChoice = Integer.parseInt(sc.nextLine());
					if(adChoice==0) {
						for(int i=0; i<jpArr[2].getNum(); i++) {
							System.out.println(jpArr[i].getNum()+".  "+jpArr[i].getDrink()+"   "+jpArr[i].getPrice()+"원  "+jpArr[i].getCount()+"개");
						}	
						
					}else if(adChoice==1) {
						jpArr[3] = new JapangiDTO(4, "제로콜라", 700, 2);
					}else if(adChoice==2) {
						jpArr[3] = new JapangiDTO(4, "웰치스", 800, 3);
					}
					
				}
			}
		}
		
}