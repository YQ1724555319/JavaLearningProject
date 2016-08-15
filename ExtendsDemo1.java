/**
子父类中变量的特点，关键字super，访问父类中的变量。
*/
/**
定义一个父类，且类中定义里参数name和age并赋值
*/
class Person { //
	String name = "zhangsan";
	int age = 18;
}
/**
定义一个类，且这个类继承自Person这个父类，其中有参数age并赋值
这样我们发现子类和父类中出现里同名变量，如果建立对象，会将父类age输出，还是子类的age？
但是一般情况下是不会出现父子类中有同名变量的，
*/
class Student extends Person{ //
	int age = 15;
	public void showStu(){
		System.out.println("name:"+name+"\t"+"这是子类age吗？:"+age);
		//上面经验证是打印的子类中的age,为里访问父类的age，
		//引入关键字 super ，并验证是否输出父类age
		System.out.println("name:"+name+"\t"+"这是父类age吗？:"+super.age);
	}
}
class ExtendsDemo1 { //
	public static void main(String[] args) {
		Student s = new Student();
		s.showStu();
	}
}
