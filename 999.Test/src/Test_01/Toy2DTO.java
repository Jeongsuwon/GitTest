package Test_01;
// price�� int�� / name�� String���� ����
public class Toy2DTO {
	private int price;
	private String name;
	
	
	public Toy2DTO(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Toy2DTO(){
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
