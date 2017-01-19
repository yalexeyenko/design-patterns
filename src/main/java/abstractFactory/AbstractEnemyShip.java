package abstractFactory;

public abstract class AbstractEnemyShip {
	private String name;
	private EsWeapon weapon;
	private EsEngine engine;
	
	public abstract void makeShip();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EsWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(EsWeapon weapon) {
		this.weapon = weapon;
	}

	public EsEngine getEngine() {
		return engine;
	}

	public void setEngine(EsEngine engine) {
		this.engine = engine;
	}

	public void followHeroShip() {
		System.out.println(getName() + " is following hero at " + engine);
	}

	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen");
	}

	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + weapon);
	}

	public String toString() {
		String shipInfo = "The " + name + " has a top speed of " + engine + " and attack power of " + weapon;
		return shipInfo;
	}
}
