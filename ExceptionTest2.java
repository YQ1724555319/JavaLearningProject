/**
@Yq
�쳣��ϰ
����
��Ҫ�󳤷��κ�Բ�����������쳣֪ʶ�����������ʱ���쳣����
*/
/**
���û����븺����0�ͻᵼ�³�����������Ч���߲��ܽ����������������Զ���һ���쳣���ⷢ��
�Զ�����쳣�࣬�����������ʱ�ᷢ��������
*/
// �������쳣�����ˣ���Ϊ�Ǿ��Բ����Եģ����ԣ����ǲ���ֱ�Ӱ��������п���Ӱ����������㣬����������쳣�̳�RuntimeException
class ErrorVoualException extends RuntimeException {
	ErrorVoualException(String message) {
		super(message);
	}
}
/**
����һ�������࣬�����涨����󷽷�getArea()��ȡ���
*/
abstract class Figure {
	public abstract void getArea();
}
/**
������
*/
class Rectangle extends Figure {
	private double len;
	private double wid;
	Rectangle(double len,double wid) { //throws ErrorVoualException ����Ѿ���RuntimeException,�Ͳ������׳�������ֱ���ó���ֹͣ
		if (len <= 0 || wid <= 0) {
			throw new ErrorVoualException("�Ƿ���������");
		}
		this.len = len;
		this.wid = wid;
	}
	public void getArea() {
		System.out.println("�������Ϊ��"+(len*wid));
	}
}
public class ExceptionTest2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(-3,4);
		r.getArea();
		/*
		����Ѿ�������ʱ�쳣���Ͳ����ټ��ʹ���ֱ���ó���ֹͣ
		try {

		}
		catch (ErrorVoualException e) {
			System.out.println(e.toString());
		}
		*/
		System.out.println("over");
	}
}
