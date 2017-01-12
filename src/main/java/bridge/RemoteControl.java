package bridge;

public abstract class RemoteControl {
	protected Device device;

	public RemoteControl(Device device) {
		super();
		this.device = device;
	}
	
	public void pressButtonFive() {
		device.pressButtonFive();
	}
	
	public void pressButtonSix() {
		device.pressButtonSix();
	}
	
	public void deviceFeedback() {
		device.deviceFeedback();
	}
	
	public abstract void pressButtonNine();
}
