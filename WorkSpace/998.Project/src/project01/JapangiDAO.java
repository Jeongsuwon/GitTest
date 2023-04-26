package project01;

import java.util.Scanner;

public class JapangiDAO {
	
	boolean input = true;
	int money = 0; //소지금
	int choice; // 음료 선택
	int num; // 음료 개수
	int adLogin; // 관리자 로그인
	int adChoice; // 관리자 옵션 선택
	int c1000, c500, c100, c50, c10;
	int index;
	String remove;
	String update;
	String updateDrink;
	Scanner sc = new Scanner(System.in);
	
	
	//금액 입력받기
	public void moneyScanner() {
	System.out.println("소지금을 입력해주세요");
	while(true) {
		if(input) {
		try{
			money = Integer.parseInt(sc.nextLine());
			if(money%10==0 || money%50==0 || money%100==0 || money%500==0 || money%1000==0) {
				input=false;
				System.out.println("현재 소지금은 " + money +"원 입니다.");
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
//			for(int i=0; i<jpArr.length; i++) {
//				System.out.println(jpArr[i].getNum()+".  "+jpArr[i].getDrink()+"   "+jpArr[i].getPrice()+"원  "+jpArr[i].getCount()+"개");
//			}  ->배열 크기때문에 nullexception 일어남!
			System.out.println("＊구매를 종료하시려면 0번＊");
			System.out.println("주문하실 음료 번호를 선택해주세요");
			choice = Integer.parseInt(sc.nextLine());
				if(choice==1 && jpArr[0].getCount() ==0) {
					System.out.println("콜라 재고가 부족합니다. 다른 음료수를 골라주세요.");
				}else if(choice==1 && money>=jpArr[0].getPrice()) {
					System.out.println("몇 개 구매하시겠습니까?");
					num=Integer.parseInt(sc.nextLine());
					if(money>=jpArr[0].getPrice()*num) {
						money -= jpArr[0].getPrice()*num;
						System.out.println("콜라를 " + num + "개 구매하셨습니다.");
						System.out.println("잔액은 " + money + "입니다."); 
						jpArr[0].setCount(num);
					}else {
						System.out.println("소지금이 부족합니다.");
					}
				}else if(choice==2 && jpArr[1].getCount() ==0) {
					System.out.println("사이다 재고가 부족합니다. 다른 음료수를 골라주세요.");	
					
				}else if(choice==2 && money>=jpArr[1].getPrice()) {
					System.out.println("몇 개 구매하시겠습니까?");
					num=Integer.parseInt(sc.nextLine());
					if(money>=jpArr[1].getPrice()*num) {
						money -= jpArr[1].getPrice()*num;
						System.out.println("사이다를 " + num + "개 구매하셨습니다.");
						System.out.println("잔액은 " + money + "입니다."); 
						jpArr[1].setCount(num);
					}else {
						System.out.println("소지금이 부족합니다.");
					}
				}else if(choice==3 && jpArr[2].getCount() ==0) {
					System.out.println("환타 재고가 부족합니다. 다른 음료수를 골라주세요.");
				}else if(choice==3 && money>=jpArr[2].getPrice()) {
					System.out.println("몇 개 구매하시겠습니까?");
					num=Integer.parseInt(sc.nextLine());
					if(money>=jpArr[2].getPrice()*num) {
						money -= jpArr[2].getPrice()*num;
						System.out.println("환타를 " + num + "개 구매하셨습니다.");
						System.out.println("잔액은 " + money + "입니다."); 
						jpArr[2].setCount(num);
					}else {
						System.out.println("소지금 부족합니다.");
					}
				}else if(choice>3){
					System.out.println("번호를 잘못입력했습니다. 다시 입력해주세요.");
				}else {
					System.out.println("----안녕히가세요.----");
					// 정해진 단위로 잔돈 반환해야함
					c1000=money/1000;
					c500=money%1000/500;
					c100=money%1000%500/100;
					c50=money%1000%500%100/50;
					c10=money%1000%500%100%50/10;
					if(money>=1000) {
						System.out.println("잔돈을 반환합니다 -> ");
						System.out.println("1000원: " + c1000 +"개 /" + "500원: " + c500 + "개 /" 
											+ "100원: " + c100 +"개 /" + "50원: " + c50 + "개 /" + "10원: "+c10+"개" );
					}else if(money>=500) {
						System.out.println("잔돈을 반환합니다 -> ");
						System.out.println("500원: " + c500 + "개 /" + "100원: " + c100 +"개 /" 
											+ "50원: " + c50 + "개 /" + "10원: "+c10+"개" );	
								
					}else if(money>=100) {
						System.out.println("잔돈을 반환합니다 -> ");
						System.out.println("100원: " + c100 +"개 /" + "50원: " + c50 + "개 /" + "10원: "+c10+"개" );
					}else if(money>=50) {
						System.out.println("잔돈을 반환합니다 -> "); 
						System.out.println("50원: " + c50 + "개 /" + "10원: "+c10+"개" );
						}else {
						System.out.println("잔돈을 반환합니다 -> ");
						System.out.println("10원: "+c10+"개" );
					}
					break;
				}
				
		}
	}
	
	public void admin(JapangiDTO[] jpArr) {
		System.out.println("관리자 계정에 로그인하시겠습니까?");
		System.out.println("1. yes / 2. no(유저모드로 전환)");
		adLogin=Integer.parseInt(sc.nextLine());
		if(adLogin==1) {
			while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디: ");
			String adminId = sc.nextLine();
			System.out.print("비밀번호: ");
			String adminPw = sc.nextLine();
			if(adminId.equals("master")&&adminPw.equals("admin")) {
				while(true) {
					System.out.println("0번 어떤 기능이든 음료의 전체 목록을 보여준다.");
					System.out.println("1번 음료 추가 - 음료의 목록에 새로운 음료를 추가한다.");
					System.out.println("2번 음료 수정 - 음료의 목록에 있는 정보를 수정한다.");
					System.out.println("3번 음료 삭제 - 음료의 목록에 있는 정보를 삭제한다.");
					System.out.println("4번 관리자 모드 종료!");
					adChoice = Integer.parseInt(sc.nextLine());
					if(adChoice==0) {
						index=jpArr.length;
						for(int i=0; i<index; i++) {
							System.out.println(jpArr[i].getNum()+".  "+jpArr[i].getDrink()+"   "+jpArr[i].getPrice()+"원  "+jpArr[i].getCount()+"개");
						}	
						
					}else if(adChoice==1) {
						System.out.println("음료의 이름 입력: ");
						String name = sc.nextLine();
						System.out.println("음료의 가격 입력: ");
						int price = Integer.parseInt(sc.nextLine());
						System.out.println("음료의 수량 입력: ");
						int cnt = Integer.parseInt(sc.nextLine());
						
						JapangiDTO[] tempArrs = new JapangiDTO[jpArr.length+1];
						
						for(int i=0; i<jpArr.length; i++) {							
							tempArrs[i]=jpArr[i];
//							tempArrs[tempArrs.length-1]=jpArr[]
							System.out.println(jpArr[i].getNum()+".  "+jpArr[i].getDrink()+"   "+jpArr[i].getPrice()+"원  "+jpArr[i].getCount()+"개");
							
						}
					}else if(adChoice==2) {
						index=jpArr.length;
							System.out.println("변경하실 음료명이 무엇인가요?");
							update=sc.nextLine();
							for(int i=0; i<index; i++) {
							if(update.equals(jpArr[i].getDrink())) {
								update=jpArr[i].getDrink();
								System.out.println("변경 후의 음료명 :");
								updateDrink=sc.nextLine();
									 break;  
							}	
						}
							for(int i=0; i<index; i++) {
								System.out.println(jpArr[i].getNum()+".  "+jpArr[i].getDrink()+"   "+jpArr[i].getPrice()+"원  "+jpArr[i].getCount()+"개");
							}
					}else if(adChoice==3) {
						index=jpArr.length;
						System.out.println("어떤 음료를 삭제하시겠습니까?");
						remove=sc.nextLine();
						for(int i=0; i<index; i++) {
							if(remove.equals(jpArr[i].getDrink())) {
								System.out.println(remove + "를 삭제합니다.");
								for(int j=i; j<index; j++) {	
								 index--; 
								}		
							}	
						}
						for(int i=0; i<index; i++) {
							System.out.println(jpArr[i].getNum()+".  "+jpArr[i].getDrink()+"   "+jpArr[i].getPrice()+"원  "+jpArr[i].getCount()+"개");
						}
					}else if(adChoice==4) {
						System.out.println("유저모드로 전환됩니다..");
						System.out.println("(유저모드)");
					}
					break;
				}
			}else  {
				System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
				
			}
			
			}
		
		}else if(adLogin==2) {
			System.out.println("유저모드↓");
		}
	}
		
	
	}
	
	


