/**
@Yq
final关键字--
*/
/**
定义一个类Person,并以final修饰

final class Person { //
	Person(){
		System.out.println("run");
	}
}
*/
/**
定义一个类Men并继承自Person类，看是否能编译通过

class Men extends Person { //
	Men(){
		System.out.println("run run");
	}
}
*/
class FinalDemo {
	public static void main(String[] args) {
		Men m = new Men();
		m.showName();
		System.out.println("---------------------");
		m.setName("lisi");
	}
}
/**
定义一个类Person,并具备两个功能，在其中一个方法上以final修饰，看是否能继承
*/
class Person {
	String name = "zhangsan";
	void showName() {
		System.out.println("showName："+name);
	}
	final void setName(String name) {
		this.name = name;
		System.out.println("setName："+name);
	}
}
/**
定义一个类Men并继承自Person类，
*/
class Men extends Person { //
	void showName() {
		super.showName();
		System.out.println("重写了");
	}
	void setName(String name) {
		super.setName(name);
		System.out.println("又重写了--"+name);
	}
}