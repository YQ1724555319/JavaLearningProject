/**
@Yq
�쳣��ʶ
�쳣�����ǳ���������ʱ���ֵĲ����������
��ʵ����java�Բ������������������Ķ������֡�
Throwable
Error
    ��ͨ�������ش������֪ͨ�����е��಻���ڻ����ڴ�����ȡ�
    ������д��Դ�����䴦��
Exception
    ��������ʱ���ֵ�һ�����������ͨ��try catch finally
Exception��Error�������������Ը�������Ϊ��׺��
*/
/**

*/
class count {
	void div(int a,int b) {
		int c=a/b;
		System.out.println("�����"+c);
		System.out.println("over");
	}
}
public class ExceptionDemo {
	public static void main(String[] args) {
		new count().div(4,0);
		// �������0�����벻��������⣬����ʱ�����ArithmeticException: / by zero�����쳣�������쳣
	}
}
