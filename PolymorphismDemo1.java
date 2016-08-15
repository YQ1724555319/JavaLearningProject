/**
@Yq
多态练习，结合工具类提高代码复用性
现假设某培训机构有两个班级，一个基础班，一个进阶班，两个班的学员都有姓名，年龄，都睡觉，但是其他班级都躺着睡
而基础班的同学是趴着睡，两个班都学习java，但是学习的内容分别是基础和进阶。利用多态的特性，
以及工具类的结合写出最优的方案以便往后扩展，主函数只作为程序的客户端进行调用
分析：
因为两个班的学生都有姓名，年龄，班级，睡觉，学java，现抽取这些共性内容定义一个学生类，并具有这些属性和方法
因为基本的睡觉是躺着睡，我们就在学生类里定义躺着睡的方法，到基础班学生继承时，对这个方法进行重写就可以了。
两个班都学java，但是，学的内容都不一样，而且方便后期拓展，我们将学习java的方法定义为抽象方法。
因为子类的两个班的对象都具有所有父类中的内容，所以，利用多态的特点，我们将父类的引用指向子类对象。
利用函数和工具类的封装等等特性对程序进行优化。
*/
/**

*/
abstract class Students {
	String name;
	int age;
	String stuClass;
	Students(String name,int age,String stuClass) {
		this.name = name;
		this.age = age;
		this.stuClass = stuClass;
		System.out.println("name--"+name+"\n"+"age--"+age+"\n"+"class--"+stuClass+"\n"+"-----------------");
	}
	public void sleep() {
		System.out.println(stuClass+name+"躺着睡");
	}
	public abstract void study();
}
/**
定义一个工具类，让主函数调用
*/
class ShowStu {
	public void showStu(Students s) {
		s.sleep();
		s.study();
	}
}
/**

*/
class BaseStudents extends Students {
	BaseStudents(String name,int age,String stuClass) {
		super(name,age,stuClass);
	}
	public void sleep() {
		System.out.println(stuClass+name+"趴着睡");
	}
	public void study() {
		System.out.println(stuClass+name+"学java基础"+"\n"+"-----------------");
	}
}
/**

*/
class AdvanceStudents extends Students {
	AdvanceStudents(String name,int age,String stuClass) {
		super(name,age,stuClass);
	}
	public void study() {
		System.out.println(stuClass+name+"学习java进阶"+"\n"+"-----------------");
	}
}
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		ShowStu x = new ShowStu();
		x.showStu(new BaseStudents("张三",17,"基础班"));
		x.showStu(new AdvanceStudents("李四",19,"进阶班"));
	}
}
