package pet;

/**
 * 抽象类
 * 抽象类不能被实例化
 * 抽象类中可以包含
 * 		属性，普通方法，抽象方法，构造方法
 * 		
 * @author Administrator
 *
 */
public abstract class Pet {

	/**
	 * 无参构造方法
	 */
	public Pet() {}
	
	/**
	 * 有参构造方法
	 * @param name 昵称
	 * @param health 健康值
	 * @param love	亲密度
	 */
	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}

	private String name;
	private int health;
	private int love;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	
	/**
	 * 抽象方法
	 * 所有的Pet的子类必须重写print方法
	 * 因为不同的子类对print方法的实现方式不同
	 * 父类中提供的print方法完全没有起作用
	 * 因此将print方法提取为抽象方法
	 */
	public abstract void print();
}
