/**
@Yq
这是this关键字用于调用类中构造函数的演示程序
*/
class PersonDemo3
	{
	public static void main(String[] args) {
		Person p1 = new Person("张三",23);
		p1.printParam();
	}
}

class Person {
    private String name;
    private int age;
    public Person(){}
    public Person(String name){
        this(); // 调用无参构造方法
        this.name = name;
    }
    public Person(String name,int age){
        this(name);// 调用一个有参构造方法
        this.age = age;
    }
    public void printParam(){
        System.out.println(name+"\t"+age);
    }
}