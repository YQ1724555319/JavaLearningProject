/**
�����еĲ��Ҳ������۰���ҡ�
����
*/
class ArrayDemo4 { //
    //��ͨ���ң�ͨ��ָ��Ҫ���ҵ�����������ÿ��Ԫ�ضԱȣ������ȣ��򷵻���Ǳ�ֵ
    //���������û�����ֵ���򷵻ؽǱ�Ϊ-1����Ϊ����Ĭ�ϽǱ���㿪ʼ������-1�Ա�ʾû���ҵ�������������ڡ�
    public static int ArrayFind(int[] arr1,int key) {
        for (int x= 0; x<arr1.length; x++) {
            if (arr1[x]==key) {
                return x;
            }
        }
        return -1;
    }
    //�۰����,������������������Ϊ��������
    public static int ArrayFind_1(int[] arr2,int key) {
        int min = 0;
        int max = arr2.length-1;
        int mid = (min+max)/2;
        for(; key!=arr2[mid];) {
            if (arr2[mid]<key) {
                min=mid+1;
            } else if (arr2[mid]>key) {
                max=mid-1;
            }
            mid = (min+max)/2;
            if (min>max) {
                return -1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        int[] arr1= {1,5,6,8,4};
        int[] arr2= {1,3,5,8,9};
        int Findx=ArrayFind(arr1,0);
        int Findx_1=ArrayFind_1(arr2,5);
        System.out.println("arr1��Ԫ�صĽǱ�Ϊ��"+Findx+" ,arr2Ԫ�ؽǱ�Ϊ��"+Findx_1);
    }
}
