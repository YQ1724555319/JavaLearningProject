/**
�������Ͷ��巽����ջ�ڴ棬���ڴ�����ԡ�
����
*/
class ArrayDemo { //
    public static void main(String[] args) {
    int[] x = new int[5];//����һ�����飬����Ԫ�ظ���Ϊ5���ɴ洢5������
    x[0] = 666;//����������0�Ǳ�λԪ��ֵΪ666
    //x = null;��������鶨��Ϊnull������Ϊ�ա�
    System.out.println("����x��1�Ǳ�Ԫ��ֵΪ��"+x[1]);//��ӡ����x�е�1�Ǳ�λ��Ԫ��ֵ
    System.out.println("����x��0�Ǳ�Ԫ��ֵΪ��"+x[0]);//��ӡ����x�е�0�Ǳ�λ��Ԫ��ֵ
    System.out.println(x[5]);//�Ǳ�Խ�����
    //�ڶ������鶨���ʽ
    int[] arr = new int[] {1,2,3};
}
}
