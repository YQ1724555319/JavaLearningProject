/**
@Yq
多线程-静态同步函数的锁是Class对象
静态进内存时，内存中没有本类对象，但是一定有该类对应的字节码文件对象。
也就是类名.Class 该对象的类型是Class
静态的同步方法，使用的锁是该方法所在类的字节码文件对象。 类名.Class
*/
class Ticket implements Runnable {
    private static int ticket = 100;
    boolean i = true;
    public void run() {
        if (i) {
            while (true)
                //synchronized(this) { // 同步函数的锁是this
                synchronized(Ticket.class) { //静态同步函数的是该类对应的字节码对象
                    if (ticket > 0) {
                        try {
                            Thread.sleep(10); // 放大安全问题
                        } catch(InterruptedException e) {
                            e.toString();
                        }
                        System.out.println(Thread.currentThread().getName()+"----"+ticket--);
                    } else System.exit(0); // 结束程序
                }
        } else {
            while (true) {
                show();
            }
        }
    }
    public static synchronized void show() { // 当同步函数静态修饰，所用的锁是类名.class，是对应类的字节码对象
        if (ticket > 0) {
            try {
                Thread.sleep(10); // 放大安全问题
            } catch(InterruptedException e) {
                e.toString();
            }
            System.out.println(Thread.currentThread().getName()+"--///--"+ticket--);
        } else System.exit(0); // 结束程序
    }
}

public class ThreadDemo6 {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);  // 建立一个线程，并且这个线程属于对象t
        Thread t2 = new Thread(t);
        t1.start();
        try {
            Thread.sleep(10); // 切换线程
        } catch (Exception e) {
        }
        t.i = false;
        t2.start();
    }
}
