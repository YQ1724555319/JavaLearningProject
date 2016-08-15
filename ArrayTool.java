/**
@Yq
静态的使用--工具类
每一个应用程序中都有共性的功能，可以将这些功能进行抽取，独立封装，以便复用。
下面将建立一个封装关于数组的工具类，类中包括，遍历，最大值最小值，排序，等功能

因为在这个类中，没有封装特有的数据，而是封装了很多的功能方法
且所有的方法都没有访问到对象特有的数据（没有），为了让程序更加严谨，所以将所有的方法静态修饰
这样，外界可以直接通过类名调用。
*/
/**
这是一个有关一个int[]数组操作的工具类，包含遍历数组，最值，排序等功能。
@author yq
@version v1.0
*/
public class ArrayTool {
	// 因为在这个类中，没有对象所需要的属性存在，而外界只需调用此类中的方法
	// 所以，为了不让外界创建对象，为了让程序更加严谨，将空参数的构造方法私有化。
	private ArrayTool(){}
	// 定义一个打印数组的方法
	/**
	遍历并且打印数组
	@param arr int型的数组
	*/
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0;x<arr.length;x++) {
			if(x != arr.length-1) {
				System.out.print(arr[x]+",");
			}
			else{
				System.out.println(arr[x]+"]");
			}
		}
	}
	// 定义一个获取数组最大值的方法
	/**
	获取数组中的最大值
	@param arr int型的数组
	*/
	public static void getMax(int[] arr) {
		int max = 1;
		for (int x = 0;x < arr.length;x++) {
			if (arr[x] > arr[max]) {
				max = x;
			}
		}
		System.out.println("MAX="+arr[max]);
	}
	// 定义一个获取最小值的方法
	/**
	获取数组中的最小值
	@param arr int型的数组
	*/
	public static void getMin(int[] arr) {
		int min = 1;
		for (int x =0;x < arr.length;x++) {
			if (arr[x] < arr[min]) {
				min = x;
			}
		}
		System.out.println("MIN="+arr[min]);
	}
	// 定义一个选择排序的方法
	/**
	将数组进行选择排序
	@param arr int型的数组
	*/
	public static void getSort(int[] arr) {
		System.out.println("选择排序结果：");
		for (int x = 0;x < arr.length;x++) {
			for (int y = x+1;y < arr.length;y++) {
				if (arr[x] > arr[y]) {
					swap(arr,x,y);
				}
			}
		}
		printArray(arr);
	}
	// 定义一个冒泡排序的方法
	/**
	将数组进行冒泡排序
	@param arr int型的数组
	*/
	public static void getBubble(int[] arr) {
		System.out.println("冒泡排序结果：");
		for (int x = 0;x < arr.length;x++) {
			for (int y = 0;y < arr.length-x-1;y++) {
				if (arr[y] > arr[y+1]) {
					swap(arr,x,y);
				}
			}
		}
		printArray(arr);
	}
	// 定义一个在排序中需要用到的换位方法
	// 这个方法只在类里面调用，所以可以不向此类之外提供访问，私有化
	/**
	进行置换
	@param arr int型的数组
	@param x int类型数
	@param y int类型数
	*/
	private static void swap(int[] arr,int x,int y) {
		int mid = arr[x];
		arr[x] = arr[y];
		arr[y] = mid;
	}
}