package pet;

public class Penguin extends Pet {

	public Penguin() {
		super();
	}
	private char sex;  //企鹅特有的属性
	
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	@Override
	public void print() {
		System.out.println("昵称：" + getName() + ",健康度：" + getHealth() + ",亲密度：" + getLove() + ",性别：" + this.sex);
	}
}
