/**
@Yq
接口的一些注意，
1.接口是不可以创建对象的，因为有抽象方法。
2.需要被类实现（关键字：implements），类对接口中的抽象方法全部覆盖后，才可被实例化，否则，该类还是一个抽象类
3.接口可以被类多实现。也是对“多继承”不支持的转换形式，java支持多实现，因为接口里方法没有方法体。
4.一个类在继承一个类的同时，还可以实现接口。
5.接口与接口之间存在继承关系，并且支持多继承，java中只有接口之间存在多继承。
*/
/**
*
*/
interface Inter {
	public abstract void show();
}
/**
*
*/
interface InterA {
	public abstract void showA();
}
/**
*
*/
interface InterB extends Inter,InterA { //接口之间是继承关系，并且支持多继承
	public abstract void showB();
}
/**

*/
class FirstTest {
	public void showTestExtends() {
		System.out.println("继承FirstTest类");
	}
}
/**

*/
class Test extends FirstTest implements Inter,InterA { //支持多实现,继承类的同时，也可实现接口
	public void show() {
		System.out.println("实现Inter接口");
	}
	public void showA() {
		System.out.println("实现InterA接口");
	}
}
/**

*/
class TestB implements InterB {
	public void showAll() {
		show();
		showA();
		showB();
	}
	public void show() {
		System.out.println("----------------------------");
		System.out.println("接口之间的关系是继承关系");
	}
	public void showA() {
		System.out.println("接口支持多继承，因为接口方法里面无方法体");
	}
	public void showB() {
		System.out.println("多继承后的接口，在类实现时，要重写接口和被继承接口的所有方法才能实例化");
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Test t = new Test();
		t.showTestExtends();
		t.show();
		t.showA();
		TestB t1 = new TestB();
		t1.showAll();
	}
}
