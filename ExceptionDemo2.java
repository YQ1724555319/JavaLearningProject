/**
@Yq
多异常的处理
1.声明异常时，建议是声明更为具体的异常。这样处理更具体
2.声明几个异常，就对应几个catch块，不要定义多余的catch块
 如果多个catch块中的异常出现继承关系，父类异常catch块就放在最下面。
建议在进行catch处理时，catch中一定要定义具体处理方式。
不要简单定义一句e.printStackTrace(),也不要简单的就写一条输出语句。

*/
class Count { //声明了具体的异常类型，以便调用者去做相关处理
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException {
		int[] arr = new int[a];
		System.out.println("角标为:"+arr[4]);
		return a/b;
	}
}
public class ExceptionDemo2 {
	public static void main(String[] args) {
		Count c = new Count();
		try {
			System.out.println("除得="+c.div(5,0));
		}
		// 声明了几个具体异常，就必须要处理几个异常
		catch(ArithmeticException a1) {
			System.out.println("这是算术异常"+"\n"+a1.toString());
		}
		catch(ArrayIndexOutOfBoundsException a2) {
			System.out.println("这是角标越界异常"+"\n"+a2.toString());
		}
	}
}
