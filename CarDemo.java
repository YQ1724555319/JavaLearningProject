/** @Yq 类与对象的关系，描述汽车（颜色，轮胎数）
描述事物就是在描述事物的属性和特征 */

// 定义一个类，类名为Car
class Car {
    //描述颜色
    String color = "红色" ;
    //描述轮胎数
    int num = 4;
    //汽车运行的动作
    void run() {
        System.out.println(color+"  "+num);
    }
}
class CarDemo {
    public static void main(String[] args) {
        //产生一个新对象c1，并且对象属性默认为类中的属性
        Car c1 = new Car();
        c1.color = "蓝色";
        c1.run();
        //产生一个新对象c2，改变了默认值
        Car c2 = new Car();
        c2.num = 6;
        c2.run();
        //产生了一个新对象，并且由定义的一个方法来控制这个对象
        //Car c3 = new Car();
        //showCar(c3);
        showCar(new Car());//使用匿名对象来减少代码量
    }
    public static void showCar(Car c3) {
        c3.num = 8;
        c3.color = "绿色";
        c3.run();
    }
}
