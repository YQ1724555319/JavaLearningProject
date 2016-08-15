/**
@Yq
抽象类--实例练习
现假设我们写个一个程序，需要对某公司的员工进行建模，
员工具有：姓名，工号，工资三个属性，经理也是员工，除了具有普通员工的属性外，
还具有特殊的 奖金 属性，利用继承的思想定义出员工类和经理类，并提供必要的公共方法方式

*/
public class  AbstractTest{
	public static void main(String[] args) {
		new General("普工",100,2000).work();
		new Manager("经理",101,3000,500).work();
	}
}
/**
定义员工类，并具有三个基本属性，
*/
abstract class Employee {
	// 三个属性定义
	String name;
	int id;
	double pay;
	// 初始化
	Employee(String name,int id,double pay) {
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	// 工作方法
	abstract void work();
}
/**
定义普通员工类,并且继承自Employee类
*/
class General extends Employee {
	General(String name,int id,double pay) {
		super(name,id,pay);
	}
	public void work() {
		System.out.println(super.name+"\t"+super.id+"\t"+super.pay);
		System.out.println("General work");
	}
}
/**
定义经理类，并且继承自Employee类
*/
class Manager extends Employee {
	double bonus;
	Manager(String name,int id,double pay,double bonus) {
		super(name,id,pay);
		this.bonus = bonus;
	}
	public void work() {
		System.out.println(super.name+"\t"+super.id+"\t"+super.pay+"\t"+bonus);
		System.out.println("Manager work");
	}
}