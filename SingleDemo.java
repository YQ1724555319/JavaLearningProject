/**
*单例设计模式初识
*解决一个类在内存中只存在一个对象
*想要保证唯一：
*1.为了避免其他程序过多的建立对象，先禁止其他程序建立该类对象
*2.还为了让其他程序可以访问到该类对象，只好在本类，自定义一个对象
*3.为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。

*如何用代码体现?
*1.将构造函数私有化。
*2.在类中创建一个本类对象
*3.提供一个方法，可以获取到该对象。
@author YQ
@version v1.0
*/
public class SingleDemo {
	public static void main(String[] args) {
		// 通过类名调用类中的方法获取类中的对象
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		Single s3 = Single.getInstance();
		s1.setTest("我是测试对象是否唯一,在s1下设置的值");
		System.out.println(s3.getTest());
		if (s1==s2) {
			System.out.println("s1和s2是一个对象");
		}
		else
			System.out.println("s1和s2不是一个对象");
	}
}
/**
*单例设计模式初识
*一个体现单例设计模式的类
@author YQ
@version v1.0
*/
//方式一（饿汉式）
class Single {
	private String Test = "我是单例设计模式的测试";
	/**
	*这是一个修改Test的方法
	@param Test 一个局部变量，提供接口对外，可赋值
	*/
	public void setTest(String Test){
		this.Test = Test;
	}
	/**
	*这是一个返回Test的方法
	@return Test 返回一个String类型的值
	*/
	public String getTest(){
		return Test;
	}
	// 私有化构造函数，类外不可创建对象
	private Single(){}
	// 创建本类对象，其他程序也可访问到该类对象并私有化对象，
	// 因为调用方法就两种方式，一个类名调用，一个对象调用，
	// 既然外界都无法创建对象，我们就以类名调用，所以将对象静态修饰
	private static Single s = new Single();
	// 提供公共的访问方式
	/**
	*这是一个返回本类对象给主函数的方法
	@return s 返回一个Single类类型的值
	*/
	public static Single getInstance() {
		return s;
	}
}
