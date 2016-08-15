/**
数组的应用操作二：
获取数组中的最大值和最小值。
思路：
在数组中任意获取一个元素，通过遍历数组元素让元素之间相互比较，
定义一个变量，当比较值大于这个值得时候，将较大值存储到此变量中。
定义一个方法来实现这个功能，以便提高代码的复用性。
*/
class ArrayDemo2 {
    public static int MaxArr1(int[] arr1) { //定义一个方法（函数）来实现这一求数组元素最大值的功能
        //1.获取数组中的最大值,获取dobule类型的最大值或最小值也是可以的
        int max=1;//定义此变量来存储比较后的较大值。
        for (int x=0; x<arr1.length; x++) { //遍历数组元素
            if (arr1[x]>arr1[max]) { //将选取出来的元素与所有元素做比较，只要大于这个值，
                max=x;//就将这个较大元素值得**角标**赋值给存储变量。
            }
        }
        return arr1[max];
    }
    public static int MaxArr2(int[] arr2) { //定义一个方法（函数）来实现这一求数组元素最大值的功能
        //2.获取数组中的最大值
        int max=arr2[0];//定义此变量来存储比较后的较大值。
        for (int x=0; x<arr2.length; x++) { //遍历数组元素
            if (arr2[x]>arr2[max]) { //将选取出来的元素与所有元素做比较，只要大于这个值，
                max=arr2[x];//就将这个较大元素值赋值给存储变量。
            }
        }
        return max;
    }
    public static int MinArr1(int[] arr1) {
        //3.获取数组中的最小值
        int min=1;
        for (int x=0; x<arr1.length; x++) {
            if (arr1[x]<arr1[min]) {
                min=x;
            }
        }
        return arr1[min];
    }
    public static void main(String[] args) {
        int[] arr1=new int[] {2,4,5,8};
        int[] arr2=new int[3];//{1,5,4,10};
        arr2[0]=1;
        arr2[1]=5;
        arr2[2]=7;
        int max=MaxArr1(arr1);
        System.out.println("arr1 max="+max);
        MaxArr2(arr2);
        System.out.println("arr2 max="+MaxArr2(arr2));
        int min=MinArr1(arr1);
        System.out.println("arr1 min="+min);
    }
}