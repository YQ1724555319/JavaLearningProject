/**
����һ������forǶ��ѭ����ӡ�����Ρ�
*****		*
****		**
***			***
**			****
*			*****
*/
class ForForDemo { //
    public static void main(String[] args) {
        System.out.println("forѭ��Ƕ����ϰ�⣬��ز鿴Դ�������forǶ��ԭ��");
        System.out.println("--------------------------------------------");
        for (int x = 0; x < 5 ; x++ ) { //��������
            for (int y = x; y < 5 ; y++ ) { //��������
                System.out.print("*");
            }
            System.out.println("");//ֻ�𵽻�������
        }
        System.out.println("--------------------------------------------");
        //�⳯�£����Գ�ʼ��ֵ���ó�ʼ��ֵ������ѭ���仯
        //�⳯�ϣ����Ըı�������������������ѭ���仯
        for (int x = 0; x < 5 ; x++ ) { //��������
            for (int y = 0; y <= x ; y++ ) { //��������,�ı�����
                System.out.print("*");
            }
            System.out.println("");//ֻ�𵽻�������
        }
        System.out.println("--------------------------------------------");
        /*
        �����������forѭ��Ƕ�״�ӡ��

        1
        12
        123
        1234
        12345

        */
        for (int x=0; x<=5; x++ ) {
            for (int y=1; y<=x; y++ ) {
                System.out.print(y);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        /*
        ����������ӡ�žų˷���
        1*1=1
        1*2=2 2*2=4
        1.3=3 2*3=6 3*3=9
        ����
        */
        System.out.println("�žų˷���:");
        for (int x=1; x<=9; x++ ) { //������
            for (int y=1; y<=x; y++ ) { //����
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }

    }
}
