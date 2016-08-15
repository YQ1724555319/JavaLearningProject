/**
需求：打印：

    *
   * *
  * * *
 * * * *
* * * * *

*/
class ForForTest1 { //
    public static void main(String[] args) {
        for (int x=0; x<5 ; x++ ) {
            for (int y=x+1; y<5 ; y++ ) {
                System.out.print(" ");
            }
            for (int z=0; z<=x ; z++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
        打印：

         * * * *
        * * * * * *
        * * * * *
         * * * *
           * *
            *
        System.out.println("Hello Java!");
        */
    }
}
