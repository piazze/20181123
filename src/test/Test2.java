package test;

import pet.Dog;

public class Test2 {

	public static void main(String[] args) {
		/*Dog dog = new Dog("金毛",100,100,"金毛巡回犬");
		
		dog = new Dog(); //dog对象的内存地址发生了改变
		*/
		final Dog dog = new Dog("金毛",100,100,"金毛巡回犬");
		
		//dog的对象此时是一个常量，该对象的内存地址不能修改
		
		//dog对象的属性值可以更改
		dog.setName("欧欧");
		dog.setHealth(80);
		dog.setLove(90);
		System.out.println(dog.toString());
	}

}
