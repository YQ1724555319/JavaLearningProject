/**
@Yq
���߳�-�̼߳�ķ���
���������߳�ʵ�����ݵĴ������
input---->��Դ---->output
*/
/**
��������
*/
class Uer {
	private String name;
	private String sex;
	boolean flag = false; // �˱��������ж����ݵ����ޣ������߳��Ƿ�ȴ���
	public synchronized void setUer(String name,String sex) {
		if (this.flag) { // �ж�����״̬���Ƿ�ȴ�
					try {this.wait();} catch (Exception e) {}// �̵߳ȴ�
				}
		this.name = name;
		this.sex = sex;
		this.flag = true; //������״̬�ı䣬��ʾ�洢���
		this.notify(); // ����ֵ����򽫶�ȡ�߳��̻߳���
	}
	public synchronized void getUer() {
		if (!this.flag) {
			try {this.wait();} catch (Exception e) {} // �̵߳ȴ�
		}
		System.out.println(this.name+"------"+this.sex);
		this.flag = false;
		this.notify(); // �̵߳ȴ�
	}
}
/**
����洢�߳�
*/
class Input implements Runnable {
	private Uer u;
	Input(Uer u) {
		this.u = u;
	}
	public void run() {
		boolean par = true; // �������������������ֵ�������л�״̬
		while (true) {
			if (par) {
				u.setUer("StruggleYang","man");
				par = false; // ���洢��������� ���򽫸�ֵ״̬�ı䣬�л���ֵ������
			}
			else {
				u.setUer("����","ŮŮ");
				par = true; // �л���ֵ������
			}
		}
	}
}
/**
��ȡ�߳�
*/
class Output implements Runnable {
	private Uer u;
	Output(Uer u) {
		this.u = u;
	}
	public void run() {
		while(true) {
			u.getUer(); // ��ȡ����
		}
	}
}
public class ThreadMessage {
	public static void main(String[] args) {
		Uer u = new Uer(); // �������ݶ���
		new Thread(new Input(u)).start();
		new Thread(new Output(u)).start();
	}
}