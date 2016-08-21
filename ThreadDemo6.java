/**
@Yq
���߳�-��̬ͬ������������Class����
��̬���ڴ�ʱ���ڴ���û�б�����󣬵���һ���и����Ӧ���ֽ����ļ�����
Ҳ��������.Class �ö����������Class
��̬��ͬ��������ʹ�õ����Ǹ÷�����������ֽ����ļ����� ����.Class
*/
class Ticket implements Runnable {
    private static int ticket = 100;
    boolean i = true;
    public void run() {
        if (i) {
            while (true)
                //synchronized(this) { // ͬ������������this
                synchronized(Ticket.class) { //��̬ͬ���������Ǹ����Ӧ���ֽ������
                    if (ticket > 0) {
                        try {
                            Thread.sleep(10); // �Ŵ�ȫ����
                        } catch(InterruptedException e) {
                            e.toString();
                        }
                        System.out.println(Thread.currentThread().getName()+"----"+ticket--);
                    } else System.exit(0); // ��������
                }
        } else {
            while (true) {
                show();
            }
        }
    }
    public static synchronized void show() { // ��ͬ��������̬���Σ����õ���������.class���Ƕ�Ӧ����ֽ������
        if (ticket > 0) {
            try {
                Thread.sleep(10); // �Ŵ�ȫ����
            } catch(InterruptedException e) {
                e.toString();
            }
            System.out.println(Thread.currentThread().getName()+"--///--"+ticket--);
        } else System.exit(0); // ��������
    }
}

public class ThreadDemo6 {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);  // ����һ���̣߳���������߳����ڶ���t
        Thread t2 = new Thread(t);
        t1.start();
        try {
            Thread.sleep(10); // �л��߳�
        } catch (Exception e) {
        }
        t.i = false;
        t2.start();
    }
}
