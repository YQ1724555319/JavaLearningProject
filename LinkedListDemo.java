package collection.list.linkedlist;

import java.util.*;
/**
 * 集合框架-List-LinkedList(链表结构的集合)
 * 除了继承自List之外的方法，这里演示一些关于LinkedList中的特有的方法
 */
public class LinkedListDemo {
	public static void LinkedListMethod() {
		LinkedList link = new LinkedList();
		// 头部添加
		link.addFirst("java01");
		link.addFirst("java02");
		link.addFirst("java03");
		sop("addFirst is: "+link);
		// 尾部添加
		link.addLast("java04");
		link.addLast("java05");
		link.addLast("java06");
		sop("addLast is: "+link);
		// 获取头部
		sop("First is: "+link.peekFirst());
		// 获取尾部
		sop("Last is: "+link.peekLast());
		// 删除头部
		sop("remove is: "+link.pollFirst());
		sop("removeFist is: "+link);
		// 删除尾部
		sop("remove is: "+link.pollLast());
		sop("removeLast is: "+link);
		// 删除方法获取元素并删除，利用此特性将集合中的所有元素取出来，不用迭代器
		while(!link.isEmpty()) { // 当集合不为空则循环
			sop("get All: "+link.pollFirst()); // 循环体为逐个获取并删除元素
		}
	}

	public static void main(String[] args) {
		LinkedListMethod();
	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
