package command.tv;

import command.ElectronicDevice;

public class Television implements ElectronicDevice {
	private static final String ON = "TV is On";
	private static final String OFF = "TV is Off";
	private static final String VOLUME_UP = "Volume Up: ";
	private static final String VOLUME_DOWN = "Volume Down: ";
	private Integer volume = 0;

	@Override
	public void on() {
		System.out.println(ON);		
	}

	@Override
	public void off() {
		System.out.println(OFF);
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println(VOLUME_UP + volume);
	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println(VOLUME_DOWN + volume);
	}

}
