/**
@Yq
�����ڲ�����
1.�����ڲ������ڲ���ļ�д��ʽ��
2.���������ڲ����ǰ�᣺
 �ڲ�������Ǽ̳�һ������߽ӿڡ�
3.�����ڲ���ĸ�ʽ�� new �����ӿ�( ){ ������������� }
4.��ʵ�����ڲ������һ������������󡣶��ұȽ��֣��������Ϊ�����ݵĶ���
*/
/**
�ڲ�����Ҫ�̳еĸ���
*/
abstract class Demo {
	abstract void show();
	abstract void show1();
}
/**
�ⲿ��
*/
class Outer {
	int a = 3;
	public void function() {
		/**
		�ֲ��ڲ���

		class Inner extends Demo {
			public void show() {
				System.out.println("Outer-a="+a);
			}
			public void show1() {
				System.out.println("hahha");
			}
		}
		new Inner().show();

		//��дΪ�����ڲ������£�
		new Demo() {
			public void show() {
				System.out.println("Outer-a="+a);
			}
			public void show1() {
				System.out.println("hahha");
			}
		}.show();
		*/
		//���������һ�����ϵ�����Ҫһ����ã����дΪ��
		Demo d = new Demo() { // �����������õ�������󣨶�̬��
			public void show() {
				System.out.println("Outer-a="+a);
			}
			public void show1() {
				System.out.println("��д���෽��2");
			}
			public void show2() {
				System.out.println("������δ����ķ���");
			}
		}; //ע������ķֺ�
		d.show();
		d.show1();
		//d.show2();  �����ʧ�ܣ���Ϊ�������ֻ�ܵ��ø������������ķ���
	}

}
public class InnerClassDemo3 {
	public static void main(String[] args) {
		new Outer().function();
	}
}
