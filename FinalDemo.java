/**
@Yq
final�ؼ���--
*/
/**
����һ����Person,����final����

final class Person { //
	Person(){
		System.out.println("run");
	}
}
*/
/**
����һ����Men���̳���Person�࣬���Ƿ��ܱ���ͨ��

class Men extends Person { //
	Men(){
		System.out.println("run run");
	}
}
*/
class FinalDemo {
	public static void main(String[] args) {
		Men m = new Men();
		m.showName();
		System.out.println("---------------------");
		m.setName("lisi");
	}
}
/**
����һ����Person,���߱��������ܣ�������һ����������final���Σ����Ƿ��ܼ̳�
*/
class Person {
	String name = "zhangsan";
	void showName() {
		System.out.println("showName��"+name);
	}
	final void setName(String name) {
		this.name = name;
		System.out.println("setName��"+name);
	}
}
/**
����һ����Men���̳���Person�࣬
*/
class Men extends Person { //
	void showName() {
		super.showName();
		System.out.println("��д��");
	}
	void setName(String name) {
		super.setName(name);
		System.out.println("����д��--"+name);
	}
}