/**
@Yq
面向对象--接口初识，关键字（interface(接口)，，implements(实现)）
*/
/**
定义一个接口，其中有一个常量和一个抽象方法
*/
interface Inter { // 定义接口
	// 接口成员变量格式
    public static final int NUM = 12;
	// 接口成员函数格式
    public abstract void show();
}

/**
定义一个类，并且这个类将实现Inter接口
*/
class Test implements Inter {
	 // 重写接口中的show方法
    public void show() {
        System.out.println("这个类实现了接口Inter:"+NUM);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        new Test().show();
		// 对象，接口，子类都可调用接口中的变量NUM,因为它是全局的
        System.out.println("对象调用："+new Test().NUM);// 对象调用成员
        System.out.println("接口名调用"+Inter.NUM);// 接口名调用成员
        System.out.println("类名调用"+Test.NUM);// 类名调用成员
		//new Test().NUM = 4; //是无法为接口中的变量重新赋值的，编译错误
    }
}