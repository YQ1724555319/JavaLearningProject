/**
����Ĳ�����ϰ��������ѭ������ȡ����Ԫ�س���
����
*/
class ArrayDemo1 { //
    public static void main(String[] args) {
        //����forѭ����ʵ�ֱ�������Ԫ��
        int[] arr = new int[3];
        for (int x=0; x<3 ; x++ ) {
            System.out.println("arr["+x+"]="+arr[x]);
        }
        fenge();
        //�����л�ȡ����Ԫ�س��ȵ�����length��ʹ�÷���
        int[] arr1 = new int[] {1,2,5,6,7,9};
        System.out.println("����arr1�ĳ���Ϊ��"+arr1.length);
        fenge();
        //��forѭ�����������length���Խ�ϡ�
        int[] arr2 = new int[] {1,5,8,7,9,5,6};
        for (int x=0; x<arr2.length ; x++ ) {
            System.out.println("arr2["+x+"]="+arr2[x]);
        }
        fenge();
        printArray(arr2);
        fenge();
    }
    //���幦�ܣ����ڴ�ӡ�����Ԫ�ء�Ԫ�ؼ��ö��Ÿ���
    public static void printArray(int[] arr2) {
        System.out.print("����arr2Ԫ��ֵ[");
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
