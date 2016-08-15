/**
数组的操作练习，遍历，循环，获取数组元素长度
需求：
*/
class ArrayDemo1 { //
    public static void main(String[] args) {
        //利用for循环来实现遍历数组元素
        int[] arr = new int[3];
        for (int x=0; x<3 ; x++ ) {
            System.out.println("arr["+x+"]="+arr[x]);
        }
        fenge();
        //数组中获取数组元素长度的属性length，使用方法
        int[] arr1 = new int[] {1,2,5,6,7,9};
        System.out.println("数组arr1的长度为："+arr1.length);
        fenge();
        //将for循环遍历数组和length属性结合。
        int[] arr2 = new int[] {1,5,8,7,9,5,6};
        for (int x=0; x<arr2.length ; x++ ) {
            System.out.println("arr2["+x+"]="+arr2[x]);
        }
        fenge();
        printArray(arr2);
        fenge();
    }
    //定义功能，用于打印数组的元素。元素间用逗号隔开
    public static void printArray(int[] arr2) {
        System.out.print("数组arr2元素值[");
        for (int x=0; x<arr2.length ; x++ ) {
            if(x!=arr2.length-1)
                System.out.print(arr2[x]+", ");
            else
                System.out.print(arr2[x]);
        }
        System.out.println("]");
    }
    public static void fenge() {
        System.out.println("-----------------------");
    }
}
