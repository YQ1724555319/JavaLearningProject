/**
����

*/
class ArrayDemo6 { //
    //ʮ���ơ���ʮ������
    public static void toHex(int num) {
        StringBuffer tohex= new StringBuffer();//������һ�����Դ洢���ݵ�����
        for (int x=0 ; x<8; x++ ) {
            int temp = num & 15;
            if (temp>9) {
                //System.out.println((char)(temp-10+'A'));
                tohex.append((char)(temp-10+'A'));//�������ִ�ӡ����ֱ�ӽ����е�ֵ��ӵ�tohex���������
            } else {
                //System.out.println(temp);
                tohex.append(temp);
            }
            num = num >>> 4;
        }
        System.out.print(tohex.reverse());//����reverse()�������ݷ�ת��ӡ
    }
    public static void main(String[] args) {
        toHex(60);
    }
}
