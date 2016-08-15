/**
数组概念和定义方法，栈内存，堆内存的特性。
需求：
*/
class ArrayDemo { //
    public static void main(String[] args) {
    int[] x = new int[5];//定义一个数组，数组元素个数为5，可存储5个整数
    x[0] = 666;//定义数组中0角标位元素值为666
    //x = null;如果将数组定义为null，数组为空。
    System.out.println("数组x的1角标元素值为："+x[1]);//打印数组x中的1角标位的元素值
    System.out.println("数组x的0角标元素值为："+x[0]);//打印数组x中的0角标位的元素值
    System.out.println(x[5]);//角标越界错误
    //第二种数组定义格式
    int[] arr = new int[] {1,2,3};
}
}
