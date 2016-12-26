package chainOfResponsibility;

public class JuiceTruck {
	private static AbstractJuiceMachine doChaining() {
		AbstractJuiceMachine orangeJuiceMachine = new OrangeJuiceMachine();
		AbstractJuiceMachine appleJuiceMachine = new AppleJuiceMachine();
		AbstractJuiceMachine peachJuiceMachine = new PeachJuiceMachine();
		
		orangeJuiceMachine.setNextJuiceMachine(appleJuiceMachine);
		appleJuiceMachine.setNextJuiceMachine(peachJuiceMachine);
		
		return orangeJuiceMachine;
	}
	
	protected String getJuice(String fruitName) {
		AbstractJuiceMachine juiceMachine = doChaining();
		return juiceMachine.makeJuice(fruitName);
	}
}
