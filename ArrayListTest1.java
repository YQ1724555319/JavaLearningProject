package collection.list.arraylist;
import java.util.*;
/**
 * 集合框架-List-ArrayList练习1
 * 去掉ArrayList中的重复元素
 */
public class ArrayListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("java01");
		al.add("java02");
		al.add("java01");
		al.add("java02");
		al.add("java03");
		sop(al);
		sop(sigleElement(al));
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
	// print
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
