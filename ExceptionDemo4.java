/**
@Yq
�쳣--RuntimeException
Exception����һ������������쳣RuntimeException y����ʱ�쳣
����ں������׳����쳣�������࣬�����Ͽ��Բ�������������һ��ͨ����
����ں����������˸��쳣�������߿��Բ��ý��д�������һ��ͨ����
֮���Բ����ں�������������Ϊ����Ҫ�õ����ߴ���

�����쳣������ϣ������ֹͣ����Ϊ������ʱ���������޷���������������ϣ��ֹͣ����󣬶Դ������������
�Զ����쳣ʱ��������쳣�ķ������޷��ټ����������㣬�����Զ����쳣�̳�RuntimeException��
*/
class MinusException extends RuntimeException { //������쳣��̳�RuntimeException
	MinusException(String message) {
		super(message);
	}
}
class Count {
	int div(int a,int b) {
		if (b<0) { // ����ں������׳����쳣ʱRuntimeException���������쳣�������ٺ������������쳣
			throw new MinusException("��������");
		}
		if (b==0) { //�Զ����쳣����Ϣ
			throw new ArithmeticException("��0��");
		}
		return a/b;
	}
}
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Count c = new Count();
		System.out.println(c.div(4,-1));
		System.out.println("over");
	}
}
