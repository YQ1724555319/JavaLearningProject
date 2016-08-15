/**
@Yq
模板方法设计模式--引入
需求：获取一段程序运行的时间。
原理：获取程序的开始时间和结束时间并相减即可。
获取时间：System.currentTimeMillis();

结合抽象类，以及面向对象的思想和所学知识解决该问题
*/
/**
*定义一个类，获取运行时间
*/
abstract class GetTime {
	// 为了防止获取时间的方法被重写，以final修饰
	final void getTime() {
		long start = System.currentTimeMillis();// 获取开始时间
		run();
		long end = System.currentTimeMillis();// 获取结束时间
		System.out.println("程序运行了："+(end-start)+"毫秒");// 输出运行时间
	}
	// 将获取程序的方法独立出来，并且abstract修饰，表示抽象方法，所以，本类也为抽象类
	abstract void run();
}
/**
*定义一个类，并且继承自GetTime类，重写run方法，自定义要运行的程序块。此类用于实例化
*/
class SubTime extends GetTime {
	public void run() {
		//需要运行的程序块
		int x = 0;
		while (x < 1000) {
			x++;
			System.out.print(x+"\t");
		}
	}
}
public class TemplateDemo {
	public static void main(String[] args) {
		new SubTime().getTime();
	}
}