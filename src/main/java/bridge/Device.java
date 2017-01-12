package bridge;

public abstract class Device {
	protected int currentChannel;
	protected int maxChannel;
	protected int volume = 0;
	
	public abstract void pressButtonFive();
	public abstract void pressButtonSix();
	
	public void pressButtonSeven() {
		volume++;
		System.out.println("Volume: " + volume);
	}
	
	public void pressButtonEight() {
		volume--;
		System.out.println("Volume: " + volume);
	}
	
	public void deviceFeedback() {
		if (currentChannel > maxChannel) {
			currentChannel = maxChannel;
		} else if (currentChannel < 0) {
			currentChannel = 0;
		}
		System.out.println("Channel: " + currentChannel);
	}
	
}
