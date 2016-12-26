package chainOfResponsibility;

public class Customer {
	public static void main(String[] args) {
		JuiceTruck juiceTruck = new JuiceTruck();
		System.out.println(juiceTruck.getJuice("Orange"));
		System.out.println(juiceTruck.getJuice("Apple"));
		System.out.println(juiceTruck.getJuice("Peach"));
		System.out.println(juiceTruck.getJuice("Potato"));
	}
}
