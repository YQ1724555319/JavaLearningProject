/**
������ʶ�����壬���ã���ֵ��������ʽ
*/
class FunctionDemo { //
    public static void main(String[] args) {
        System.out.println("�����õ�subtract��������ã�"+subtract(6));//���������е��ö���ĺ���subtract
        int x=subtract(6);//�ɽ�subtract��������ֵ��ֵ������
        System.out.println("��������ֵ��ֵ��x���ҵ��ڣ�"+x);
    }
    public static int subtract(int sum) { //������һ��������ȥ2�ĺ�����
        return sum-2;
    }
}
