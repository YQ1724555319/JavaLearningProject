/**
需求：

*/
class ArrayDemo6 { //
    //十进制》》十六进制
    public static void toHex(int num) {
        StringBuffer tohex= new StringBuffer();//定义了一个可以存储数据的容器
        for (int x=0 ; x<8; x++ ) {
            int temp = num & 15;
            if (temp>9) {
                //System.out.println((char)(temp-10+'A'));
                tohex.append((char)(temp-10+'A'));//不将数字打印而是直接将所有的值添加到tohex这个容器中
            } else {
                //System.out.println(temp);
                tohex.append(temp);
            }
            num = num >>> 4;
        }
        System.out.print(tohex.reverse());//加如reverse()功能数据反转打印
    }
    public static void main(String[] args) {
        toHex(60);
    }
}
