package phone1;

public class DmbDTO extends PhoneDTO {
	String channel;
	public DmbDTO(String color, String model, String state, String channel) {
		super(color, model, state);
		this.channel=channel;
		// TODO Auto-generated constructor stub
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
}
