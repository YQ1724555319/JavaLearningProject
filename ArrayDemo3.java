/**
���������
���󣺽�һ�����鰴�մ�С�����˳������
*/
class ArrayDemo3 { //
    /*
    ѡ������
    */
    public static void ArraySort1(int[] arr1) {
        for (int x=0; x<arr1.length ; x++ ) {
            for (int y=x+1; y<arr1.length ; y++ ) {
                if (arr1[x]>arr1[y]) { //��0�Ǳ��1�Ǳ�Ƚϣ�ѭ���ƽ��Ƚ�
                    int z=arr1[x];
                    arr1[x]=arr1[y];
                    arr1[y]=z;
                }
            }
        }
    }
    /*
    ð������
    ��������Ԫ�ؽ��бȽ�
    */
    public static void ArrayBubble(int[] arr2) {
        for (int x=0; x<arr2.length; x++ ) {
            for (int y=0; y<arr2.length-x-1 ; y++ ) { //-x:ÿһ�αȽ�Ԫ�ؼ��٣�-1����ֹ�Ǳ�Խ��
                if (arr2[y]>arr2[y+1]) { //����Ԫ�رȽϡ�
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
        System.out.println("ѡ������");
        System.out.print("����ǰ����:");
        printArray(arr1);//����ǰ��ӡ����
        ArraySort1(arr1);//����
        System.out.print("���������:");
        printArray(arr1);//������ӡ����
        System.out.println("ð������:");
        System.out.print("����ǰ����:");
        printArray2(arr2);//����ǰ��ӡ����
        ArrayBubble(arr2);//����
        System.out.print("���������:");
        printArray2(arr2);//������ӡ����
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
