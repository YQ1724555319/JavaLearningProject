/**
@Yq
static（静态）关键字的初识练习
用来修饰类中的成员变量和成员函数。
在分析对象时，如果存在多个对象都有共享属性，
则可以在类中将这个共享属性修饰为静态。
*/
class StaticDemo {
	public static void main(String[] args) {
		Person p1 = new Person("zhangsan");
		Person p2= new Person("lisi");
		Person.show(); //用类名调用静态修饰的方法
	}
}

class Person {
	private String name; // 一个普通的成员变量
	private static String country = "China"; // 一个被static静态修饰过的成员变量
	Person(String name){
		this.name = name;
		System.out.println("name:"+name+"\t"+"country:"+country);
	}
	static void show(){ // 静态修饰的方法
		System.out.println("我被类名直接调用，因为我被static修饰--"+country);
	}
}