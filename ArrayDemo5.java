/**
����
ʮ���ơ�����������������
*/
class ArrayDemo5 { //
    public static void toBin(int num) {
        StringBuffer sb = new StringBuffer();//������һ�����Դ洢���ݵ�����
        while (num>0) {
            sb.append(num%2);//���涨����������ṩ��һ����ӵķ�����
            num=num/2;
        }
        System.out.println(sb.reverse());//���������ṩ��һ�����Խ��洢�����ݷ�ת�ķ���
    }
    public static void main(String[] args) {
        toBin(6);
    }
}
