/**
whileѭ����forѭ���������ۼ�˼��
˼�룺�ۼ�˼�롣
������1~10�ĺ͡�����ӡ�����ս����
˼·��1+2+3+4����
	0+1
	1+2
	3+3
	6+4
	����
���������������洢������߲�ͬ��ֵ��
*/
class LoopTest1 { //
    public static void main(String[] args) {
        int sum = 0;
        //����һ�������洢������ӵĺ͡�
        int i = 1;
        //����һ�������洢���ϱ仯������
        while(i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("(while)1~10�ĺ�Ϊ��"+sum);
        i=1;
        //��for������
        int sum1 = 0;
        for(i=1; i<=10; i++) {
            sum1 = sum1 + i;
        }
        System.out.println("(for)1~10�ĺ�Ϊ��"+sum1);
        System.out.println("Hello Java!");
    }
}
