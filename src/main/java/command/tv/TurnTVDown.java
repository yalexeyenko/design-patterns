package command;

public class TurnTVDown implements Command {
	private ElectronicDevice device;
	
	public TurnTVDown(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeDown();
	}
}
