package pack04_extend;

public class ExamMain {
	public static void main(String[] args) {
		DmbPhone dmbP = new DmbPhone(1, "gray", "LG");
		dmbP.powerOn();
		dmbP.bell();
		dmbP.sendVoice("여보세요?");
		dmbP.receiveVoice("배달입니다.");
		dmbP.hangUp();
		//CellPhone에서 구현해놓은 기능
		dmbP.turnOnDmb();
		dmbP.changeChannel(10);
		dmbP.turnOffDmb();
		dmbP.powerOff();
		
	}
}
