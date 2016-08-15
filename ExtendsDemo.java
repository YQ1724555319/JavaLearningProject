/**
@Yq
继承初识
*/
/**
*这是一个父类
*/
class Person { //
	String name;
	int age;
}
/**
*这是继承自Person这个父类的子类Student
*/
class Student extends Person {
	void study(){
		System.out.println("Student--"+name+"\t"+age+"\t"+"good study");
	}
}
/**
*这是继承自父类Person的子类Worker
*/
class Worker extends Person {
	void work()	{
		System.out.println("Worker--"+name+"\t"+age+"\t"+"good work");
	}
 }
class ExtendsDemo {
	public static void main(String[] args) {
		// 分别创建两个子类对象，并赋值,调用方法实现输出
		Student s = new Student();
		Worker w = new Worker();
		s.name = "zhangsan";
		s.age = 18;
		w.name = "lisi";
		w.age = 21;
		s.study();
		w.work();
	}
}