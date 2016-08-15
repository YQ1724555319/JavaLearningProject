/**
@Yq
接口和抽象类的区别练习
假设有中国人和美国人，他们都具备姓名，国籍，年龄，性别属性，并且都吃饭，但是吃饭的方式是不同的，
中国人跳广场舞，而美国人不会。
*/
/**
首先，我们定义一个类Person,让其具有name,country，age,sex,属性，以及一个抽象的eat方法。
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
		System.out.println("name："+name+"\n"+"country："+country+"\n"+"age："+age+"\n"+"sex："+sex+"\n"+"------------");
	}
	abstract void eat();// 抽象，还不知道如何吃
}
/**
*此接口献给要跳广场舞的类
*/
interface GoDance {
	public abstract void dance();
}
/**
定义一个类Chinese,并让他继承自Person类，吃饭的方式是用筷子。
*/
class Chinese extends Person implements GoDance {
	Chinese(String name,String country,int age,char sex) {
		super(name,country,age,sex);
		eat();
		dance();
	}
	void eat() {
		System.out.println(country+"的"+name+"用筷子吃饭");
	}
	public void dance() {
		System.out.println(country+"的"+name+"跳广场舞"+"\n"+"------------");
	}
}
/**
这是美国人所在类American,并且它继承自Person类，吃饭方式是刀叉
*/
class American extends Person {
	American(String name,String country,int age,char sex) {
		super(name,country,age,sex);
		eat();
	}
	void eat() {
		System.out.println(country+"的"+name+"用刀叉吃饭");
	}
}
/**
建立两个类的对象，并将对象初始化
*/
public class InterfaceTest {
	public static void main(String[] args) {
		Chinese c = new Chinese("张三","中国",21,'男');
		American a = new American("安妮","美国",18,'女');
		//c.eat();
		//c.dance();
		//a.eat();
	}
}
