/**
@Yq
自定义异常
需求:假设一个程序，除以负数也是错误不可进行运算的，那么就需要对这个问题进行描述
*/
/**
自定义的异常类，必须继承Exception类，描述这个异常
当在函数数内部出现了throw抛出异常对象，那么就必须要给对应的处理动作。要么在try catch处理，要么在函数上声明，让调用者处理。
一般情况下，函数内出现异常，函数上需要声明。
throws和thorw的区别
throws使用在函数上。后面跟异常类。可以跟多个，用逗号隔开
throw使用在函数里。后面跟异常对象。
*/
class MinusException extends Exception {
	private int value; //自定义特有变量来接收错误参数
	MinusException(String message,int value) {
		super(message); //因为在Exception类中，已经有过这个方法，继承了之后，只需要将参数传给父类去执行就可以了
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
class Count { //声明了具体的异常类型，以便调用者去做相关处理
	int div(int a,int b)throws MinusException { //在函数内出现问题，要声明，让调用者去处理
		// java中已有的异常可以自动抛出，但是我们自定义的异常，
		// java不识别，需要手动建立对象并抛出，throw 抛出这个异常对象
		if (b<0) {
			throw new MinusException("除负数了 / ",b); //将问题的描述定义在这里面，以便抛出
		}
		return a/b;
	}
}
public class ExceptionDemo3 {
	public static void main(String[] args) {
		Count c = new Count();
		try {  //调用者处理这个异常
			System.out.println(c.div(4,-1));
		}
		catch (MinusException m) {
			System.out.println(m.toString()+"错误参数为："+m.getValue()); //打印异常的名称
		}
	}
}
