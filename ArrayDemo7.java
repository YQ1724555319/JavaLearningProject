/**
����
ʮ����--��ʮ������
ʮ����--��������
�����
����ʮ�������е�Ԫ����0-15�Ķ�Ӧ��ϵ�����뵽������Ԫ����Ԫ�ؽǱ�Ķ�Ӧ��ϵ����������������
��ÿ�� & 15���ֵ��Ϊ����ȥ�齨���õı��Ϳ����ҵ���Ӧ�Ե�Ԫ�ء������ȣ�-10+'A'��Ҫ�׶��ҷ���
0  1  2  3  4  5  6  7  8  9  A  B  C  D  E  F == ʮ�������е�Ԫ��
0  1  2  3  4  5  6  7  8  9  10 11  12  13 14 15
*/
class ArrayDemo7 { //
    public static void toHex(int num) {
        System.out.println("ʮ��������"+num);
        //��ʮ��������������Ԫ�����ϵ�һ�����������ÿ��Ԫ��������Ǳ꽨���˶�Ӧ��ϵ
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //����һ����ʱ�����������洢
        char[] arr = new char[8];
        //������һ��������Ϊָ�룬ָ��ָ������������һλ��ʼ��
        int pos = arr.length;
        while (num!=0) {
            int temp = num & 15;
            //System.out.println(hex[temp]);
            //�������һλ������ǰ��
            arr[--pos] = hex[temp];
            num = num>>>4;
        }
        /*
        �������飬���洢�����ݴ�ӡ��
        */
        System.out.print("ת��Ϊʮ������Ϊ��");
        for (int y=pos; y<arr.length ; y++ ) {
            System.out.print(arr[y]);
        }
        System.out.println();
    }
    /*�����Ժ�֮ǰ��ʮ�����ƻ�һ��������Ϊ�˰��ý����������ӡ�����ϸ���ϰ��
    ������StringBuffer�����Լ�reverse()��������ô����ʹ������֪ʶ��ʵ�����һ���Ĺ����أ�
    ���Ƿ���StringBuffer��һ��������������Ҳ��һ���������뷽��������ʵ�ִ˹��ܡ�
    */
    public static void toBin(int num) {
        System.out.println("ʮ��������"+num);
        //����һ�������Ƶ�Ԫ�ر�
        char[] bin= {'0','1'};
        //����һ���������洢�����Ƶ���
        char[] arr=new char[32];
        //����һ��ָ������������
        int pos=arr.length;
        while (num!=0) {
            int temp = num & 1;
            arr[--pos] = bin[temp];
            num = num >>>1;
        }
        System.out.print("ת��Ϊʮ������Ϊ��");
        for (int x=pos; x<arr.length ; x++ ) {
            System.out.print(arr[x]);
        }

    }
    public static void main(String[] args) {
        toHex(60);
        toBin(6);
    }
}
