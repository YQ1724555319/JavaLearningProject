/**
@Yq
�ڲ����ʶ
�ڲ������ⲿ��ĳ�Ա����
*/
/**
�ⲿ��
*/
class Outer {
	private int x = 3;
	/**
	�ڲ���
	*/
	class Inner {
		int y = 4;
		// �ڲ������ֱ�ӷ����ⲿ����еĳ�Ա������˽��
		void IshowX() {
			System.out.println("Inner.x:"+x);
			// �ڲ����д����ⲿ����������Կ���ֱ�ӷ����ⲿ���Ա,ֻ��ʡ����
			System.out.println("why.x:"+x);
		}
	}
	void showX() {
		// �ⲿ������ڲ����еĳ�Ա��Ҫ�����ڲ���Ķ���
		Inner i = new Inner();
		i.IshowX();
		System.out.println("x:"+x);
	}
}
public class InnerClassDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.showX();
		// ���ⲿ������ֱ�ӷ����ڲ����еĳ�Ա��Ҳ��Ҫ�������󣬸�ʽ����
		Outer.Inner in = new Outer().new Inner();
		System.out.println("Inner.y:"+in.y);

	}
}
