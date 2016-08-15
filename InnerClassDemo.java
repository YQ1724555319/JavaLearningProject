/**
@Yq
内部类初识
内部类与外部类的成员互访
*/
/**
外部类
*/
class Outer {
	private int x = 3;
	/**
	内部类
	*/
	class Inner {
		int y = 4;
		// 内部类可以直接访问外部类的中的成员，包括私有
		void IshowX() {
			System.out.println("Inner.x:"+x);
			// 内部类中存在外部类的引用所以可以直接访问外部类成员,只是省略了
			System.out.println("why.x:"+x);
		}
	}
	void showX() {
		// 外部类访问内部类中的成员需要建立内部类的对象
		Inner i = new Inner();
		i.IshowX();
		System.out.println("x:"+x);
	}
}
public class InnerClassDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.showX();
		// 在外部其他类直接访问内部类中的成员，也需要创建对象，格式如下
		Outer.Inner in = new Outer().new Inner();
		System.out.println("Inner.y:"+in.y);

	}
}
