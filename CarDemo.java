/** @Yq �������Ĺ�ϵ��������������ɫ����̥����
�������������������������Ժ����� */

// ����һ���࣬����ΪCar
class Car {
    //������ɫ
    String color = "��ɫ" ;
    //������̥��
    int num = 4;
    //�������еĶ���
    void run() {
        System.out.println(color+"  "+num);
    }
}
class CarDemo {
    public static void main(String[] args) {
        //����һ���¶���c1�����Ҷ�������Ĭ��Ϊ���е�����
        Car c1 = new Car();
        c1.color = "��ɫ";
        c1.run();
        //����һ���¶���c2���ı���Ĭ��ֵ
        Car c2 = new Car();
        c2.num = 6;
        c2.run();
        //������һ���¶��󣬲����ɶ����һ�������������������
        //Car c3 = new Car();
        //showCar(c3);
        showCar(new Car());//ʹ���������������ٴ�����
    }
    public static void showCar(Car c3) {
        c3.num = 8;
        c3.color = "��ɫ";
        c3.run();
    }
}
