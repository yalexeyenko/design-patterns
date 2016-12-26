package command.radio;

import command.Command;
import command.ElectronicDevice;

public class TurnRadioOff implements Command {
	private ElectronicDevice device;
	
	public TurnRadioOff(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.off();
	}

	@Override
	public void undo() {
		device.on();		
	}
}
