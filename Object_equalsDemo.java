/**
@Yq
Object¿‡£¨equals()∑Ω∑®
*/
/**

*/
class Person {
	private int age;
	Person(int age) {
		this.age = age;
	}
	public boolean equals(Object obj){
		if (!(obj instanceof Person)) {
			return false;
		}
		Person p =(Person)obj;
		return this.age == p.age;
	}
}
/**

*/
class Demo {

}
public class Object_equalsDemo {
	public static void main(String[] args) {
		Person p1 = new Person(2);
		Person p2 = new Person(9);
		Person p3 = p1;
		Demo d1 = new Demo();
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(d1));
	}
}
