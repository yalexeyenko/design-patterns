package command.tv;

import command.Command;
import command.ElectronicDevice;

public class TurnTVOn implements Command {
	private ElectronicDevice device;
	
	public TurnTVOn(ElectronicDevice device) {
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
