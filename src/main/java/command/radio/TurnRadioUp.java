package command.radio;

import command.Command;
import command.ElectronicDevice;

public class TurnRadioUp implements Command {
	private ElectronicDevice device;
	
	public TurnRadioUp(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeUp();
	}

	@Override
	public void undo() {
		device.volumeDown();
	}
}
