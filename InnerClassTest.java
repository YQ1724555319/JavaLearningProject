/**
@Yq
�����ڲ������ϰ
*/
/**
*
*/
interface Inter {
	public abstract void show();
}
/**

*/
class Outer {
	//��ȫ���룬ʹ�������ڲ���
	static Inter function(){
		/**
		class Inner implements Inter {
			public void show() {
				System.out.println("show");
			}
		}
		return new Inner();
		*/
		// ��дΪ�����ڲ���Ϊ,return�����ڶ����ֺŽ�����һ��Inter���͵��������
		return new Inter() {
			public void show() {
				System.out.println("show ����");
			}
		};
	}
}
public class InnerClassTest {
	public static void main(String[] args) {
		// Outer.funtion():��������������һ��������˵�����������һ����̬��
		//.show():�����ʾ��ǰ����������ú��������ص�ֵ��һ�����󣬲�����һ��Inter���͵Ķ���
		//������show������˵���ں����ﷵ�صĶ�����һ���ڲ���ģ���������ڲ���ʵ���˽ӿ�Inter
		Outer.function().show();
	//�ֽ� Inter in = Outer.function();
	//     in.show();
	}
}