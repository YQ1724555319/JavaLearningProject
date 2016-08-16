/**
@Yq
异常初识
异常：就是程序在运行时出现的不正常情况。
其实就是java对不正常情况进行描述后的对象体现。
Throwable
Error
    ·通常出现重大问题的通知：运行的类不存在或者内存溢出等。
    ·不编写针对代码对其处理
Exception
    ·在运行时出现的一起情况，可以通过try catch finally
Exception和Error的子类名都是以父类名作为后缀。
*/
/**

*/
class count {
	void div(int a,int b) {
		int c=a/b;
		System.out.println("结果："+c);
		System.out.println("over");
	}
}
public class ExceptionDemo {
	public static void main(String[] args) {
		new count().div(4,0);
		// 如果传入0，编译不会出现问题，运行时会出现ArithmeticException: / by zero，的异常，算术异常
	}
}
