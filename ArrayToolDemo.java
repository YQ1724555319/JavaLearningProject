/**
@Yq
这是ArrayTool工具类的调用程序。
*/
class ArrayToolDemo {
    public static void main(String[] args) {
        int[] arr = {2,17,7,3,14,16};
        System.out.println("ArrayTool工具类调用程序运行：");
        ArrayTool.printArray(arr);
        ArrayTool.getMax(arr);
        ArrayTool.getMin(arr);
        ArrayTool.getSort(arr);
        ArrayTool.getBubble(arr);
    }
}
