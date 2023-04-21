package Test_01;

public class JapangiDTO {

	
	//num(번호) , drink(음료), price(가격), count(수량)	
	private int num;
	private String drink;
	private int price, count;
	
	//기본 생성자
	public JapangiDTO() {
	}

	//생성자 초기화
	public JapangiDTO(int num, String drink, int price, int count) {
		this.num = num;
		this.drink = drink;
		this.price = price;
		this.count = count;
	}
	
	//getter & setter 메소드

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count -= count;
	
	
	}
}
