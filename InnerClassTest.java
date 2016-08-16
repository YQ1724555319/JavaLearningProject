/**
@Yq
匿名内部类的练习
*/
/**
*
*/
interface Inter {
	public abstract void show();
}
/**

*/
class Outer {
	//补全代码，使用匿名内部类
	static Inter function(){
		/**
		class Inner implements Inter {
			public void show() {
				System.out.println("show");
			}
		}
		return new Inner();
		*/
		// 改写为匿名内部类为,return后至第二个分号结束是一个Inter类型的子类对象
		return new Inter() {
			public void show() {
				System.out.println("show 匿名");
			}
		};
	}
}
public class InnerClassTest {
	public static void main(String[] args) {
		// Outer.funtion():这里类名调用了一个函数，说明这个函数是一个静态的
		//.show():这里表示，前面的类名调用函数所返回的值是一个对象，并且是一个Inter类型的对象
		//调用了show方法，说明在函数里返回的对象是一个内部类的，并且这个内部类实现了接口Inter
		Outer.function().show();
	//分解 Inter in = Outer.function();
	//     in.show();
	}
}