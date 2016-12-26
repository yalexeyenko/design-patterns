package command;

public class TurnTVUp implements Command {
	private ElectronicDevice device;
	
	public TurnTVUp(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeUp();
	}
}
