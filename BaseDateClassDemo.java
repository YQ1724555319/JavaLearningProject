package basedateclass.demo;
/**
 * 基本数据类型包装类及一些常用操作
 */
public class BaseDateClassDemo {
	// 基本数据类型转字符串
	public static void baseDateToString() { 
		sop(Integer.toString(1234)); // 将1234转换为字符串
	}
	// 字符串转基本数据类型
	public static void stringToBaseDate() { 
		int a = Integer.parseInt("123"); // 将字符串转换为指定基本数据类型，静态方法
		sop("toBaseDate="+(a+3)); // 并运算检验
		
		Integer i = new Integer("112");
		sop("i= "+(i.intValue()+2)); // 将字符串转换为基本数据类型,非静态方法
		
		boolean t = Boolean.parseBoolean("true");
		if(t) {
			sop("yes, this true");
		}
	}
	// 进制互转
	public static void scaleParse() { 
		sop(Integer.toBinaryString(6)); // 转换为二进制并返回字符串
		sop(Integer.toHexString(60)); // 转换为十六进制
		sop(Integer.toOctalString(12)); // 转换为八进制
		int x = Integer.parseInt("110",2); // 将指定进制的数转换为十进制
		sop("x= "+x);
	}
	public static void sop(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseDateToString(); // 基本数据类型转字符串
		stringToBaseDate(); // 字符串转基本数据类型
		scaleParse(); // 进制互转
	}
}
