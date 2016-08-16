/**
@Yq
�Զ����쳣
����:����һ�����򣬳��Ը���Ҳ�Ǵ��󲻿ɽ�������ģ���ô����Ҫ����������������
*/
/**
�Զ�����쳣�࣬����̳�Exception�࣬��������쳣
���ں������ڲ�������throw�׳��쳣������ô�ͱ���Ҫ����Ӧ�Ĵ�������Ҫô��try catch����Ҫô�ں������������õ����ߴ���
һ������£������ڳ����쳣����������Ҫ������
throws��thorw������
throwsʹ���ں����ϡ�������쳣�ࡣ���Ը�������ö��Ÿ���
throwʹ���ں����������쳣����
*/
class MinusException extends Exception {
	private int value; //�Զ������б��������մ������
	MinusException(String message,int value) {
		super(message); //��Ϊ��Exception���У��Ѿ��й�����������̳���֮��ֻ��Ҫ��������������ȥִ�оͿ�����
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
class Count { //�����˾�����쳣���ͣ��Ա������ȥ����ش���
	int div(int a,int b)throws MinusException { //�ں����ڳ������⣬Ҫ�������õ�����ȥ����
		// java�����е��쳣�����Զ��׳������������Զ�����쳣��
		// java��ʶ����Ҫ�ֶ����������׳���throw �׳�����쳣����
		if (b<0) {
			throw new MinusException("�������� / ",b); //����������������������棬�Ա��׳�
		}
		return a/b;
	}
}
public class ExceptionDemo3 {
	public static void main(String[] args) {
		Count c = new Count();
		try {  //�����ߴ�������쳣
			System.out.println(c.div(4,-1));
		}
		catch (MinusException m) {
			System.out.println(m.toString()+"�������Ϊ��"+m.getValue()); //��ӡ�쳣������
		}
	}
}
