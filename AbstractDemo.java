/**
@Yq
抽象类初识，abstract关键字应用
*/
class AbstractDemo {
	public static void main(String[] args) {
		new Chinese().speak();
		new American().speak();
	}
}

/**
定义一个类Person，并用abstract修饰，让其具备speak方法声明而没有功能主题。并用abstract修饰
*/
abstract class Person { //
	abstract void speak();
	// 抽象类中的非抽象方法
	void sleep(){
		System.out.println("睡觉");
	}
}
/**
定义一个类Chinese，并让它继承自Person,重写speak方法
*/
class Chinese extends Person{ //
	void speak() {
		System.out.println("我 说 中 文");
		super.sleep();
	}
}
/**
定义一个类 American，并让它继承自Person,重写speak方法
*/
class American extends Person{ //
	 void speak() {
		System.out.println("I speak English");
		super.sleep();
	}
}