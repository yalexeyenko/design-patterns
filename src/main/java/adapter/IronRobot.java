package adapter;

public class IronRobot implements RobotAttacker {

	@Override
	public void smashWithHands() {
		System.out.println("IronRobot smashes and causes 10% damage");
	}

	@Override
	public void walkForward() {
		System.out.println("IronRobot walkes 5 meters forward.");
	}

	@Override
	public void assignMaster(String masterName) {
		System.out.println("IronRobot obeys master '" + masterName + "'.");
	}

}
