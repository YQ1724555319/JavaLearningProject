/**
@Yq
需求：
异常的练习题
老师用电脑上课，会发生一些异常，用面向对象和自定义的异常处理机制来结决
*/
/**
自定义讲课时会发生的蓝屏异常
*/
class BsoDException extends Exception {
	BsoDException(String message) {
		super(message);
	}
}
/**
自定义硬盘损坏异常
*/
class DiskDamageException extends Exception {
	DiskDamageException(String message) {
		super(message);
	}
}
/**
自定义老师无法讲课异常
*/
class NoPlanException extends Exception {
	NoPlanException(String message) {
		super(message);
	}
}
/**
电脑
*/
class Computer {
	private int parameter = 2;
	public void run()throws BsoDException,DiskDamageException { // 声明会发生的异常
		if (parameter == 2) {
			throw new BsoDException("电脑蓝屏");
		}
		if (parameter == 3) {
			throw new DiskDamageException("磁盘损坏");
		}
		System.out.println("电脑运行");
	}
	public void reset() {
		parameter = 1;
		System.out.println("电脑重启");
	}
}
/**
老师
*/
class Teacher {
	private String name;
	Computer c = new Computer(); // 建立电脑对象
	Teacher(String name) {
		this.name = name;
	}
	public void teach()throws NoPlanException { //声明电脑硬盘导致的异常致使老师无法讲课的异常
		try {
			c.run();
		}
		catch (BsoDException b) { //电脑蓝屏的异常是可以自己解决的，所以在这里将其解决，通过重启
			System.out.println(b.toString());
			c.reset();
		}
		catch (DiskDamageException d) { //但是硬盘损坏无法继续讲课，就不能解决，把他转换成可以解决的方式，抛出老师的异常
			throw new NoPlanException("无法继续讲课:"+d.getMessage());
		}
		System.out.println("讲课");
	}
}
public class ExceptionTest1 {
	public static void main(String[] args) {
		Teacher t = new Teacher("杨老师");
		try {
			t.teach();
		}
		catch (NoPlanException n) { //不再将异常抛出，而是解决
			System.out.println("做练习，换电脑");
			System.out.println(n.toString());
		}

	}
}
