/**
@Yq
�̳г�ʶ
*/
/**
*����һ������
*/
class Person { //
	String name;
	int age;
}
/**
*���Ǽ̳���Person������������Student
*/
class Student extends Person {
	void study(){
		System.out.println("Student--"+name+"\t"+age+"\t"+"good study");
	}
}
/**
*���Ǽ̳��Ը���Person������Worker
*/
class Worker extends Person {
	void work()	{
		System.out.println("Worker--"+name+"\t"+age+"\t"+"good work");
	}
 }
class ExtendsDemo {
	public static void main(String[] args) {
		// �ֱ𴴽�����������󣬲���ֵ,���÷���ʵ�����
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