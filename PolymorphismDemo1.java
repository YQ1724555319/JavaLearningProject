/**
@Yq
��̬��ϰ����Ϲ�������ߴ��븴����
�ּ���ĳ��ѵ�����������༶��һ�������࣬һ�����װ࣬�������ѧԱ�������������䣬��˯�������������༶������˯
���������ͬѧ��ſ��˯�������඼ѧϰjava������ѧϰ�����ݷֱ��ǻ����ͽ��ס����ö�̬�����ԣ�
�Լ�������Ľ��д�����ŵķ����Ա�������չ��������ֻ��Ϊ����Ŀͻ��˽��е���
������
��Ϊ�������ѧ���������������䣬�༶��˯����ѧjava���ֳ�ȡ��Щ�������ݶ���һ��ѧ���࣬��������Щ���Ժͷ���
��Ϊ������˯��������˯�����Ǿ���ѧ�����ﶨ������˯�ķ�������������ѧ���̳�ʱ�����������������д�Ϳ����ˡ�
�����඼ѧjava�����ǣ�ѧ�����ݶ���һ�������ҷ��������չ�����ǽ�ѧϰjava�ķ�������Ϊ���󷽷���
��Ϊ�����������Ķ��󶼾������и����е����ݣ����ԣ����ö�̬���ص㣬���ǽ����������ָ���������
���ú����͹�����ķ�װ�ȵ����ԶԳ�������Ż���
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
		System.out.println(stuClass+name+"����˯");
	}
	public abstract void study();
}
/**
����һ�������࣬������������
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
		System.out.println(stuClass+name+"ſ��˯");
	}
	public void study() {
		System.out.println(stuClass+name+"ѧjava����"+"\n"+"-----------------");
	}
}
/**

*/
class AdvanceStudents extends Students {
	AdvanceStudents(String name,int age,String stuClass) {
		super(name,age,stuClass);
	}
	public void study() {
		System.out.println(stuClass+name+"ѧϰjava����"+"\n"+"-----------------");
	}
}
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		ShowStu x = new ShowStu();
		x.showStu(new BaseStudents("����",17,"������"));
		x.showStu(new AdvanceStudents("����",19,"���װ�"));
	}
}
