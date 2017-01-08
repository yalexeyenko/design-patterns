package adapter;

public class MachineRobotAdapter implements MachineAttacker {
	private RobotAttacker robotAttacker;
	
	public MachineRobotAdapter(RobotAttacker robotAttacker) {
		super();
		this.robotAttacker = robotAttacker;
	}

	@Override
	public void fireWeapon() {
		robotAttacker.smashWithHands();		
	}

	@Override
	public void driveForward() {
		robotAttacker.walkForward();
	}

	@Override
	public void assignDriver(String driverName) {
		robotAttacker.assignMaster(driverName);
	}

}
