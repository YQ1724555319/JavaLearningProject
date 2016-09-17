package collection;
import java.util.*;

/**
 * add方法的参数类型是Object。以便于接受任意类型的对象。
 * 集合中存储的都是对象的引用(地址)，而不是对象实体。
 */
public class CollectionDemo {
	public static void baseMethod() {
		// 创建一个集合容器，利用Collection的子类对象ArrayList
		ArrayList a1 = new ArrayList();
		// 1. 添加元素
		a1.add("java01"); // add(Object obj);接收任何对象
		a1.add("java02");
		a1.add("java03");
		a1.add("java04");

		// 打印原集合
		sop("a1原集合:"+a1);
		// 删除元素
		a1.remove(1); // 删除单个元素
		sop("a1修改后集合:"+a1);
		//a1.clear(); // 删除所有元素
		sop("a1修改后集合:"+a1);

		//判断元素
		sop("判断java03是否存在："+a1.contains("java03"));
		sop("集合是否为空："+a1.isEmpty());
		// 2. 获取集合长度
		sop("size="+a1.size());
		sop("`-`大美女`-`");
	}
	
	public static void method_2() {
		ArrayList a1 = new ArrayList();
		a1.add("java01"); 
		a1.add("java02");
		a1.add("java03");
		a1.add("java04");
		
		ArrayList a2 = new ArrayList();	
		a2.add("java01"); 
		a2.add("java02");
		a2.add("java05");
		a2.add("java06");
		
		//a1.retainAll(a2); // 取交集，a1中只保留和a2相同的元素
		//a1.removeAll(a2); // 将a1中与a2相同的元素的元素去除
		a1.addAll(a2); // 将a2中的所有元素添加到a1中
		sop("a1:"+a1);
		sop("a2:"+a2);
	}
	/**
	 * 迭代器，获取集合中的元素
	 */
	public static void method_get() {
		ArrayList a1 = new ArrayList();
		a1.add("java01"); 
		a1.add("java02");
		a1.add("java03");
		a1.add("java04");
		
		Iterator I1 = a1.iterator(); // 获取迭代器，用于取出集合中的元素
		while(I1.hasNext()) { // 如果仍有元素可以迭代，则返回true
			sop(""+I1.next()); // next()返回迭代的下一个元素
		}
		/*
		for(Iterator I1 = a1.iterator();I1.hasNext(); ) { // 可以避免内存的占用，吧I1对象定义在for循环使之成为局部变量
			sop(""+I1.next());
		}
		*/
	}
	public static void main(String[] args) {
		// baseMethod(); // Collection接口中的常见基本方法，添加，删除，判断
		// method_2(); // 有关两个集合之间的操作方法，取交集，取交集之外
		method_get(); // 获取元素，迭代器
		 
	}
	public static void sop(String s) {
		System.out.println(s);
	}
}
