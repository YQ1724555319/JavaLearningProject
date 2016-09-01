package string.stringdemo1;
/**
 * String-常见功能-获取和判断&转换
 */
public class StringDemo1 {
	/**
	 * 常见功能-获取
	 */
	public static void methodGet() {
		String s = "abcdefgbch";
		printGet(s.length()); // 获取字符串的长度
		System.out.println(s.charAt(3)); // 根据位置获取所在位置的字符
		//printGet(s.charAt(100)); // 如果获取长度以外的角标，会出现字符串角标越界异常StringIndexOutOfBoundsException
		printGet(s.indexOf('b')); // 获取指定字符在字符串中第一次出现的位置
		printGet(s.indexOf('m')); // 或取字符串中没有的字符时，会找不到，返回-1, 
		printGet(s.indexOf('b',3)); // 获取指定字符在指定位置后字符串中的位置
		printGet(s.indexOf("bc")); // 获取指定的字符串在字符串中的位置
		printGet(s.indexOf("bc", 3));// 获取指定字符串在指定位置后字符串中的位置
		printGet(s.lastIndexOf("b")); // 反向索引字符串的位置，但是角标不变
	}
	/**
	 * 常见功能-判断
	 */
	public static void methodIs() {
		String s1 = "StringDemo1.java";
		String s2 = "StringDEMO1.java";
		printIs(s1.startsWith("String")); // 判断字符串是否以指定子串开始
		printIs(s1.endsWith(".java")); // 判断字符串是否以指定子串结尾，可用于判断文件格式
		printIs(s1.contains("Demo")); // 判断字符串是否含有指定子串
		printIs(s1.isEmpty()); // 判断字符串是否有内容，原理是判长度是否为0，false则有内容
		printIs(s1.equals(s2)); // 判断两个字符串的内容是否相同
		printIs(s1.equalsIgnoreCase(s2)); // 判断两个字符串的内容是否相同并且忽略大小写。
	}
	/**
	 * 常见功能-转换
	 */
	public static void methodTrans() {
		char[] chs = {'a','b','c','d','e'};
		String st = "String";
		byte[] b = {1,2,3};
		String s = new String(chs); // 将字符型数组转换成字符串
		printString("char-to-String:"+s);
		printString(String.copyValueOf(chs)); //同上，静态方法
		String s1 = new String(chs,2,2); // 将字符数组中的一部分转换成字符串，指定位置后的长度
		printString(s1);
		printString(String.copyValueOf(chs, 2, 3)); // 同上，静态方法
		
		char[] chs1 = st.toCharArray(); // 将字符串转换为字符数组
		for (int i = 0; i < chs1.length; i++) {
			printString("chars--st="+chs1[i]);
		}
		
		String s2 = new String(b); // 将字节数组转换为字符串
		printString("bytes-to-String:"+s2);
		byte[] b1 = st.getBytes(); // 将字符串转换为字节数组
		for (int i = 0; i < b1.length; i++) {
			printString("bytes--st="+b1[i]);
		}
	}
	/**
	 *常见功能-替换
	 */
	public static void methodReplace() {
		String sr = "HelloWorld";
		String nsr = new String(sr.replace('d', 'c')); // 替换字符
		String nsr1 = new String(sr.replace('c','f')); // 如果要替换的字符不存在则返回原字符串
		String nsr2 = new String(sr.replace("World", "Java")); // 替换字符串
		printString("nsr="+nsr);
		printString("nsr1="+nsr1);
		printString("nsr2="+nsr2);
	}
	/**
	 *常见功能-切割
	 */
	public static void methodSplit() {
		String ss = "ZhangSan,LiSi,WangEr";
		String[] sss = ss.split(",");
		for(int i = 0;i < sss.length;i++) {
			printString(sss[i]);
		}
	}
	/**
	 * 常见功能-字串，获取子串中的一部分
	 */
	public static void methodsubsstring() {
		String sub = "abcdefg";
		String subs = new String(sub.substring(2)); // 获取指定位置开始到结尾之后的字串，如果角标不存在，脚标越界异常
		String subs1 = new String(sub.substring(2, 4)); // 获取范围内的子串，包含头不包含尾
		printString(subs);
		printString(subs1);
	}
	/**
	 * 常见功能-转换，去空格，比较
	 */
	public static void method7() {
		String s7 = "    Hello World   ";
		printString(s7.toUpperCase()); // 全部转换为大写
		printString(s7.toLowerCase()); // 全部转换为小写
		printString(s7.trim()); // 去除两端空格
		
		String s7_1 = "abc";
		String s7_2 = "aaa";
		int x = s7_1.compareTo(s7_2); // 两字符串自然顺序比较，这里比较到1位
		System.out.println(x);
	}
	public static void printString(String s) { //打印字符串
		System.out.println(s);
	}
	public static void printGet(int i) {
		System.out.println(i); // 打印Get中的int型值
	}
	public static void printIs(boolean b) {
		System.out.println(b); // 打印Is中的boolean型值
	}
	public static void main(String[] args) {
		//methodGet();	// 获取
		//methodIs(); // 判断
		//methodTrans(); // 转换
		//methodReplace(); // 替换
		//methodSplit(); // 切割
		//methodsubsstring(); // 获取子串中的一部分
		method7(); // 转换，去空格，比较
	} 
}
