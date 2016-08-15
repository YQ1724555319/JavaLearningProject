/**
数组的排序
需求：将一个数组按照从小到大的顺序排序
*/
class ArrayDemo3 { //
    /*
    选择排序：
    */
    public static void ArraySort1(int[] arr1) {
        for (int x=0; x<arr1.length ; x++ ) {
            for (int y=x+1; y<arr1.length ; y++ ) {
                if (arr1[x]>arr1[y]) { //将0角标和1角标比较，循环推进比较
                    int z=arr1[x];
                    arr1[x]=arr1[y];
                    arr1[y]=z;
                }
            }
        }
    }
    /*
    冒泡排序：
    相邻两个元素进行比较
    */
    public static void ArrayBubble(int[] arr2) {
        for (int x=0; x<arr2.length; x++ ) {
            for (int y=0; y<arr2.length-x-1 ; y++ ) { //-x:每一次比较元素减少，-1：防止角标越界
                if (arr2[y]>arr2[y+1]) { //相邻元素比较。
                    int z=arr2[y];
                    arr2[y]=arr2[y+1];
                    arr2[y+1]=z;

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1= {4,5,8,3,1,7};
        int[] arr2= {2,1,5,9,8,7};
        System.out.println("选择排序：");
        System.out.print("排序前数组:");
        printArray(arr1);//排序前打印数组
        ArraySort1(arr1);//排序
        System.out.print("排序后数组:");
        printArray(arr1);//排序后打印数组
        System.out.println("冒泡排序：:");
        System.out.print("排序前数组:");
        printArray2(arr2);//排序前打印数组
        ArrayBubble(arr2);//排序
        System.out.print("排序后数组:");
        printArray2(arr2);//排序后打印数组
    }
    public static void printArray(int[] arr1) {
        System.out.print("[");
        for (int x=0; x<arr1.length ; x++ ) {
            if(x!=arr1.length-1)
                System.out.print(arr1[x]+", ");
            else
                System.out.print(arr1[x]);
        }
        System.out.println("]");
    }

    public static void printArray2(int[] arr2) {
        System.out.print("[");
        for (int x=0; x<arr2.length ; x++ ) {
            if(x!=arr2.length-1)
                System.out.print(arr2[x]+", ");
            else
                System.out.print(arr2[x]);
        }
        System.out.println("]");
    }
}
