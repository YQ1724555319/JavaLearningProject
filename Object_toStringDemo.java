/**
@Yq
Object--toString()
*/
/**

*/
class Person {
	private int age;
	Person(int age) {
		this.age = age;
	}
	public String toString() {
		return	"age:"+age;
	}
}
public class Object_toStringDemo {
	public static void main(String[] args) {
		Person p1 = new Person(12);
		System.out.println(Integer.toHexString(p1.hashCode()));
		System.out.println(p1.toString());
		System.out.println(p1.getClass());
	}
}
