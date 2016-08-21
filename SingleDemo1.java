/**
@Yq
�������ģʽ--����ʽ
1.Ϊ�˱��������������Ľ��������Ƚ�ֹ�����������������
2.��Ϊ��������������Է��ʵ��������ֻ���ڱ��࣬�Զ���һ������
3.Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ��
*/
// ��ʽ��������ʽ�����ӳټ���
class Single1 {
	private static Single1 s = null; // ˽�в���̬�������
	private Single1() {} //˽�л����캯��
	public static Single1 getInstance() { // �ṩ�������ʷ�ʽ
		if (s == null) { // Ϊ�˽�����̷߳���ʱÿ���̶߳�Ҫ�ж϶���ɵ���Դռ�á������ж�
			synchronized(Single.class) { // Ϊ�˽������̷߳�������ɵĶ���Ψһ��ʹ��ͬ�������
				if (s == null) {
					s = new Single1(); // �ӳٽ�������
				}
			}
		}
		return s;
	}
}
public class SingleDemo1 {
	public static void main(String[] args) {
		Single1 s1 = Single1.getInstance();
		Single1 s2 = Single1.getInstance();
		if (s1==s2) {
			System.out.println("s4��s5��һ������");
		}
		else
			System.out.println("s4��s5����һ������");
	}
}
