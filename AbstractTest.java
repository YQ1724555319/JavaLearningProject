/**
@Yq
������--ʵ����ϰ
�ּ�������д��һ��������Ҫ��ĳ��˾��Ա�����н�ģ��
Ա�����У����������ţ������������ԣ�����Ҳ��Ա�������˾�����ͨԱ���������⣬
����������� ���� ���ԣ����ü̳е�˼�붨���Ա����;����࣬���ṩ��Ҫ�Ĺ���������ʽ

*/
public class  AbstractTest{
	public static void main(String[] args) {
		new General("�չ�",100,2000).work();
		new Manager("����",101,3000,500).work();
	}
}
/**
����Ա���࣬�����������������ԣ�
*/
abstract class Employee {
	// �������Զ���
	String name;
	int id;
	double pay;
	// ��ʼ��
	Employee(String name,int id,double pay) {
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	// ��������
	abstract void work();
}
/**
������ͨԱ����,���Ҽ̳���Employee��
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
���徭���࣬���Ҽ̳���Employee��
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