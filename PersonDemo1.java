/**
@Yq
���캯��--�Ļ������巽ʽ������
��������--�ص㣬�빹�캯�����𣬸����ж����ʼ���������ڹ��캯��ִ��
*/
class PersonDemo1 {
	public static void main(String[] args) {
		Person p1 = new Person();// ������һ��Person��Ŀղ����Ķ���
		Person p2 = new Person("����");// ������һ��Personl��ľ���name���ԵĶ���
		Person p3 = new Person("����",32);// ������һ��Person��ľ���name��num�������ԵĶ���
		p1.setName("����");
		System.out.println(p1.getName());
	}
}

class Person{// ����һ���࣬��������������˾�����������������
	private String name;// �Ժ�Ŀ����ж���Ҫ�Ա�������˽�л�
	private int num;{// ������һ�ι������飬��ʵ�ʿ��������У����Կ����ʵ�
		System.out.println("cry");
	}
	Person(){// һ���ղ����Ĺ��캯��
		System.out.println("name:"+name+".."+"num="+num);
	}
	Person(String name){// һ���߱�name�����Ĺ��캯��
		System.out.println("name:"+name+".."+"num="+num);
	}
	Person(String name,int num){// һ���߱��������ԵĹ��캯��
		System.out.println("name"+name+".."+"num="+num);
	}
	/* ע�⣬���еĹ��캯��ֻ�ڳ�����ִ��һ�Σ��Ҷ����ѽ������Զ����У����ڳ�ʼ��ֵ
	 * ����ͨ�ķ���������������Ҫ�����ò����У���ͨ������������á�
	 */
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
}