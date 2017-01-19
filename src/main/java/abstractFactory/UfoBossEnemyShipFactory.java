package abstractFactory;

public class UfoBossEnemyShipFactory implements EnemyShipFactory {

	@Override
	public EsWeapon addEsGun() {
		return new EsUfoBossGun();
	}

	@Override
	public EsEngine addEsEngine() {
		return new EsUfoBossEngine();
	}

}
