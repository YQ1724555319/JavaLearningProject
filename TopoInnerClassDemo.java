/**
@Yq
局部内部类
1.内部类定义在局部时，不可被成员修饰符修饰。
2.可以直接访问外部类中的成员，因为还持有外部类的引用。
 但是不可以访问它所在的局部中的变量。只能访问被final修饰的局部变量。
*/
/**
外部类
*/
class Outer {
	int x = 2; //外部类局部变量
	void topo(int a) {
		int y = a; //所在局部中的变量
		/**
		局部内部类
		*/
		class Inner {
			void show1() {
				System.out.println("Outer-x:"+x);
				System.out.println("topo-y:"+y); //真的会编译出错？
			}
		}
		new Inner().show1();
	}
}
public class TopoInnerClassDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.topo(4);
	}
}
