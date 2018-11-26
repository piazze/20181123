package test2;

public class Client {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b);
		
		//父类类型保存子类对象
		AbstractA a = b;
		//比较a和b的内存地址是否相同
		
		//==两侧为基本数据类型时，比较的是值是否相同
		//==两侧为引用数据类型时，比较的是内存地址是否相同
		System.out.println(a == b);
		AbstractA a1 = new B();
		AbstractA a2 = new C();
		
		//判断a1的对象的真正的类型   instanceof
		System.out.println(a1 instanceof C);  //判断a1真正的类型是否为C
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof AbstractA);
	}

}
