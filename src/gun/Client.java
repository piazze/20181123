package gun;

public class Client {

	public static void main(String[] args) {
		Soldier s1 = new Soldier(); //士兵
		
		AbstractGun gun;
		
		//使用手枪杀敌
		//gun = new HandGun(); //父类类型保存子类引用,多态
		
		//使用来复杀敌
		//gun = new Rifle();
		
		//使用机枪杀敌
		gun = new MachineGun();
		
		s1.killEnemy(gun);
	}

}
