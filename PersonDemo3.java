/**
@Yq
����this�ؼ������ڵ������й��캯������ʾ����
*/
class PersonDemo3
	{
	public static void main(String[] args) {
		Person p1 = new Person("����",23);
		p1.printParam();
	}
}

class Person {
    private String name;
    private int age;
    public Person(){}
    public Person(String name){
        this(); // �����޲ι��췽��
        this.name = name;
    }
    public Person(String name,int age){
        this(name);// ����һ���вι��췽��
        this.age = age;
    }
    public void printParam(){
        System.out.println(name+"\t"+age);
    }
}