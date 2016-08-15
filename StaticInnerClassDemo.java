/**
@Yq
静态内部类
当内部类被static修饰后，只能直接访问外部类中的static成员，出现类访问局限
在外部其他类中，如何直接访问static内部类的非静态成员
    new 外部类名.内部类名().内非静态成员;
在外部其他类中，如何直接访问static内部类的静态成员？
    外部类名.内部类名.内静态成员;
注意：
  当内部类中定义了静态成员，该内部类必须是static修饰
  当外部类中的静态方法访问内部类时，内部类必须是static的
*/
/**
外部类
*/
class Outer {
	private static int x = 3; //静态内部类只能访问外部类中的静态成员
	/**
	静态内部类
	*/
	static class Inner {
		static private int y = 4; //内部类定义了静态成员，该类必须static
		void showOut() { //非静态成员
			System.out.println("Outer--x:"+x);
		}
		static void getStaticY() {
			System.out.println("OuterStatic--x"+x);
		}
	}
	static String showIn() { //当外部类中的静态方法访问内部类时，内部类必须是static的
		return "showIn:"+new Inner().y;
	}
}
public class StaticInnerClassDemo {
	public static void main(String[] args) {
		new Outer.Inner().showOut(); //外部其他类访问静态内部类中的 “非静态” 成员
		Outer.Inner.getStaticY(); //外部其他类访问静态内部类中的 “静态” 成员
		Outer o = new Outer();
		System.out.println(o.showIn());
	}
}
