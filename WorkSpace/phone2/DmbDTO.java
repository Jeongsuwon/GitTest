package phone2;

public class DmbDTO extends PhoneDTO {
	private String channel;
	public DmbDTO(String color, String model, String state, String channel) {
		super(color, model, state);
		this.channel = channel;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
}
