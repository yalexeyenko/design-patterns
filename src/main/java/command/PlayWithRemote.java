package command;

public class PlayWithRemote {
	public static void main(String[] args) {
		ElectronicDevice deviceTV = TVRemote.getTVDevice();
		
		Command onCommand = new TurnTVOn(deviceTV);
		
		DeviceButton button = new DeviceButton(onCommand);
		
		button.press();
	}
}
