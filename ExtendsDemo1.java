/**
�Ӹ����б������ص㣬�ؼ���super�����ʸ����еı�����
*/
/**
����һ�����࣬�����ж��������name��age����ֵ
*/
class Person { //
	String name = "zhangsan";
	int age = 18;
}
/**
����һ���࣬�������̳���Person������࣬�����в���age����ֵ
�������Ƿ�������͸����г�����ͬ������������������󣬻Ὣ����age��������������age��
����һ��������ǲ�����ָ���������ͬ�������ģ�
*/
class Student extends Person{ //
	int age = 15;
	public void showStu(){
		System.out.println("name:"+name+"\t"+"��������age��:"+age);
		//���澭��֤�Ǵ�ӡ�������е�age,Ϊ����ʸ����age��
		//����ؼ��� super ������֤�Ƿ��������age
		System.out.println("name:"+name+"\t"+"���Ǹ���age��:"+super.age);
	}
}
class ExtendsDemo1 { //
	public static void main(String[] args) {
		Student s = new Student();
		s.showStu();
	}
}
