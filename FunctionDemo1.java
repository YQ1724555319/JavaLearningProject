/**
理解函数（方法）所具有的提升代码复用性，共性封装，返回值，无返回值。
需求：用定义函数的方式打印矩形，打印99乘法表。
*/
class FunctionDemo1 { //
    public static void main(String[] args) {
        juxing(5,5);
        fenge();
        juxing(5,9);
        fenge();
        for99();
        fenge();
        OUT();
    }
    public static void juxing(int h,int w) {
        for (int x=0; x<h ; x++ ) {
            for (int y=0; y<w ; y++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void fenge() {
        System.out.println("-----------------------");
    }
    public static void for99() {
        for (int x=1; x<=9 ; x++ ) {
            for (int y=1; y<=x ; y++ ) {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
    public static void OUT() {
        System.out.println("调用我吧");
    }
}
