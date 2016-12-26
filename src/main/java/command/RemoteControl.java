package command;

import command.radio.Radio;
import command.tv.Television;

public class RemoteControl {
	
	public static ElectronicDevice getTVDevice() {
		return new Television();
	}
	
	public static ElectronicDevice getRadioDevice() {
		return new Radio();
	}
	
}
