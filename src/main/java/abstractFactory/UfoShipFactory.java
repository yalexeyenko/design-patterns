package abstractFactory;

public class UfoShipFactory extends AbstractUfoShipFactory {
	private AbstractEnemyShip enemyShip;

	@Override
	protected AbstractEnemyShip makeEnemyShip(String shipType) {
		if ("UFO".equals(shipType)) {
			EnemyShipFactory shipFactory = new UfoBossEnemyShipFactory();
			enemyShip = new UfoBossEnemyShip(shipFactory);
			enemyShip.setName("UFO Grunt Ship");
		} else if ("UFO BOSS".equals(shipType)) {
			EnemyShipFactory shipPartsFactory = new UfoBossEnemyShipFactory();
			enemyShip = new UfoBossEnemyShip(shipPartsFactory);
			enemyShip.setName("UFO Boss Ship");
		}
		return enemyShip;
	}

}
