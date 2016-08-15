/**
switch判断，选择，跳出。
需求：switch语句的练习项目
需求：根据用户所定义的月份，打印所对应的季节。
*/
class SwitchDemo { //
    public static void main(String[] args) {
        int month = 10;
        switch(month) {
        case 3:
        case 4:
        case 5:
            System.out.println(month+"月是春季");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println(month+"月是夏季");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println(month+"月是秋季");
            break;
        case 12:
        case 1:
        case 2:
            System.out.println(month+"月是冬季");
            break;
        default:
            System.out.println("不是有效月份");
            break;
        }
        //需求：根据用户定义的字符，来选择另外两个常量所做运算是什么
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
