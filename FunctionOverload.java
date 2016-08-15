/**
函数重载，含义，重载条件，代码复用性，
需求：
利用重载函数将99乘法表和任意数值的乘法表打印出来
*函数重载只要是参数列表不同就可以实现重载，如下面实例中，两个函数虽然函数（方法）名称一样，
但是其参数类型和形式参数是不同的。
*下面代码中还体现了函数对于代码的复用性提高，函数可定义后随意调用至调用者。
*/
class FunctionOverload { //
    public static void main(String[] args) {
        for99();
        for99(5);
        for99(10);
    }
    public static void for99() {
        for99(9);
        System.out.println("---------------------------");
    }
    public static void for99(int num) {
        for (int x=0; x<=num ; x++ ) {
            for (int y=1; y<=x ; y++ ) {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
}
