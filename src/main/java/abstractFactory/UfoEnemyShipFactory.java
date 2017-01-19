package abstractFactory;

public class UfoEnemyShipFactory implements EnemyShipFactory {

	@Override
	public EsWeapon addEsGun() {
		return new EsUfoGun();
	}

	@Override
	public EsEngine addEsEngine() {
		return new EsUfoEngine();
	}

}
