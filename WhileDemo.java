/**
whileѭ������ʽ�����ԣ�����ѭ��ģʽ��
whileѭ�������ϰ��Ŀ
����
*/
class WhileDemo { //
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        System.out.println("whileѭ��ǰx="+x);
        while(x<0) {
            System.out.println("x="+x);
            x++;
            y++;
            System.out.println("��"+y+"��ѭ������");
        }
        System.out.println("whileѭ��������x="+x);
        //do whileѭ����ϰ
        int z = 0;
        int w = 0;
        System.out.println("do whileѭ��ǰz="+z);
        do {
            System.out.println("z="+z);
            z++;
            w++;
            System.out.println("��"+w+"��ѭ������");
        } while (z<0);
        System.out.println("do whileѭ��������z="+z);
        System.out.println("Hello Java!");
    }
}
