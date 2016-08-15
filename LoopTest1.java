/**
while循环和for循环的区别，累加思想
思想：累加思想。
需求：求1~10的和。并打印出最终结果。
思路：1+2+3+4……
	0+1
	1+2
	3+3
	6+4
	……
定义两个变量来存储相加两边不同的值。
*/
class LoopTest1 { //
    public static void main(String[] args) {
        int sum = 0;
        //定义一个变量存储两数相加的和。
        int i = 1;
        //定义一个变量存储不断变化的数。
        while(i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("(while)1~10的和为："+sum);
        i=1;
        //用for来表现
        int sum1 = 0;
        for(i=1; i<=10; i++) {
            sum1 = sum1 + i;
        }
        System.out.println("(for)1~10的和为："+sum1);
        System.out.println("Hello Java!");
    }
}
