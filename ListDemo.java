package collection.list;

import java.util.*;

/**
 * List接口中的常见方法：
 */
public class ListDemo {
	public static void method_List() {
		ArrayList a1 = new ArrayList();
		a1.add("杨同学");
		a1.add("张同学");
		a1.add("张惠妹同学");
		a1.add("张三同学");
		sop("原集合为："+a1);
		// 在指定位置添加元素
		a1.add(1,"稀饭");
		sop("添加后集合为："+a1);
		sop("you happy jiu hao");
		//删除指定位置的元素
		a1.remove(3);
		sop("删除后集合为："+a1);
		// 修改指定位置的元素
		a1.set(3, "李四同学");
		sop("修改后的元素为："+a1);
		// 获取指定位置的元素
		sop("get(0):"+a1.get(0));
		// 获取所有元素
		for(int x = 0;x < a1.size();x++) {
			sop("a1.get("+x+")="+a1.get(x));
		}
		// 迭代器获取所有元素
		for(Iterator T1 = a1.iterator();T1.hasNext();) {
			sop("迭代："+T1.next());
		}
		// 返回指定子列表
		sop("subList(0,2):"+a1.subList(0,2));
		
		// 通过IndexOf获取对象的位置
		sop("indexOf:"+a1.indexOf("张同学"));
		
		// listerator,list中的特有的迭代器，可实现增删改查
		ArrayList a2 = new ArrayList();
		a2.add("java01");
		a2.add("java02");
		a2.add("java03");
		a2.add("java04");
		sop("原集合"+a2);
		
		ListIterator I1 = a2.listIterator(); 
		while(I1.hasNext()) {
			Object obj = I1.next();
			if(obj.equals("java02")) {
				//I1.add("java0002"); // 迭代时添加
				//I1.remove(); // 迭代时删除
				I1.set("java0002"); // 迭代时修改元素
			}
		}
		sop("改后集合"+a2);
		// list迭代器逆向遍历列表，并逆向返回元素，List特有
		while(I1.hasPrevious()) {
			sop(""+I1.previous());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_List(); // List接口中的常见方法
	}
	public static void sop(String s) {
		System.out.println(s);
	}
}
