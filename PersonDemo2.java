/**
@Yq
this�ؼ��֣���ʶthis�ؼ���
this�ؼ��֣�
����ȥ�����־ֲ������ͳ�Ա����ͬ�������
thisΪʲô���Խ��������⣿
this���״������ʲô

this��������Ķ��󣬵��״�����һ���أ�
  this���������ں���������������á�
  �򵥵�˵���ĸ������ڵ���this���ڵĺ�����this�ʹ����ĸ�����

  this�ؼ��ֵ�Ӧ��
  �������๦���ڲ�ʹ���˱�����󣬶���this��ʾ

  this�ؼ��֣�Ҳ�������ڹ��캯����֮����໥���á�
*/
class PersonDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("����");
		Person p2 = new Person("����",53);
		Person p3 = new Person("����",53);
		p1.printPerson();
		p2.printPerson();
		p3.printPerson();
		boolean b = p3.compare(p2);
		System.out.println(b);
	}
}

class Person{
	private String name;
	private int age;
	Person(String name){
		this.name = name;
	}
	Person(String name,int age){
		this(name);//this�ؼ��֣�Ҳ�������ڹ��캯����֮����໥���á��ұ�����ڵ�һ��
		//this.name = name;
		this.age=age;
	}
	public void printPerson(){
		System.out.println("name="+name+"..."+"age="+age);
	}
	//����һ�����ܣ���Person��Ķ�����бȽ������С���ܡ�
	public boolean compare(Person p){
		return this.age == p.age;
	}
}