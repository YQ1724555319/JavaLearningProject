/**
@Yq
匿名内部类类
1.匿名内部类是内部类的简写格式。
2.定义匿名内部类的前提：
 内部类必须是继承一个类或者接口。
3.匿名内部类的格式： new 父类或接口( ){ 定义子类的内容 }
4.其实匿名内部类就是一个匿名子类对象。而且比较胖，可以理解为带内容的对象。
*/
/**
内部类所要继承的父类
*/
abstract class Demo {
	abstract void show();
	abstract void show1();
}
/**
外部类
*/
class Outer {
	int a = 3;
	public void function() {
		/**
		局部内部类

		class Inner extends Demo {
			public void show() {
				System.out.println("Outer-a="+a);
			}
			public void show1() {
				System.out.println("hahha");
			}
		}
		new Inner().show();

		//改写为匿名内部类如下：
		new Demo() {
			public void show() {
				System.out.println("Outer-a="+a);
			}
			public void show1() {
				System.out.println("hahha");
			}
		}.show();
		*/
		//如果定义了一个以上的类需要一起调用，则改写为：
		Demo d = new Demo() { // 创建父类引用的子类对象（多态）
			public void show() {
				System.out.println("Outer-a="+a);
			}
			public void show1() {
				System.out.println("重写父类方法2");
			}
			public void show2() {
				System.out.println("父类中未定义的方法");
			}
		}; //注意这里的分号
		d.show();
		d.show1();
		//d.show2();  会编译失败，因为这个对象只能调用父类已中声明的方法
	}

}
public class InnerClassDemo3 {
	public static void main(String[] args) {
		new Outer().function();
	}
}
