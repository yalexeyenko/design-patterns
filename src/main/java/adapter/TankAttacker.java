package adapter;

public class TankAttacker implements MachineAttacker {

	@Override
	public void fireWeapon() {
		System.out.println("TankAttacker fires and causes 50% damage");
	}

	@Override
	public void driveForward() {
		System.out.println("TankAttacker drives 10 meters forward.");
	}

	@Override
	public void assignDriver(String driverName) {
		System.out.println("TankAttacker driver name is set to '" + driverName + "'.");
	}

}
