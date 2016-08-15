/**
@Yq
�ӿںͳ������������ϰ
�������й��˺������ˣ����Ƕ��߱����������������䣬�Ա����ԣ����Ҷ��Է������ǳԷ��ķ�ʽ�ǲ�ͬ�ģ�
�й������㳡�裬�������˲��ᡣ
*/
/**
���ȣ����Ƕ���һ����Person,�������name,country��age,sex,���ԣ��Լ�һ�������eat������
*/
abstract class Person {
	String name,country;
	int age;
	char sex;
	Person(String name,String country,int age,char sex){
		this.name = name;
		this.country = country;
		this.age = age;
		this.sex = sex;
		System.out.println("name��"+name+"\n"+"country��"+country+"\n"+"age��"+age+"\n"+"sex��"+sex+"\n"+"------------");
	}
	abstract void eat();// ���󣬻���֪����γ�
}
/**
*�˽ӿ��׸�Ҫ���㳡�����
*/
interface GoDance {
	public abstract void dance();
}
/**
����һ����Chinese,�������̳���Person�࣬�Է��ķ�ʽ���ÿ��ӡ�
*/
class Chinese extends Person implements GoDance {
	Chinese(String name,String country,int age,char sex) {
		super(name,country,age,sex);
		eat();
		dance();
	}
	void eat() {
		System.out.println(country+"��"+name+"�ÿ��ӳԷ�");
	}
	public void dance() {
		System.out.println(country+"��"+name+"���㳡��"+"\n"+"------------");
	}
}
/**
����������������American,�������̳���Person�࣬�Է���ʽ�ǵ���
*/
class American extends Person {
	American(String name,String country,int age,char sex) {
		super(name,country,age,sex);
		eat();
	}
	void eat() {
		System.out.println(country+"��"+name+"�õ���Է�");
	}
}
/**
����������Ķ��󣬲��������ʼ��
*/
public class InterfaceTest {
	public static void main(String[] args) {
		Chinese c = new Chinese("����","�й�",21,'��');
		American a = new American("����","����",18,'Ů');
		//c.eat();
		//c.dance();
		//a.eat();
	}
}
