/**
�������أ����壬�������������븴���ԣ�
����
�������غ�����99�˷����������ֵ�ĳ˷����ӡ����
*��������ֻҪ�ǲ����б�ͬ�Ϳ���ʵ�����أ�������ʵ���У�����������Ȼ����������������һ����
������������ͺ���ʽ�����ǲ�ͬ�ġ�
*��������л������˺������ڴ���ĸ�������ߣ������ɶ������������������ߡ�
*/
class FunctionOverload { //
    public static void main(String[] args) {
        for99();
        for99(5);
        for99(10);
    }
    public static void for99() {
        for99(9);
        System.out.println("---------------------------");
    }
    public static void for99(int num) {
        for (int x=0; x<=num ; x++ ) {
            for (int y=1; y<=x ; y++ ) {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
}
