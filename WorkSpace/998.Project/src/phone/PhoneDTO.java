package phone;

public class PhoneDTO {
	String color, model;
	boolean power;
	
	public PhoneDTO(String color, String model, boolean power) {
		this.color = color;
		this.model = model;
		this.power = power;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
}
