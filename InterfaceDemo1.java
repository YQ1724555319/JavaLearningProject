/**
@Yq
�ӿڵ�һЩע�⣬
1.�ӿ��ǲ����Դ�������ģ���Ϊ�г��󷽷���
2.��Ҫ����ʵ�֣��ؼ��֣�implements������Խӿ��еĳ��󷽷�ȫ�����Ǻ󣬲ſɱ�ʵ���������򣬸��໹��һ��������
3.�ӿڿ��Ա����ʵ�֡�Ҳ�Ƕԡ���̳С���֧�ֵ�ת����ʽ��java֧�ֶ�ʵ�֣���Ϊ�ӿ��﷽��û�з����塣
4.һ�����ڼ̳�һ�����ͬʱ��������ʵ�ֽӿڡ�
5.�ӿ���ӿ�֮����ڼ̳й�ϵ������֧�ֶ�̳У�java��ֻ�нӿ�֮����ڶ�̳С�
*/
/**
*
*/
interface Inter {
	public abstract void show();
}
/**
*
*/
interface InterA {
	public abstract void showA();
}
/**
*
*/
interface InterB extends Inter,InterA { //�ӿ�֮���Ǽ̳й�ϵ������֧�ֶ�̳�
	public abstract void showB();
}
/**

*/
class FirstTest {
	public void showTestExtends() {
		System.out.println("�̳�FirstTest��");
	}
}
/**

*/
class Test extends FirstTest implements Inter,InterA { //֧�ֶ�ʵ��,�̳����ͬʱ��Ҳ��ʵ�ֽӿ�
	public void show() {
		System.out.println("ʵ��Inter�ӿ�");
	}
	public void showA() {
		System.out.println("ʵ��InterA�ӿ�");
	}
}
/**

*/
class TestB implements InterB {
	public void showAll() {
		show();
		showA();
		showB();
	}
	public void show() {
		System.out.println("----------------------------");
		System.out.println("�ӿ�֮��Ĺ�ϵ�Ǽ̳й�ϵ");
	}
	public void showA() {
		System.out.println("�ӿ�֧�ֶ�̳У���Ϊ�ӿڷ��������޷�����");
	}
	public void showB() {
		System.out.println("��̳к�Ľӿڣ�����ʵ��ʱ��Ҫ��д�ӿںͱ��̳нӿڵ����з�������ʵ����");
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Test t = new Test();
		t.showTestExtends();
		t.show();
		t.showA();
		TestB t1 = new TestB();
		t1.showAll();
	}
}
