/**
@Yq
���쳣�Ĵ���
1.�����쳣ʱ��������������Ϊ������쳣���������������
2.���������쳣���Ͷ�Ӧ����catch�飬��Ҫ��������catch��
 ������catch���е��쳣���ּ̳й�ϵ�������쳣catch��ͷ��������档
�����ڽ���catch����ʱ��catch��һ��Ҫ������崦��ʽ��
��Ҫ�򵥶���һ��e.printStackTrace(),Ҳ��Ҫ�򵥵ľ�дһ�������䡣

*/
class Count { //�����˾�����쳣���ͣ��Ա������ȥ����ش���
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException {
		int[] arr = new int[a];
		System.out.println("�Ǳ�Ϊ:"+arr[4]);
		return a/b;
	}
}
public class ExceptionDemo2 {
	public static void main(String[] args) {
		Count c = new Count();
		try {
			System.out.println("����="+c.div(5,0));
		}
		// �����˼��������쳣���ͱ���Ҫ�������쳣
		catch(ArithmeticException a1) {
			System.out.println("���������쳣"+"\n"+a1.toString());
		}
		catch(ArrayIndexOutOfBoundsException a2) {
			System.out.println("���ǽǱ�Խ���쳣"+"\n"+a2.toString());
		}
	}
}
