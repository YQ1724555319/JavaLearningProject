/**
switch�жϣ�ѡ��������
����switch������ϰ��Ŀ
���󣺸����û���������·ݣ���ӡ����Ӧ�ļ��ڡ�
*/
class SwitchDemo { //
    public static void main(String[] args) {
        int month = 10;
        switch(month) {
        case 3:
        case 4:
        case 5:
            System.out.println(month+"���Ǵ���");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println(month+"�����ļ�");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println(month+"�����＾");
            break;
        case 12:
        case 1:
        case 2:
            System.out.println(month+"���Ƕ���");
            break;
        default:
            System.out.println("������Ч�·�");
            break;
        }
        //���󣺸����û�������ַ�����ѡ������������������������ʲô
        int a=5;
        int b=3;
        char x='-';
        switch(x) {
        case '+':
            System.out.println(a+b);
            break;
        case '-':
            System.out.println(a-b);
            break;
        }
        System.out.println("Hello Java!");

    }
}
