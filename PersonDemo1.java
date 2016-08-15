/**
@Yq
构造函数--的基本定义方式，特性
构造代码块--特点，与构造函数区别，给所有对象初始化，优先于构造函数执行
*/
class PersonDemo1 {
	public static void main(String[] args) {
		Person p1 = new Person();// 创建了一个Person类的空参数的对象
		Person p2 = new Person("张三");// 创建了一个Personl类的具有name属性的对象
		Person p3 = new Person("李四",32);// 创建了一个Person类的具有name和num两个属性的对象
		p1.setName("王二");
		System.out.println(p1.getName());
	}
}

class Person{// 定义一个类，这个类中声明了人具有姓名和年龄特性
	private String name;// 以后的开发中都需要对变量进行私有化
	private int num;{// 下面是一段构造代码块，在实际开发不常有，面试可能问道
		System.out.println("cry");
	}
	Person(){// 一个空参数的构造函数
		System.out.println("name:"+name+".."+"num="+num);
	}
	Person(String name){// 一个具备name参数的构造函数
		System.out.println("name:"+name+".."+"num="+num);
	}
	Person(String name,int num){// 一个具备两个特性的构造函数
		System.out.println("name"+name+".."+"num="+num);
	}
	/* 注意，所有的构造函数只在程序内执行一次，且对象已建立就自动运行，用于初始化值
	 * 而普通的方法（函数），需要被调用才运行，普通方法被对象调用。
	 */
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
}