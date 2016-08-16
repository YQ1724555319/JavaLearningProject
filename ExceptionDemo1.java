/**
@Yq
异常处理-try catch
简单的异常处理语法练习
异常的声明throws
*/
class count {
	void div(int a,int b)throws Exception { // 在功能上通过throws的关键字声明了该功能有可能产生问题。当问题发生抛出这个问题给调用者
		try {
			int c=a/b;
			System.out.println("结果："+c);
		}
		catch (Exception e) { //Exception e = new Exception,try里面检测出异常后会将这个异常所符合描述的类建立一个对象赋给catch中的变量e
			System.out.println("这是异常处理的方式");
			System.out.println(e.getMessage()); // / by zero 详细消息字符串
			System.out.println(e.toString()); //异常称：异常信息
			e.printStackTrace(); // 异常名称，异常信息，异常出现的位置
			// 其实JVM对异常处理的机制，就是在调用printStackTrace()方法，打印异常堆栈的跟踪信息
		}
		System.out.println("over");
	}
}
public class ExceptionDemo1 {
	public static void main(String[] args) {
		new count().div(4,0);
		// 如果传入0，编译不会出现问题，运行时会出现ArithmeticException: / by zero，的异常，算术异常
	}
}