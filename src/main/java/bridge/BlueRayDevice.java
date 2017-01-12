package bridge;

public class BlueRayDevice extends Device {

	public BlueRayDevice(int currentChannel, int maxChannel) {
		super.currentChannel = currentChannel;
		super.maxChannel = maxChannel;
	}

	@Override
	public void pressButtonFive() {
		currentChannel--;
		System.out.println("Previous track");
	}

	@Override
	public void pressButtonSix() {
		currentChannel++;
		System.out.println("Next track");
	}

}
