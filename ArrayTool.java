/**
@Yq
��̬��ʹ��--������
ÿһ��Ӧ�ó����ж��й��ԵĹ��ܣ����Խ���Щ���ܽ��г�ȡ��������װ���Ա㸴�á�
���潫����һ����װ��������Ĺ����࣬���а��������������ֵ��Сֵ�����򣬵ȹ���

��Ϊ��������У�û�з�װ���е����ݣ����Ƿ�װ�˺ܶ�Ĺ��ܷ���
�����еķ�����û�з��ʵ��������е����ݣ�û�У���Ϊ���ó�������Ͻ������Խ����еķ�����̬����
������������ֱ��ͨ���������á�
*/
/**
����һ���й�һ��int[]��������Ĺ����࣬�����������飬��ֵ������ȹ��ܡ�
@author yq
@version v1.0
*/
public class ArrayTool {
	// ��Ϊ��������У�û�ж�������Ҫ�����Դ��ڣ������ֻ����ô����еķ���
	// ���ԣ�Ϊ�˲�����紴������Ϊ���ó�������Ͻ������ղ����Ĺ��췽��˽�л���
	private ArrayTool(){}
	// ����һ����ӡ����ķ���
	/**
	�������Ҵ�ӡ����
	@param arr int�͵�����
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
	// ����һ����ȡ�������ֵ�ķ���
	/**
	��ȡ�����е����ֵ
	@param arr int�͵�����
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
	// ����һ����ȡ��Сֵ�ķ���
	/**
	��ȡ�����е���Сֵ
	@param arr int�͵�����
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
	// ����һ��ѡ������ķ���
	/**
	���������ѡ������
	@param arr int�͵�����
	*/
	public static void getSort(int[] arr) {
		System.out.println("ѡ����������");
		for (int x = 0;x < arr.length;x++) {
			for (int y = x+1;y < arr.length;y++) {
				if (arr[x] > arr[y]) {
					swap(arr,x,y);
				}
			}
		}
		printArray(arr);
	}
	// ����һ��ð������ķ���
	/**
	���������ð������
	@param arr int�͵�����
	*/
	public static void getBubble(int[] arr) {
		System.out.println("ð����������");
		for (int x = 0;x < arr.length;x++) {
			for (int y = 0;y < arr.length-x-1;y++) {
				if (arr[y] > arr[y+1]) {
					swap(arr,x,y);
				}
			}
		}
		printArray(arr);
	}
	// ����һ������������Ҫ�õ��Ļ�λ����
	// �������ֻ����������ã����Կ��Բ������֮���ṩ���ʣ�˽�л�
	/**
	�����û�
	@param arr int�͵�����
	@param x int������
	@param y int������
	*/
	private static void swap(int[] arr,int x,int y) {
		int mid = arr[x];
		arr[x] = arr[y];
		arr[y] = mid;
	}
}