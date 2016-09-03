package string.stringtest3;
/**
 * 字符串练习三：获取字符串中另一个字符串出现的次数
 * 思路：
 * 1.定义一个计数器
 * 2.获取要查找字符串第一次出现的位置并记录
 * 3.从第一次出现的位置以后剩下的字符串中查找这个字符串的位置并记录
 * 4.当查找不到杂贺哥字符串的时候，查找结束，返回计数器
 */
public class StringTest3 {
	/**
	 * 练习三 -方式一
	 * @param str 需要查找的字符串
	 * @param key 需要查找的子串
	 * @return  返回子串在字符串中出现的次数
	 */
	public static int getSubCount(String str,String key) {
		int count = 0; // 记录key出现的次数
		int index = 0; // 要查找的字符串出现的位置
		
		while((index = str.indexOf(key)) != -1) { // 如果查找的位置不为-1，则继续查找
			// 当查找到子串第一次出现的位置，就将字符串变成子串位置加上子串的长度位置之后剩下的字符串
			System.out.println("str:"+str);
			str = str.substring(index+key.length());
			count++; // 每找到一次就计数一次
		}
		return count;
	}
	/**
	 * @param str 需要查找的字符串
	 * @param key 需要查找的子串
	 * @return 返回子串在字符串中出现的次数
	 */
	public static int getSubCount_2(String str,String key) {
		int count = 0;
		int index = 0;
		
		while((index = str.indexOf(key,index)) != -1) { // 从index位置开始查找key第一次出现的位置
			System.out.println("index="+index); 
			index = index+key.length(); // 将index的值置为
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abccdsaccgsgccfadfcc";
		String sub = "cc";
		int count = getSubCount(str,sub);
		System.out.println("subStringCount---"+count);
		int count1 = getSubCount_2(str,sub);
		System.out.println("subStringCount1---"+count1);
	}

}
