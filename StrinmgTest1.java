package string.stringtest1;
/**
 * @author struggleYang
 *字符串练习一：模拟一个trim方法，去掉字符串首尾的空格，用charAt,和substring
 */
public class StringTest1 {
	public static void myTrim(String s) {
		int start = 0; 
		int end = s.length()-1;
		
		while(start < end & s.charAt(start) == ' ') { //判断是否为空，如果为空则移到下一个角标继续判断,不是则停止循环
			start++;
		}
		while(start < end & s.charAt(end) == ' ')  { //判断是否为空，如果为空则移到上一个角标继续判断，不是则停止循环
			end--;
		}
		
		String s1 = s.substring(start,end+1); // 去除空格
		System.out.println("s1:"+s1); // 已去除空格
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "    hello java    ";
		System.out.println("s:"+s); // 未去除空格
		myTrim(s); 
	}

}
