package bridge;

public class Runner {
	public static void main(String[] args) {
		RemoteControl tvRemoteControl = new TvRemoteControl(new TVDevice(1, 100));
		RemoteControl blueRayRemotecontrol = new BlueRayRemotecontrol(new BlueRayDevice(1, 100));
		
		System.out.println("Test TV remote control:");
		tvRemoteControl.pressButtonSix();
		tvRemoteControl.pressButtonSix();
		tvRemoteControl.pressButtonSix();
		tvRemoteControl.pressButtonFive();
		tvRemoteControl.pressButtonNine();
		tvRemoteControl.deviceFeedback();
		
		System.out.println("\nTest BlueRay remote control:");
		blueRayRemotecontrol.pressButtonSix();
		blueRayRemotecontrol.pressButtonSix();
		blueRayRemotecontrol.pressButtonSix();
		blueRayRemotecontrol.pressButtonFive();
		blueRayRemotecontrol.pressButtonNine();
		blueRayRemotecontrol.deviceFeedback();
	}
}
