package test;

/**
 * final修饰的类不能被继承
 * @author Administrator
 *
 */
public final class Test {
	/*声明常量
	 * 常量在声明时必须赋值
	 * 常量一旦赋值，则只能取值，不能修改值
	 * 常量通常使用大写英文字母定义
	 * */
	public final int LEN = 10;
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.LEN);
		
	}
	
	/**
	 * 被final修饰的方法不能被子类重写
	 */
	public final void test() {
		
	}
}
