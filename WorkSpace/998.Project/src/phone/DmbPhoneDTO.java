package phone;

public class DmbPhoneDTO extends PhoneDTO {
	String channel;
	public DmbPhoneDTO(String color, String model, String state, String channel) {
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
