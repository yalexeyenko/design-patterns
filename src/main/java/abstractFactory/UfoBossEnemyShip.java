package abstractFactory;

public class UfoBossEnemyShip extends AbstractEnemyShip {
	private EnemyShipFactory shipFactory;

	public UfoBossEnemyShip(EnemyShipFactory shipFactory) {
		super();
		this.shipFactory = shipFactory;
	}

	public void makeShip() {
		System.out.println("Making enemy ship " + getName());
		setWeapon(shipFactory.addEsGun());
		setEngine(shipFactory.addEsEngine());
	}
}
