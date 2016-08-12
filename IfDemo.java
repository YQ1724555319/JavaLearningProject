/**
if判断语句，格式，else，else if,范围。
需求一：根据用户输入的数值不同，打印对应的星期英文。
需求二：根据用户所定义的月份，打印所对应的季节。
*/
class IfDemo { //类名
    public static void main(String[] args) { //主函数
        int week=2;
        if(week==1)
            System.out.println("Monday");
        if(week==2)
            System.out.println("Tuesday");
        //需求二：根据用户所定义的月份，打印所对应的季节。
        int month = 10;
        if(month>12||month<1)
            System.out.println(month+"不是有效月份");
        else if(month>=3&&month<=5)
            System.out.println(month+"月是：春季");
        else if(month>=6&&month<=8)
            System.out.println(month+"月是：夏季");
        else if(month>=9&&month<=11)
            System.out.println(month+"月是：秋季");
        else
            System.out.println(month+"月是：冬季");

    }
}
