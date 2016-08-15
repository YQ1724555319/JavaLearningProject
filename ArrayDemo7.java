/**
需求：
十进制--》十六进制
十进制--》二进制
查表法：
利用十六进制中的元素与0-15的对应关系，联想到数组中元素与元素角标的对应关系，建立数组容器。
在每次 & 15后的值作为索引去查建立好的表，就可以找到对应对的元素。这样比（-10+'A'）要易懂且方便
0  1  2  3  4  5  6  7  8  9  A  B  C  D  E  F == 十六进制中的元素
0  1  2  3  4  5  6  7  8  9  10 11  12  13 14 15
*/
class ArrayDemo7 { //
    public static void toHex(int num) {
        System.out.println("十进制数："+num);
        //将十六进制数的所有元素整合到一个数组里，并且每个元素与数组角标建立了对应关系
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //定义一个临时容器，用来存储
        char[] arr = new char[8];
        //定义了一个变量作为指针，指针指明从数组的最后一位开始存
        int pos = arr.length;
        while (num!=0) {
            int temp = num & 15;
            //System.out.println(hex[temp]);
            //存完最后一位依次往前存
            arr[--pos] = hex[temp];
            num = num>>>4;
        }
        /*
        遍历数组，将存储的数据打印，
        */
        System.out.print("转换为十六进制为：");
        for (int y=pos; y<arr.length ; y++ ) {
            System.out.print(arr[y]);
        }
        System.out.println();
    }
    /*最后可以和之前的十六进制换一样，但是为了把让结果正过来打印，在上个练习中
    利用了StringBuffer容器以及reverse()方法，那么怎样使用现有知识来实现与此一样的功能呢？
    我们发现StringBuffer是一个容器，而数组也是一个容器，想方法将数组实现此功能。
    */
    public static void toBin(int num) {
        System.out.println("十进制数："+num);
        //定义一个二进制的元素表
        char[] bin= {'0','1'};
        //定义一个数组来存储二进制的数
        char[] arr=new char[32];
        //定义一个指针来操作数组
        int pos=arr.length;
        while (num!=0) {
            int temp = num & 1;
            arr[--pos] = bin[temp];
            num = num >>>1;
        }
        System.out.print("转换为十六进制为：");
        for (int x=pos; x<arr.length ; x++ ) {
            System.out.print(arr[x]);
        }

    }
    public static void main(String[] args) {
        toHex(60);
        toBin(6);
    }
}
