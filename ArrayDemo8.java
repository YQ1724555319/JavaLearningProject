/**
��ʮ����ת��Ϊʮ�����ƵĲ���У�����ʮ�����Ƶ�����Ԫ�أ�
�����˶����Ƶ�Ԫ�أ��˽��Ƶ�Ԫ�أ�����ʮ���Ƶ�Ԫ�أ����ԣ�
���ǿ�����ȡ����֮�����з�װ����װΪ���ܼ��Ե��ã�
�����ʵ�ֶ��ֽ��Ƶ�ת������ʡ��������
ʵ�ֵĹ��ܣ��û���������һ��ʮ����������ͬʱת��Ϊ���ֽ��Ʋ��Ҵ�ӡ��
����
*/
import java.util.Scanner;
class ArrayDemo8 { //
    public static void main(String[] args) {
        System.out.println("****������ת������****");
        Scanner in = new Scanner (System.in);
        System.out.print("������Ҫת����ʮ��������");
        int num=in.nextInt();
        fenge();
        trans(num);
    }
    /*
    ʮ����ת��Ϊ������
    */
    public static void trans(int num) {
        toBin(num);
        toOct(num);
        toHex(num);
    }
    public static void toBin(int num) {
        System.out.println("ʮ��������"+num);
        System.out.print("ת��Ϊ�����ƣ�");
        trans(num, 1,1);
        fenge();
    }

    /*
    ʮ����ת��Ϊ�˽���
    */
    public static void toOct(int num) {
        System.out.println("ʮ��������"+num);
        System.out.print("ת��Ϊ�˽��ƣ�");
        trans(num, 7,3);
        fenge();
    }
    /*
    ʮ����ת��Ϊʮ������
    */
    public static void toHex(int num) {
        System.out.println("ʮ��������"+num);
        System.out.print("ת��Ϊʮ�����ƣ�");
        trans(num, 15,4);
        fenge();
    }
    //����
    public static void trans(int num,int yushu,int pys) {
        if (num==0) {
            System.out.println(0);
            return ;
        }
        //����һ�����н��ƶ����õ�Ԫ�ر�
        char[] element = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //����һ������������ת�����ݣ�ʮ�������λ10�����������λ32���˽������λ9��ʮ���������λ15.ȡ���
        char[] arr=new char[32];
        //����һ��ָ������������
        int pos=arr.length;
        while (num!=0) {
            int temp = num & yushu;
            arr[--pos] = element[temp];//�������
            num = num >>>pys;
        }
        for (int x=pos; x<arr.length ; x++ ) {
            System.out.print(arr[x]);
        }

    }
    public static void fenge() {
        System.out.println();
        System.out.println("*****************************");
    }
}
