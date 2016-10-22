package collection.list.arraylist;

import java.util.*;

/**
 * 集合框架-List-Arraylist练习2
 * 将自定义对象存储到ArrayList中，并去除相同对象
 * 比如：存储人对象，同姓名，同年龄视为相同
 */
class Person {
	private String name;
	private int age;
	Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age; 
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class ArraylistTset2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new Person("lisi01",20));
		al.add(new Person("lisi02",21));
		al.add(new Person("lisi03",22));
		al.add(new Person("lisi04",23));
		al.add(new Person("lisi04",23));
		
		//去除重复元素的操作
		al = (ArrayList) sigleElement(al);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			Person p = (Person)i.next(); //将迭代的对象强制转型为Person类型,使用第三方对象并且解决了next方法使用多次的情况出现
			sop(p.getName()+"::"+p.getAge());
		}
	}
	public static List sigleElement(ArrayList al) {
		// 定义一个临时容器
		ArrayList newAl = new ArrayList();
		// 创建一个迭代器，迭代并判断是否已存在此元素，不存在则将此元素添加到临时容器中
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(!newAl.contains(obj)) {
				newAl.add(obj);
			}
		}
		return newAl;
	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
