package bridge;

public class TVDevice extends Device {
	
	public TVDevice(int currentChannel, int maxChannel) {
		super.currentChannel = currentChannel;
		super.maxChannel = maxChannel;
	}

	@Override
	public void pressButtonFive() {
		currentChannel--;
		System.out.println("Channel down");
	}

	@Override
	public void pressButtonSix() {
		currentChannel++;
		System.out.println("Channel up");
	}

}
