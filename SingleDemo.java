/**
*�������ģʽ��ʶ
*���һ�������ڴ���ֻ����һ������
*��Ҫ��֤Ψһ��
*1.Ϊ�˱��������������Ľ��������Ƚ�ֹ�����������������
*2.��Ϊ��������������Է��ʵ��������ֻ���ڱ��࣬�Զ���һ������
*3.Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ��

*����ô�������?
*1.�����캯��˽�л���
*2.�����д���һ���������
*3.�ṩһ�����������Ի�ȡ���ö���
@author YQ
@version v1.0
*/
public class SingleDemo {
	public static void main(String[] args) {
		// ͨ�������������еķ�����ȡ���еĶ���
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		Single s3 = Single.getInstance();
		s1.setTest("���ǲ��Զ����Ƿ�Ψһ,��s1�����õ�ֵ");
		System.out.println(s3.getTest());
		if (s1==s2) {
			System.out.println("s1��s2��һ������");
		}
		else
			System.out.println("s1��s2����һ������");
		Single1 s4 = Single1.getInstance();
		Single1 s5 = Single1.getInstance();
		if (s1==s2) {
			System.out.println("s4��s5��һ������");
		}
		else
			System.out.println("s4��s5����һ������");
	}
}
/**
*�������ģʽ��ʶ
*һ�����ֵ������ģʽ����
@author YQ
@version v1.0
*/
//��ʽһ������ʽ��
class Single {
	private String Test = "���ǵ������ģʽ�Ĳ���";
	/**
	*����һ���޸�Test�ķ���
	@param Test һ���ֲ��������ṩ�ӿڶ��⣬�ɸ�ֵ
	*/
	public void setTest(String Test){
		this.Test = Test;
	}
	/**
	*����һ������Test�ķ���
	@return Test ����һ��String���͵�ֵ
	*/
	public String getTest(){
		return Test;
	}
	// ˽�л����캯�������ⲻ�ɴ�������
	private Single(){}
	// �������������������Ҳ�ɷ��ʵ��������˽�л�����
	// ��Ϊ���÷��������ַ�ʽ��һ���������ã�һ��������ã�
	// ��Ȼ��綼�޷������������Ǿ����������ã����Խ�����̬����
	private static Single s = new Single();
	// �ṩ�����ķ��ʷ�ʽ
	/**
	*����һ�����ر��������������ķ���
	@return s ����һ��Single�����͵�ֵ
	*/
	public static Single getInstance() {
		return s;
	}
}
// ��ʽ��������ʽ����
/**

*/
class Single1 { //
	private static Single1 s = null;
	private void Single1(){}
	public static Single1 getInstance() {
		if (s==null) {
			s = new Single1();
		}
		return s;
	}
}