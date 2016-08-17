/**
@Yq
����
�쳣����ϰ��
��ʦ�õ����ϿΣ��ᷢ��һЩ�쳣�������������Զ�����쳣������������
*/
/**
�Զ��彲��ʱ�ᷢ���������쳣
*/
class BsoDException extends Exception {
	BsoDException(String message) {
		super(message);
	}
}
/**
�Զ���Ӳ�����쳣
*/
class DiskDamageException extends Exception {
	DiskDamageException(String message) {
		super(message);
	}
}
/**
�Զ�����ʦ�޷������쳣
*/
class NoPlanException extends Exception {
	NoPlanException(String message) {
		super(message);
	}
}
/**
����
*/
class Computer {
	private int parameter = 2;
	public void run()throws BsoDException,DiskDamageException { // �����ᷢ�����쳣
		if (parameter == 2) {
			throw new BsoDException("��������");
		}
		if (parameter == 3) {
			throw new DiskDamageException("������");
		}
		System.out.println("��������");
	}
	public void reset() {
		parameter = 1;
		System.out.println("��������");
	}
}
/**
��ʦ
*/
class Teacher {
	private String name;
	Computer c = new Computer(); // �������Զ���
	Teacher(String name) {
		this.name = name;
	}
	public void teach()throws NoPlanException { //��������Ӳ�̵��µ��쳣��ʹ��ʦ�޷����ε��쳣
		try {
			c.run();
		}
		catch (BsoDException b) { //�����������쳣�ǿ����Լ�����ģ����������ｫ������ͨ������
			System.out.println(b.toString());
			c.reset();
		}
		catch (DiskDamageException d) { //����Ӳ�����޷��������Σ��Ͳ��ܽ��������ת���ɿ��Խ���ķ�ʽ���׳���ʦ���쳣
			throw new NoPlanException("�޷���������:"+d.getMessage());
		}
		System.out.println("����");
	}
}
public class ExceptionTest1 {
	public static void main(String[] args) {
		Teacher t = new Teacher("����ʦ");
		try {
			t.teach();
		}
		catch (NoPlanException n) { //���ٽ��쳣�׳������ǽ��
			System.out.println("����ϰ��������");
			System.out.println(n.toString());
		}

	}
}
