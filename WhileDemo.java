/**
while循环，格式，特性，两种循环模式。
while循环语句练习项目
需求：
*/
class WhileDemo { //
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        System.out.println("while循环前x="+x);
        while(x<0) {
            System.out.println("x="+x);
            x++;
            y++;
            System.out.println("第"+y+"次循环结束");
        }
        System.out.println("while循环结束后x="+x);
        //do while循环练习
        int z = 0;
        int w = 0;
        System.out.println("do while循环前z="+z);
        do {
            System.out.println("z="+z);
            z++;
            w++;
            System.out.println("第"+w+"次循环结束");
        } while (z<0);
        System.out.println("do while循环结束后z="+z);
        System.out.println("Hello Java!");
    }
}
