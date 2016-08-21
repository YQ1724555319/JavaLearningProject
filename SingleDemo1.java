/**
@Yq
单例设计模式--懒汉式
1.为了避免其他程序过多的建立对象，先禁止其他程序建立该类对象
2.还为了让其他程序可以访问到该类对象，只好在本类，自定义一个对象
3.为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。
*/
// 方式二（懒汉式）：延迟加载
class Single1 {
	private static Single1 s = null; // 私有并静态本类对象
	private Single1() {} //私有化构造函数
	public static Single1 getInstance() { // 提供公共访问方式
		if (s == null) { // 为了解决多线程访问时每次线程都要判断而造成的资源占用。多重判断
			synchronized(Single.class) { // 为了解决因多线程访问所造成的对象不唯一，使用同步代码块
				if (s == null) {
					s = new Single1(); // 延迟建立对象
				}
			}
		}
		return s;
	}
}
public class SingleDemo1 {
	public static void main(String[] args) {
		Single1 s1 = Single1.getInstance();
		Single1 s2 = Single1.getInstance();
		if (s1==s2) {
			System.out.println("s4和s5是一个对象");
		}
		else
			System.out.println("s4和s5不是一个对象");
	}
}
