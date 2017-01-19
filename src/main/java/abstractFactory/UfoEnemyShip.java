package abstractFactory;

public class UfoEnemyShip extends AbstractEnemyShip {
	private EnemyShipFactory shipFactory;

	public UfoEnemyShip(EnemyShipFactory shipFactory) {
		super();
		this.shipFactory = shipFactory;
	}

	public void makeShip() {
		System.out.println("Making enemy ship " + getName());
		setWeapon(shipFactory.addEsGun());
		setEngine(shipFactory.addEsEngine());
	}
}
