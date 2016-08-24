/**
@Yq
多线程-线程间的访问
需求：两个线程实现数据的存入输出
input---->资源---->output
*/
/**
共享数据
*/
class Uer {
	private String name;
	private String sex;
	boolean flag = false; // 此变量用于判断数据的有无，决定线程是否等待，
	public synchronized void setUer(String name,String sex) {
		if (this.flag) { // 判断数据状态，是否等待
					try {this.wait();} catch (Exception e) {}// 线程等待
				}
		this.name = name;
		this.sex = sex;
		this.flag = true; //将数据状态改变，表示存储完毕
		this.notify(); // 当赋值完成则将读取线程线程唤醒
	}
	public synchronized void getUer() {
		if (!this.flag) {
			try {this.wait();} catch (Exception e) {} // 线程等待
		}
		System.out.println(this.name+"------"+this.sex);
		this.flag = false;
		this.notify(); // 线程等待
	}
}
/**
输入存储线程
*/
class Input implements Runnable {
	private Uer u;
	Input(Uer u) {
		this.u = u;
	}
	public void run() {
		boolean par = true; // 这个变量用于在两个赋值操作中切换状态
		while (true) {
			if (par) {
				u.setUer("StruggleYang","man");
				par = false; // 当存储完这个数据 ，则将赋值状态改变，切换赋值的数据
			}
			else {
				u.setUer("张三","女女");
				par = true; // 切换赋值的数据
			}
		}
	}
}
/**
读取线程
*/
class Output implements Runnable {
	private Uer u;
	Output(Uer u) {
		this.u = u;
	}
	public void run() {
		while(true) {
			u.getUer(); // 读取数据
		}
	}
}
public class ThreadMessage {
	public static void main(String[] args) {
		Uer u = new Uer(); // 建立数据对象
		new Thread(new Input(u)).start();
		new Thread(new Output(u)).start();
	}
}