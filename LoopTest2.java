/**
思想：计数器思想。
需求：1~100之间，7的倍数的个数
思路：
1.定义一个变量存储个数。（计数器）
2.通过if语句操作是7的倍数的数值。（语句嵌套）
*/
class LoopTest2 { //
    public static void main(String[] args) {
        int number = 0;
        for (int x = 1; x<=100; x++) {
            if(x%7==0) {
                number++;
            }
        }
        System.out.println("1-100之间，7的倍数的个数为："+number);
        System.out.println("Hello Java!");
    }
}
