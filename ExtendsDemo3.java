/**
@Yq
�̳�--�Ӹ�����й��캯����ϵ--��������ʵ��������
*/
/**
����һ������Person��������name="zhangsan"���ٶ���һ���޲ι��캯������һ���вι��췽�����������ӡname��
*/
class Person { //
	String name = "zhangsan";
	Person() {
		System.out.println("name��"+name);
		System.out.println("Person�����޲εĹ��캯��");
	}
	Person(String name) {
		this.name = name;
		System.out.println("name��"+name);
		System.out.println("Person�����вεĹ��캯��");
	}
}
/**
����һ����Students,�������̳���Person���ٶ���һ���޲εĹ��캯����һ���вεĹ��캯�����Զ���super
*/
class  Students extends Person{ //
	Students(){
		super();
		System.out.println("Students�����޲ι��캯��");
	}
	Students(String name) {
		super(name);
		System.out.println("Students�����вι��캯��");
	}
}
class ExtendsDemo3 {
	public static void main(String[] args) {
		Students s = new Students();
		System.out.println("-----------------------");
		Students s1 = new Students("lisi");
	}
}