/**
�����Ӧ�ò�������
��ȡ�����е����ֵ����Сֵ��
˼·��
�������������ȡһ��Ԫ�أ�ͨ����������Ԫ����Ԫ��֮���໥�Ƚϣ�
����һ�����������Ƚ�ֵ�������ֵ��ʱ�򣬽��ϴ�ֵ�洢���˱����С�
����һ��������ʵ��������ܣ��Ա���ߴ���ĸ����ԡ�
*/
class ArrayDemo2 {
    public static int MaxArr1(int[] arr1) { //����һ����������������ʵ����һ������Ԫ�����ֵ�Ĺ���
        //1.��ȡ�����е����ֵ,��ȡdobule���͵����ֵ����СֵҲ�ǿ��Ե�
        int max=1;//����˱������洢�ȽϺ�Ľϴ�ֵ��
        for (int x=0; x<arr1.length; x++) { //��������Ԫ��
            if (arr1[x]>arr1[max]) { //��ѡȡ������Ԫ��������Ԫ�����Ƚϣ�ֻҪ�������ֵ��
                max=x;//�ͽ�����ϴ�Ԫ��ֵ��**�Ǳ�**��ֵ���洢������
            }
        }
        return arr1[max];
    }
    public static int MaxArr2(int[] arr2) { //����һ����������������ʵ����һ������Ԫ�����ֵ�Ĺ���
        //2.��ȡ�����е����ֵ
        int max=arr2[0];//����˱������洢�ȽϺ�Ľϴ�ֵ��
        for (int x=0; x<arr2.length; x++) { //��������Ԫ��
            if (arr2[x]>arr2[max]) { //��ѡȡ������Ԫ��������Ԫ�����Ƚϣ�ֻҪ�������ֵ��
                max=arr2[x];//�ͽ�����ϴ�Ԫ��ֵ��ֵ���洢������
            }
        }
        return max;
    }
    public static int MinArr1(int[] arr1) {
        //3.��ȡ�����е���Сֵ
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