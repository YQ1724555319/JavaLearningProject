/**
@Yq
多线程--获取线程的当前对象及名称：
线程都有自己的默认名称，从Thread-0开始

static Thread currentThread():获取当前线程对象
getNmae():获取线程名称
设置线程名称：setName或者构造函数中super(name);

同类线程对象所处的栈内存空间不同，其操作的变量也是不同的。
*/
class Thread1 extends Thread {
	Thread1(String name) {
		super(name); // 对线程名称进行初始化
	}
	public void run() {
		for (int x = 0;x < 10;x++) { // 获取当前线程的对象引用并获取这个线程的名称，currentThread()是静态的，所以直接调用
			System.out.println("线程"+Thread.currentThread().getName()+"------"+x);
		}
	}
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		t1.start();
		t2.start();

		for (int x = 0;x < 10;x++) {
			System.out.println("主线程---"+x);
		}
	}
}
