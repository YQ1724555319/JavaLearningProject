/**
@Yq
�������ʶ��abstract�ؼ���Ӧ��
*/
class AbstractDemo {
	public static void main(String[] args) {
		new Chinese().speak();
		new American().speak();
	}
}

/**
����һ����Person������abstract���Σ�����߱�speak����������û�й������⡣����abstract����
*/
abstract class Person { //
	abstract void speak();
	// �������еķǳ��󷽷�
	void sleep(){
		System.out.println("˯��");
	}
}
/**
����һ����Chinese���������̳���Person,��дspeak����
*/
class Chinese extends Person{ //
	void speak() {
		System.out.println("�� ˵ �� ��");
		super.sleep();
	}
}
/**
����һ���� American���������̳���Person,��дspeak����
*/
class American extends Person{ //
	 void speak() {
		System.out.println("I speak English");
		super.sleep();
	}
}