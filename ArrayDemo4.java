/**
数组中的查找操作，折半查找。
需求：
*/
class ArrayDemo4 { //
    //普通查找，通过指定要查找的数与数组中每个元素对比，如果相等，则返回其角标值
    //如果数组中没有这个值，则返回角标为-1，因为数组默认角标从零开始，返回-1以表示没有找到这个数，不存在。
    public static int ArrayFind(int[] arr1,int key) {
        for (int x= 0; x<arr1.length; x++) {
            if (arr1[x]==key) {
                return x;
            }
        }
        return -1;
    }
    //折半查找,但是这个查找数组必须为有序数组
    public static int ArrayFind_1(int[] arr2,int key) {
        int min = 0;
        int max = arr2.length-1;
        int mid = (min+max)/2;
        for(; key!=arr2[mid];) {
            if (arr2[mid]<key) {
                min=mid+1;
            } else if (arr2[mid]>key) {
                max=mid-1;
            }
            mid = (min+max)/2;
            if (min>max) {
                return -1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        int[] arr1= {1,5,6,8,4};
        int[] arr2= {1,3,5,8,9};
        int Findx=ArrayFind(arr1,0);
        int Findx_1=ArrayFind_1(arr2,5);
        System.out.println("arr1此元素的角标为："+Findx+" ,arr2元素角标为："+Findx_1);
    }
}
