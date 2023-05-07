package phone1;

public class SmartDTO extends DmbDTO {
	String internet;
	public SmartDTO(String color, String model, String state, String channel, String internet) {
		super(color, model, state, channel);
		this.internet=internet;
	}
	public String getInternet() {
		return internet;
	}
	public void setInternet(String internet) {
		this.internet = internet;
	}
}
