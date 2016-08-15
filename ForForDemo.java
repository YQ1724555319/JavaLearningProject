/**
需求一：利用for嵌套循环打印三角形。
*****		*
****		**
***			***
**			****
*			*****
*/
class ForForDemo { //
    public static void main(String[] args) {
        System.out.println("for循环嵌套练习题，务必查看源代码理解for嵌套原理");
        System.out.println("--------------------------------------------");
        for (int x = 0; x < 5 ; x++ ) { //控制行数
            for (int y = x; y < 5 ; y++ ) { //控制列数
                System.out.print("*");
            }
            System.out.println("");//只起到换行作用
        }
        System.out.println("--------------------------------------------");
        //尖朝下，可以初始化值，让初始化值随着外循环变化
        //尖朝上，可以改变条件，让条件随着外循环变化
        for (int x = 0; x < 5 ; x++ ) { //控制行数
            for (int y = 0; y <= x ; y++ ) { //控制列数,改变条件
                System.out.print("*");
            }
            System.out.println("");//只起到换行作用
        }
        System.out.println("--------------------------------------------");
        /*
        需求二：利用for循环嵌套打印：

        1
        12
        123
        1234
        12345

        */
        for (int x=0; x<=5; x++ ) {
            for (int y=1; y<=x; y++ ) {
                System.out.print(y);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        /*
        需求三：打印九九乘法表
        1*1=1
        1*2=2 2*2=4
        1.3=3 2*3=6 3*3=9
        ……
        */
        System.out.println("九九乘法表:");
        for (int x=1; x<=9; x++ ) { //被乘数
            for (int y=1; y<=x; y++ ) { //乘数
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }

    }
}
