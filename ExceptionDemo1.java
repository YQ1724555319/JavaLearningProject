/**
@Yq
�쳣����-try catch
�򵥵��쳣�����﷨��ϰ
�쳣������throws
*/
class count {
	void div(int a,int b)throws Exception { // �ڹ�����ͨ��throws�Ĺؼ��������˸ù����п��ܲ������⡣�����ⷢ���׳���������������
		try {
			int c=a/b;
			System.out.println("�����"+c);
		}
		catch (Exception e) { //Exception e = new Exception,try��������쳣��Ὣ����쳣�������������ཨ��һ�����󸳸�catch�еı���e
			System.out.println("�����쳣����ķ�ʽ");
			System.out.println(e.getMessage()); // / by zero ��ϸ��Ϣ�ַ���
			System.out.println(e.toString()); //�쳣�ƣ��쳣��Ϣ
			e.printStackTrace(); // �쳣���ƣ��쳣��Ϣ���쳣���ֵ�λ��
			// ��ʵJVM���쳣����Ļ��ƣ������ڵ���printStackTrace()��������ӡ�쳣��ջ�ĸ�����Ϣ
		}
		System.out.println("over");
	}
}
public class ExceptionDemo1 {
	public static void main(String[] args) {
		new count().div(4,0);
		// �������0�����벻��������⣬����ʱ�����ArithmeticException: / by zero�����쳣�������쳣
	}
}