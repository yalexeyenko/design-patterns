package command;

import java.util.ArrayList;
import java.util.List;

import command.radio.TurnRadioOn;
import command.radio.TurnRadioUp;
import command.tv.TurnTVOn;
import command.tv.TurnTVUp;

public class PlayWithRemote {
	public static void main(String[] args) {
		
		// Crate all devices
		ElectronicDevice deviceTV = RemoteControl.getTVDevice();
		ElectronicDevice deviceRadio = RemoteControl.getRadioDevice();
		
		// TV
		TurnTVOn onTvCommand = new TurnTVOn(deviceTV);		
		DeviceButton button = new DeviceButton(onTvCommand);		
		button.press();
				
		TurnTVUp upTvCommand = new TurnTVUp(deviceTV);		
		button = new DeviceButton(upTvCommand);		
		button.press();
		button.press();
		
		TurnRadioOn onRadioCommand = new TurnRadioOn(deviceRadio);
		button = new DeviceButton(onRadioCommand);
		button.press();

		// Radio
		TurnRadioUp upRadioCommand = new TurnRadioUp(deviceRadio);
		button = new DeviceButton(upRadioCommand);
		button.press();
		button.press();
		
		// Turn all devices off
		List<ElectronicDevice> devices = new ArrayList<>();
		devices.add(deviceTV);
		devices.add(deviceRadio);
		TurnItAllOff allOffCommand = new TurnItAllOff(devices);		
		button = new DeviceButton(allOffCommand);
		button.press();
		
		// undo
		button.pressUndo();
	}
}
