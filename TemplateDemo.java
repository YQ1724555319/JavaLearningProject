/**
@Yq
ģ�巽�����ģʽ--����
���󣺻�ȡһ�γ������е�ʱ�䡣
ԭ����ȡ����Ŀ�ʼʱ��ͽ���ʱ�䲢������ɡ�
��ȡʱ�䣺System.currentTimeMillis();

��ϳ����࣬�Լ���������˼�����ѧ֪ʶ���������
*/
/**
*����һ���࣬��ȡ����ʱ��
*/
abstract class GetTime {
	// Ϊ�˷�ֹ��ȡʱ��ķ�������д����final����
	final void getTime() {
		long start = System.currentTimeMillis();// ��ȡ��ʼʱ��
		run();
		long end = System.currentTimeMillis();// ��ȡ����ʱ��
		System.out.println("���������ˣ�"+(end-start)+"����");// �������ʱ��
	}
	// ����ȡ����ķ�����������������abstract���Σ���ʾ���󷽷������ԣ�����ҲΪ������
	abstract void run();
}
/**
*����һ���࣬���Ҽ̳���GetTime�࣬��дrun�������Զ���Ҫ���еĳ���顣��������ʵ����
*/
class SubTime extends GetTime {
	public void run() {
		//��Ҫ���еĳ����
		int x = 0;
		while (x < 1000) {
			x++;
			System.out.print(x+"\t");
		}
	}
}
public class TemplateDemo {
	public static void main(String[] args) {
		new SubTime().getTime();
	}
}