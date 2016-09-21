package collection.list.vector;

import java.util.*;

/**
 * 集合框架-list-vector中的枚举
 * Vetor是在集合框架之前的版本就有的，和ArrayList是类似的，区别在于同步与否
 */
public class VectorDemo {
	public static void vectorMethod() {
		Vector v = new Vector();
		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");
		// Vetor特有的元素取出方式：枚举，和迭代器类似
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vectorMethod();
	}

}
