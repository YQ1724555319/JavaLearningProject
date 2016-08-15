/**
在十进制转换为十六进制的查表法中，发现十六进制的所有元素，
包含了二进制的元素，八进制的元素，还有十进制的元素，所以，
我们可以提取共性之处进行封装，封装为功能加以调用，
则可以实现多种进制的转换而节省代码量。
实现的功能：用户输入任意一个十进制数，可同时转换为三种进制并且打印。
需求：
*/
import java.util.Scanner;
class ArrayDemo8 { //
    public static void main(String[] args) {
        System.out.println("****【进制转换器】****");
        Scanner in = new Scanner (System.in);
        System.out.print("输入需要转换的十进制数：");
        int num=in.nextInt();
        fenge();
        trans(num);
    }
    /*
    十进制转换为二进制
    */
    public static void trans(int num) {
        toBin(num);
        toOct(num);
        toHex(num);
    }
    public static void toBin(int num) {
        System.out.println("十进制数："+num);
        System.out.print("转换为二进制：");
        trans(num, 1,1);
        fenge();
    }

    /*
    十进制转换为八进制
    */
    public static void toOct(int num) {
        System.out.println("十进制数："+num);
        System.out.print("转换为八进制：");
        trans(num, 7,3);
        fenge();
    }
    /*
    十进制转换为十六进制
    */
    public static void toHex(int num) {
        System.out.println("十进制数："+num);
        System.out.print("转换为十六进制：");
        trans(num, 15,4);
        fenge();
    }
    //进制
    public static void trans(int num,int yushu,int pys) {
        if (num==0) {
            System.out.println(0);
            return ;
        }
        //定义一个所有进制都适用的元素表
        char[] element = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //定义一个数组来进制转换数据，十进制最高位10，二进制最高位32，八进制最高位9，十六进制最高位15.取最大
        char[] arr=new char[32];
        //定义一个指针来操作数组
        int pos=arr.length;
        while (num!=0) {
            int temp = num & yushu;
            arr[--pos] = element[temp];//索引查表
            num = num >>>pys;
        }
        for (int x=pos; x<arr.length ; x++ ) {
            System.out.print(arr[x]);
        }

    }
    public static void fenge() {
        System.out.println();
        System.out.println("*****************************");
    }
}
