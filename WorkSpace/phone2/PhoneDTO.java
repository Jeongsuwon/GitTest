package phone2;

public class PhoneDTO {
	private String color, model, state;

	public PhoneDTO(String color, String model, String state) {
		super();
		this.color = color;
		this.model = model;
		this.state = state;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
