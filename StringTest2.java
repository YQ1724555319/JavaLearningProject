package string.stringtest2;
/**
 * 字符串练习二：将字符串反转
 * 1.思路，将字符串变成数组
 * 2.将数组反转
 * 3.将反转后的数组变成字符串
 * 尽量的让功能细化，这样在修改和阅读时都会有好处
 */
public class StringTest2 {
	// 反转字符串中指定范围的字符，但取头不取尾
	public static String reverseString(String s,int start,int end) {
		// 将字符串变成数组
		char[] chs = s.toCharArray();
		// 将数组反转
		reverse(chs,start,end);
		// 将反转后的数组变成字符串
		return new String(chs);
	}
	// 反转整串字符串
	public static String  reverseString(String s) {
		return reverseString(s,0,s.length()-1);
	}
	// 反转操作
	public static void reverse(char[] arr,int x,int y) {
		for(int start = x,end = y-1;start < end;start++,end--) {  // 取头不取尾
			swap(arr,start,end);
		}
	}
	// 换位操作
	public static void swap(char[] arr,int x,int y) {
		char temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdef";
		System.out.println("notReverse："+s);
		s = reverseString(s,0,3);
		System.out.println("yetReverse："+s);
	}
}
