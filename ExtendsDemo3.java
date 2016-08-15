/**
@Yq
继承--子父类的中构造函数关系--子类对象的实例化过程
*/
/**
定义一个父类Person，有属性name="zhangsan"，再定义一个无参构造函数，和一个有参构造方法，并让其打印name。
*/
class Person { //
	String name = "zhangsan";
	Person() {
		System.out.println("name："+name);
		System.out.println("Person类中无参的构造函数");
	}
	Person(String name) {
		this.name = name;
		System.out.println("name："+name);
		System.out.println("Person类中有参的构造函数");
	}
}
/**
定义一个类Students,并让它继承自Person，再定义一个无参的构造函数和一个有参的构造函数，自定义super
*/
class  Students extends Person{ //
	Students(){
		super();
		System.out.println("Students类中无参构造函数");
	}
	Students(String name) {
		super(name);
		System.out.println("Students类中有参构造函数");
	}
}
class ExtendsDemo3 {
	public static void main(String[] args) {
		Students s = new Students();
		System.out.println("-----------------------");
		Students s1 = new Students("lisi");
	}
}