/**
@Yq
��̬(polymorphism)��ʶ--����Ķ���������̬
������������Ϊ������������
*/
/**
���������й��˺������ˣ����Ƕ��������������䣬���һ�����˯����ϰ�ߣ������й���ϲ�����裬�������Ȱ��˶�
*/
abstract class Person {
	String name;
	int age;
	Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	abstract void sleep();
}
/**

*/
class Chinese extends Person {
	Chinese(String name,int age) {
		super(name,age);
		System.out.println("name��"+name+"\n"+"age��"+age);
	}
	void sleep() {
		System.out.println(name+"˯��");
	}
	void dance() {
		System.out.println(name+"����");
	}
}
/**

*/
class American extends Person {
	American(String name,int age) {
		super(name,age);
		System.out.println("name��"+name+"\n"+"age��"+age);
	}
	void sleep() {
		System.out.println(name+"˯��");
	}
	void sports() {
		System.out.println(name+"�˶�");
	}
}
public class PolymorphismDemo {
	public static void main(String[] args) {
		// ��������
		Person c = new Chinese("����",12);
		Person a = new American("���",14);
		judge(c);
		judge(a);
	}
		public static void judge(Person x) {
			x.sleep();
			if(x instanceof Chinese) { //�жϴ����ʵ���Ƿ���Chinese����
				Chinese c = (Chinese)x; // ǿ������ת��
				c.dance();
			}
			if (x instanceof American) {//�жϴ����ʵ���Ƿ���American����
				American a = (American)x;// ǿ������ת��
				a.sports();
			}
		}
}
