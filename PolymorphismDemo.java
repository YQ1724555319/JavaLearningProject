/**
@Yq
多态(polymorphism)初识--事物的多种体现形态
父类对象可以作为子类对象的引用
*/
/**
假设现有中国人和美国人，他们都具有姓名和年龄，并且还都有睡觉的习惯，但是中国人喜欢跳舞，美国人热爱运动
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
		System.out.println("name；"+name+"\n"+"age："+age);
	}
	void sleep() {
		System.out.println(name+"睡觉");
	}
	void dance() {
		System.out.println(name+"跳舞");
	}
}
/**

*/
class American extends Person {
	American(String name,int age) {
		super(name,age);
		System.out.println("name；"+name+"\n"+"age："+age);
	}
	void sleep() {
		System.out.println(name+"睡觉");
	}
	void sports() {
		System.out.println(name+"运动");
	}
}
public class PolymorphismDemo {
	public static void main(String[] args) {
		// 向上提升
		Person c = new Chinese("张三",12);
		Person a = new American("麦克",14);
		judge(c);
		judge(a);
	}
		public static void judge(Person x) {
			x.sleep();
			if(x instanceof Chinese) { //判断传入的实例是否是Chinese类型
				Chinese c = (Chinese)x; // 强制向下转型
				c.dance();
			}
			if (x instanceof American) {//判断传入的实例是否是American类型
				American a = (American)x;// 强制向下转型
				a.sports();
			}
		}
}
