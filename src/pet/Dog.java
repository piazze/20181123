package pet;

public class Dog extends Pet{

	private String strain;
	
	public Dog() {
		super();
	}

	public Dog(String name, int health, int love,String strain) {
		super(name, health, love);
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}


	public void setStrain(String strain) {
		this.strain = strain;
	}


	@Override
	public void print() {
		System.out.println("昵称：" + super.getName() + ",健康度：" + super.getHealth() + ",亲密度：" + super.getLove() + ",品种：" + this.strain);
	}

}
