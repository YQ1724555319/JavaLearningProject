/**
函数初识，定义，调用，赋值，基本格式
*/
class FunctionDemo { //
    public static void main(String[] args) {
        System.out.println("所调用的subtract函数计算得："+subtract(6));//在主函数中调用定义的函数subtract
        int x=subtract(6);//可将subtract函数返回值赋值给其他
        System.out.println("函数返回值赋值给x，且等于："+x);
    }
    public static int subtract(int sum) { //定义了一个变量减去2的函数。
        return sum-2;
    }
}
