package stringbuffer.demo1;
/**
 * StringBuffer-增删改查
 * StringBuilder是在JDK1.5后出现的类，是不同步的，将 StringBuilder 的实例用于多个线程是不安全的。如果需要这样的同步，则建议使用 StringBuffer
 * 在StringBuilder中的所有方法都是和StringBuffer一样的，唯一不同就是在同步支持上，是为了提高效率，以后开发建议使用StringBuilder
 */
public class StringBufferDemo1 {
	// 存储，添加，插入
	public static void method_add() {
		StringBuffer sb = new StringBuffer(); // 新建StringBuffer对象
		sb.append("hello ").append(true).append(123); // 末尾添加
		sop(sb.toString()); // hello true123
		
		sb.insert(6,"world ");  // 指定位置插入
		sop(sb.toString()); // hello world true123
	}
	// 删除
	public static void method_del() {
		StringBuffer sb = new StringBuffer("abcdefg");
		sb.delete(2, 4); // 删除指定位置间的缓冲区数据，包含头不含尾
		sop(sb.toString());
		sb.deleteCharAt(3); // 删除指定位置的字符
		sop(sb.toString());
		sb.delete(0, sb.length()); //清空缓冲区
		sop("清空："+sb.toString());
	}
	// 获取
	public static void method_get() {
		StringBuffer sb = new StringBuffer("ABCDEFaBC");
		sop(""+sb.charAt(2)); // 获取指定位置的字符
		sop(""+sb.indexOf("C")); // 获取字符串的第一次出现的位置
		sop(""+sb.lastIndexOf("C")); // 获取字符串最后一次出现的位置
		sop(""+sb.length()); // 获取缓冲区的长度
		sop(sb.substring(2,4)); // 获取指定区间的子串
	}
	// 修改
	public static void method_update() {
		StringBuffer sb = new StringBuffer("abcdefg");
		sb.replace(0,4,"java").toString(); // 替换指定区间的字符串
		sb.setCharAt(6, 'h'); // 替换指定位置的字符
		sop(sb.toString()); 
	}
	// 反转
	public static void method_reverse() {
		StringBuffer sb = new StringBuffer("abcdefg");
		sb.reverse(); // 反转字符串缓冲区中的数据
		sop(sb.toString());
	}
	// 获取并存储至数组
	public static void method_getChars() {
		StringBuffer sb = new StringBuffer("abcdefg");
		char[] chs = new char[5];
		sb.getChars(0,3,chs,1); // 获取指定索引间的字符串，并将字符串从数组的指定位置开始存储
		for(int x=0;x<chs.length;x++) {
			sop("chs["+x+"]"+"--"+chs[x]+";");
		}
	}
	public static void sop(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method_add(); // 存储
		//method_del(); // 删除
		//method_get(); // 获取
		//method_update(); // 修改
		//method_reverse(); // 反转
		method_getChars(); // 将指定索引区间的字符串存储到数组
	}
} 
