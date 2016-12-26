package command.radio;

import command.Command;
import command.ElectronicDevice;

public class TurnRadioDown implements Command {
	private ElectronicDevice device;
	
	public TurnRadioDown(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeDown();
	}

	@Override
	public void undo() {
		device.volumeUp();
	}
}
