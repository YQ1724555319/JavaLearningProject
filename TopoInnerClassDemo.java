/**
@Yq
�ֲ��ڲ���
1.�ڲ��ඨ���ھֲ�ʱ�����ɱ���Ա���η����Ρ�
2.����ֱ�ӷ����ⲿ���еĳ�Ա����Ϊ�������ⲿ������á�
 ���ǲ����Է��������ڵľֲ��еı�����ֻ�ܷ��ʱ�final���εľֲ�������
*/
/**
�ⲿ��
*/
class Outer {
	int x = 2; //�ⲿ��ֲ�����
	void topo(int a) {
		int y = a; //���ھֲ��еı���
		/**
		�ֲ��ڲ���
		*/
		class Inner {
			void show1() {
				System.out.println("Outer-x:"+x);
				System.out.println("topo-y:"+y); //��Ļ�������
			}
		}
		new Inner().show1();
	}
}
public class TopoInnerClassDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.topo(4);
	}
}
