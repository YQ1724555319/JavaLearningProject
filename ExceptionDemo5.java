/**
@Yq
异常-finally
finally代码块：定义一定会执行的代码。
通常用于关闭资源。
需求：
现有一数据库。简单的一个操作流程是链接数据库，数据库操作，关闭数据库三个动作
在数据库操作（增删查改）时，有可能发生异常问题，以异常的知识完成对数据库操作的异常处理
*/
/**
自定义一个数据库操作异常
*/
class SQLHandleException extends Exception{
	SQLHandleException(String message) {
		super(message);
	}
}
/**
定义一个用户操作异常返回给用户，让其能知道操作是否成功，并且也将程序内的异常封装，提高程序安全性
*/
class InfoException extends Exception {
	InfoException(String message) {
		super(message);
	}
}
/**
数据库的各种操作
*/
class SQLHandle {
	public void link() {
		System.out.println("连接数据库");
	}
	public void handle()throws SQLHandleException { // 在数据库操作方法上声明这个异常
		int parameter = 2;
		if (parameter == 2) { // 假设参数为2就会抛出这个异常，这时候异常就抛给主函数
			throw new SQLHandleException("数据库操作异常！！！");
		}
		System.out.println("数据库操作");
	}
	public void off() {
		System.out.println("关闭数据库连接");
	}
}
public class ExceptionDemo5 {
	public static void main(String[] args)throws InfoException {
		SQLHandle s = new SQLHandle();
		s.link();
		try { // 检测是否存在异常
			s.handle();
		}
		catch (SQLHandleException S) { //捕获对应的异常，并处理或抛出
			//System.out.println(S.toString());
			//这里我们在数据库操作时发生异常，对于用户来说，这个异常他是无法理解或者说无法解决的，所以我们抛出用户看的懂并且可以处理异常
			throw new InfoException("操作失败"); //我们向用户抛出这个可识别的异常，所以在主函数上声明
		}
		finally { // finally里定义程序是否异常也一定会执行的代码，一般用于关闭资源操作,不管数据库操作成功与否，都要关闭连接来释放资源
			s.off();
		}
	}
}