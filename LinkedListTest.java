package collection.list.linkedlist;
import java.util.*;
/**
 * 使用LinkedList来模拟一个堆栈和队列数据结构。
 * 堆栈结构：先进后出
 * 队列结构：先进先出
 */
class Stack { // 模仿一个堆栈结构
	private LinkedList link;
	Stack() {
		link = new LinkedList();
	}
	// 为堆栈添加元素
	public void stackAdd(Object obj) {
		link.addFirst(obj);
	}
	// 堆栈获取元素
	public Object stackGet() {
		return link.peekFirst();
	}
	// 堆栈删除元素
	public Object stackRemove() {
		return link.pollFirst();
	}
	// 判断堆栈是否为空
	public boolean stackIsEmpty() {
		return link.isEmpty();
	}
}
public class LinkedListTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.stackAdd("Test01");
		s.stackAdd("Test02");
		s.stackAdd("Test03");
		s.stackAdd("Test04");
		sop("First: "+s.stackGet());
		sop("remove: "+s.stackRemove());
		sop("First: "+s.stackGet());
		sop("isEmpty: "+s.stackIsEmpty());
	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
