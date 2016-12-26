package command.radio;

import command.Command;
import command.ElectronicDevice;

public class TurnRadioOn implements Command {
	private ElectronicDevice device;
	
	public TurnRadioOn(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.on();
	}

	@Override
	public void undo() {
		device.off();
	}

}
