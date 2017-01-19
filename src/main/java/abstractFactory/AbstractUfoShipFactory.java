package abstractFactory;

public abstract class AbstractUfoShipFactory {
	protected abstract AbstractEnemyShip makeEnemyShip(String shipType);
	
	public AbstractEnemyShip orderShip(String shipType) {
		AbstractEnemyShip enemyShip = makeEnemyShip(shipType);
		enemyShip.makeShip();
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
		
		return enemyShip;
	}
}
