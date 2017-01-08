package adapter;

public class Runner {

	public static void main(String[] args) {
		MachineAttacker t34 = new TankAttacker();
		RobotAttacker bb8 = new IronRobot();
		
		t34.fireWeapon();
		t34.driveForward();
		t34.assignDriver("Michael");
		
		bb8.smashWithHands();
		bb8.walkForward();
		bb8.assignMaster("Joseph");
		
		MachineAttacker robotAdapter = new MachineRobotAdapter(bb8);
		robotAdapter.fireWeapon();
		robotAdapter.driveForward();
		robotAdapter.assignDriver("Christian");

	}

}
