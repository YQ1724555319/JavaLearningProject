/**
@Yq
�쳣-finally
finally����飺����һ����ִ�еĴ��롣
ͨ�����ڹر���Դ��
����
����һ���ݿ⡣�򵥵�һ�������������������ݿ⣬���ݿ�������ر����ݿ���������
�����ݿ��������ɾ��ģ�ʱ���п��ܷ����쳣���⣬���쳣��֪ʶ��ɶ����ݿ�������쳣����
*/
/**
�Զ���һ�����ݿ�����쳣
*/
class SQLHandleException extends Exception{
	SQLHandleException(String message) {
		super(message);
	}
}
/**
����һ���û������쳣���ظ��û���������֪�������Ƿ�ɹ�������Ҳ�������ڵ��쳣��װ����߳���ȫ��
*/
class InfoException extends Exception {
	InfoException(String message) {
		super(message);
	}
}
/**
���ݿ�ĸ��ֲ���
*/
class SQLHandle {
	public void link() {
		System.out.println("�������ݿ�");
	}
	public void handle()throws SQLHandleException { // �����ݿ������������������쳣
		int parameter = 2;
		if (parameter == 2) { // �������Ϊ2�ͻ��׳�����쳣����ʱ���쳣���׸�������
			throw new SQLHandleException("���ݿ�����쳣������");
		}
		System.out.println("���ݿ����");
	}
	public void off() {
		System.out.println("�ر����ݿ�����");
	}
}
public class ExceptionDemo5 {
	public static void main(String[] args)throws InfoException {
		SQLHandle s = new SQLHandle();
		s.link();
		try { // ����Ƿ�����쳣
			s.handle();
		}
		catch (SQLHandleException S) { //�����Ӧ���쳣����������׳�
			//System.out.println(S.toString());
			//�������������ݿ����ʱ�����쳣�������û���˵������쳣�����޷�������˵�޷�����ģ����������׳��û����Ķ����ҿ��Դ����쳣
			throw new InfoException("����ʧ��"); //�������û��׳������ʶ����쳣��������������������
		}
		finally { // finally�ﶨ������Ƿ��쳣Ҳһ����ִ�еĴ��룬һ�����ڹر���Դ����,�������ݿ�����ɹ���񣬶�Ҫ�ر��������ͷ���Դ
			s.off();
		}
	}
}