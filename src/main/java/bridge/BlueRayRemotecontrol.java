package bridge;

public class BlueRayRemotecontrol extends RemoteControl {

	public BlueRayRemotecontrol(Device device) {
		super(device);
	}

	@Override
	public void pressButtonNine() {
		System.out.println("BlueRay was paused");
	}

}
