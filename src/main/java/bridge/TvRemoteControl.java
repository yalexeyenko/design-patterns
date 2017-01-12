package bridge;

public class TvRemoteControl extends RemoteControl {
	
	public TvRemoteControl(Device device) {
		super(device);
	}

	@Override
	public void pressButtonNine() {
		System.out.println("TV was muted");
	}

}
