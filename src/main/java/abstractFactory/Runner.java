package abstractFactory;

public class Runner {
	public static void main(String[] args) {
		AbstractUfoShipFactory shipFactory = new UfoShipFactory();
		AbstractEnemyShip theGrunt = shipFactory.orderShip("UFO");
		System.out.println(theGrunt + "\n");
		
		AbstractEnemyShip theBoss = shipFactory.orderShip("BOSS");
		System.out.println(theBoss + "\n");

	}
}
