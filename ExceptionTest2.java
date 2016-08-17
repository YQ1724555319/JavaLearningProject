/**
@Yq
异常练习
需求：
现要求长方形和圆的面积，结合异常知识进行面积运算时的异常分析
*/
/**
当用户传入负数或0就会导致程序运算是无效或者不能接着运算其他，所以定义一个异常避免发生
自定义的异常类，描述面积运算时会发生的问题
*/
// 如果这个异常发生了，认为是绝对不可以的，所以，我们不能直接把他处理，有可能影响下面的运算，所以让这个异常继承RuntimeException
class ErrorVoualException extends RuntimeException {
	ErrorVoualException(String message) {
		super(message);
	}
}
/**
定义一个抽象类，在里面定义抽象方法getArea()获取面积
*/
abstract class Figure {
	public abstract void getArea();
}
/**
长方形
*/
class Rectangle extends Figure {
	private double len;
	private double wid;
	Rectangle(double len,double wid) { //throws ErrorVoualException 如果已经是RuntimeException,就不必再抛出，而是直接让程序停止
		if (len <= 0 || wid <= 0) {
			throw new ErrorVoualException("非法参数！！");
		}
		this.len = len;
		this.wid = wid;
	}
	public void getArea() {
		System.out.println("矩形面积为："+(len*wid));
	}
}
public class ExceptionTest2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(-3,4);
		r.getArea();
		/*
		如果已经是运行时异常，就不必再检测和处理，直接让程序停止
		try {

		}
		catch (ErrorVoualException e) {
			System.out.println(e.toString());
		}
		*/
		System.out.println("over");
	}
}
