/**
@Yq
��̬�ڲ���
���ڲ��౻static���κ�ֻ��ֱ�ӷ����ⲿ���е�static��Ա����������ʾ���
���ⲿ�������У����ֱ�ӷ���static�ڲ���ķǾ�̬��Ա
    new �ⲿ����.�ڲ�����().�ڷǾ�̬��Ա;
���ⲿ�������У����ֱ�ӷ���static�ڲ���ľ�̬��Ա��
    �ⲿ����.�ڲ�����.�ھ�̬��Ա;
ע�⣺
  ���ڲ����ж����˾�̬��Ա�����ڲ��������static����
  ���ⲿ���еľ�̬���������ڲ���ʱ���ڲ��������static��
*/
/**
�ⲿ��
*/
class Outer {
	private static int x = 3; //��̬�ڲ���ֻ�ܷ����ⲿ���еľ�̬��Ա
	/**
	��̬�ڲ���
	*/
	static class Inner {
		static private int y = 4; //�ڲ��ඨ���˾�̬��Ա���������static
		void showOut() { //�Ǿ�̬��Ա
			System.out.println("Outer--x:"+x);
		}
		static void getStaticY() {
			System.out.println("OuterStatic--x"+x);
		}
	}
	static String showIn() { //���ⲿ���еľ�̬���������ڲ���ʱ���ڲ��������static��
		return "showIn:"+new Inner().y;
	}
}
public class StaticInnerClassDemo {
	public static void main(String[] args) {
		new Outer.Inner().showOut(); //�ⲿ��������ʾ�̬�ڲ����е� ���Ǿ�̬�� ��Ա
		Outer.Inner.getStaticY(); //�ⲿ��������ʾ�̬�ڲ����е� ����̬�� ��Ա
		Outer o = new Outer();
		System.out.println(o.showIn());
	}
}
