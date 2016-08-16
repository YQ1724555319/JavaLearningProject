/**
@Yq
异常--RuntimeException
Exception中有一个特殊的子类异常RuntimeException y运行时异常
如果在函数内抛出该异常及其子类，函数上可以不用声明，编译一样通过。
如果在函数上声明了该异常。调用者可以不用进行处理。编译一样通过；
之所以不用在函数声明，是因为不需要让调用者处理。

当该异常发生，希望程序停止。因为在运行时，出现了无法继续运算的情况，希望停止程序后，对代码进行修正。
自定义异常时：如果该异常的发生，无法再继续进行运算，就让自定义异常继承RuntimeException。
*/
class MinusException extends RuntimeException { //让这个异常类继承RuntimeException
	MinusException(String message) {
		super(message);
	}
}
class Count {
	int div(int a,int b) {
		if (b<0) { // 如果在函数内抛出的异常时RuntimeException及其子类异常，不必再函数上声明此异常
			throw new MinusException("除负数了");
		}
		if (b==0) { //自定义异常的信息
			throw new ArithmeticException("除0了");
		}
		return a/b;
	}
}
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Count c = new Count();
		System.out.println(c.div(4,-1));
		System.out.println("over");
	}
}
