package command.tv;

import command.Command;
import command.ElectronicDevice;

public class TurnTVDown implements Command {
	private ElectronicDevice device;
	
	public TurnTVDown(ElectronicDevice device) {
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
