package string.stringtest4;
/**
 *字符串练习四-获取两个字符串中最大的相同子串，第一个动作，将短的子串长度依次递减的子串打印
 */
public class SringTest4 {
	public static String getMaxSubString(String s1,String s2) {
		// 解决传递的长短字符串位置不同导致的运算错误，对传入的字符串进行判断,就是说不论用户先对长短字符串的传入顺序是如何的，都可以运算出结果
		String max = "",min = "";
		max = s1.length() > s2.length()? s1:s2; // 如果s1的长度大于s2的长度，则max=s1,否则等于s2，确定长字符串
		min = (max==s1)?s2:s1; // 如果s1是长字符串，则s2就是短字符串，如果不是则s2是长字符串，s1是短字符串
		System.out.println("max="+max+"----min="+min);
		// 两个for循环，控制短字符串长度按照头尾依次递减取出子串，如"abchellods",第一次取"abchellod"&"bchellods",以此类推
		for(int x = 0;x < min.length();x++) { 
			for(int y = 0,z = min.length() - x;z!=min.length()+1;y++,z++) {
				String temp = min.substring(y,z);
				//System.out.println(temp); // 将短串长度首尾依次递减的子串打印
				if(max.contains(temp)) { // 如果依此递减的子串包含在大的字符串中，则将这个子串返回
					return temp;
				}
			}
		}
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "avshelloahja";
		String s2 = "abhello";
		System.out.println(getMaxSubString(s1,s2));
	}

}
