/**
需求：
十进制————》》二进制
*/
class ArrayDemo5 { //
    public static void toBin(int num) {
        StringBuffer sb = new StringBuffer();//定义了一个可以存储数据的容器
        while (num>0) {
            sb.append(num%2);//上面定义的容器，提供了一个添加的方法。
            num=num/2;
        }
        System.out.println(sb.reverse());//该容器又提供了一个可以将存储的数据反转的方法
    }
    public static void main(String[] args) {
        toBin(6);
    }
}
