package gun;

/**
 * 士兵类
 * @author Administrator
 *
 */
public class Soldier {
	/**
	 * 杀敌人的方法
	 */
	public void killEnemy(AbstractGun gun) {
		System.out.println("士兵开始射击");
		gun.shoot();
	}
}
