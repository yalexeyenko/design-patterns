package command.tv;

import command.Command;
import command.ElectronicDevice;

public class TurnTVOff implements Command {
	private ElectronicDevice device;
	
	public TurnTVOff(ElectronicDevice device) {
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
