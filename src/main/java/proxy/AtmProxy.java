package proxy;

public class AtmProxy implements GetAtmData {

	@Override
	public AtmState getAtmState() {
		AtmMachineContext realMachine = new AtmMachineContext();
		return realMachine.getAtmState();
	}

	@Override
	public int getCashAvaiable() {
		AtmMachineContext realMachine = new AtmMachineContext();
		return realMachine.getCashAvailable();
	}

}
