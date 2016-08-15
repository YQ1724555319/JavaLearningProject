/**
@Yq
this关键字，初识this关键字
this关键字：
看上去是区分局部变量和成员变量同名的情况
this为什么可以解决这个问题？
this到底代表的是什么

this：代表本类的对象，到底代表哪一个呢？
  this代表它所在函数所属对象的引用。
  简单的说：哪个对象在调用this所在的函数，this就代表哪个对象。

  this关键字的应用
  但凡本类功能内部使用了本类对象，都用this表示

  this关键字，也可以用于构造函数的之间的相互调用。
*/
class PersonDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("张三");
		Person p2 = new Person("李四",53);
		Person p3 = new Person("王二",53);
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
		this(name);//this关键字，也可以用于构造函数的之间的相互调用。且必须放在第一行
		//this.name = name;
		this.age=age;
	}
	public void printPerson(){
		System.out.println("name="+name+"..."+"age="+age);
	}
	//定义一个功能，让Person类的对象具有比较年龄大小功能。
	public boolean compare(Person p){
		return this.age == p.age;
	}
}