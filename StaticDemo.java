/**
@Yq
static����̬���ؼ��ֵĳ�ʶ��ϰ
�����������еĳ�Ա�����ͳ�Ա������
�ڷ�������ʱ��������ڶ�������й������ԣ�
����������н����������������Ϊ��̬��
*/
class StaticDemo {
	public static void main(String[] args) {
		Person p1 = new Person("zhangsan");
		Person p2= new Person("lisi");
		Person.show(); //���������þ�̬���εķ���
	}
}

class Person {
	private String name; // һ����ͨ�ĳ�Ա����
	private static String country = "China"; // һ����static��̬���ι��ĳ�Ա����
	Person(String name){
		this.name = name;
		System.out.println("name:"+name+"\t"+"country:"+country);
	}
	static void show(){ // ��̬���εķ���
		System.out.println("�ұ�����ֱ�ӵ��ã���Ϊ�ұ�static����--"+country);
	}
}