/**
@Yq
�������--�ӿڳ�ʶ���ؼ��֣�interface(�ӿ�)����implements(ʵ��)��
*/
/**
����һ���ӿڣ�������һ��������һ�����󷽷�
*/
interface Inter { // ����ӿ�
	// �ӿڳ�Ա������ʽ
    public static final int NUM = 12;
	// �ӿڳ�Ա������ʽ
    public abstract void show();
}

/**
����һ���࣬��������ཫʵ��Inter�ӿ�
*/
class Test implements Inter {
	 // ��д�ӿ��е�show����
    public void show() {
        System.out.println("�����ʵ���˽ӿ�Inter:"+NUM);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        new Test().show();
		// ���󣬽ӿڣ����඼�ɵ��ýӿ��еı���NUM,��Ϊ����ȫ�ֵ�
        System.out.println("������ã�"+new Test().NUM);// ������ó�Ա
        System.out.println("�ӿ�������"+Inter.NUM);// �ӿ������ó�Ա
        System.out.println("��������"+Test.NUM);// �������ó�Ա
		//new Test().NUM = 4; //���޷�Ϊ�ӿ��еı������¸�ֵ�ģ��������
    }
}