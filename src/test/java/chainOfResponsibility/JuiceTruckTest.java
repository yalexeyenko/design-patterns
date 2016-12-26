package chainOfResponsibility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JuiceTruckTest {
	private static final String ORANGE = "Orange";
	private static final String APPLE = "Apple";
	private static final String PEACH = "Peach";
	private static final String POTATO = "Potato";
	private static final String ERROR = "Can not make juice from Potato!";
	
	private JuiceTruck juiceTruck;
	private String orangeJuice;
	private String appleJuice;
	private String peachJuice;
	
	@Before
	public void init() {
		juiceTruck = new JuiceTruck();
		orangeJuice = "Orange juice! Yammy! =)";
		appleJuice = "Apple juice! Yammy! =)";
		peachJuice = "Peach juice! Yammy! =)";
	}
	
	@Test
	public void shouldDisplayJuices() {
		Assert.assertTrue(orangeJuice.equals(juiceTruck.getJuice(ORANGE)));
		Assert.assertTrue(appleJuice.equals(juiceTruck.getJuice(APPLE)));
		Assert.assertTrue(peachJuice.equals(juiceTruck.getJuice(PEACH)));
		Assert.assertTrue(ERROR.equals(juiceTruck.getJuice(POTATO)));
	}
	
}
