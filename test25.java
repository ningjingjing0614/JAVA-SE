import java.util.Arrays;

public class test25 {
    public static void main(String[] args) {
//        //动态初始化
//        数据类型[] 数组名称 = new 数据类型[] {初始化数据};
//        //静态初始化
//        数据类型[] 数组名称 = {初始化数据};
//        int[] arr1 =new int[] {1,2,3,4,5};
////        float[] arr2 = new float[5];
////        arr2[0] = 1;
////        arr2[1] = 2;
////        arr2[2] = 3;
////        arr2[3] = 4;
////        arr2[4] = 5;
//        //        arr2 = new int[]{1,2,3,4,5};
//        char[] arr2 = new char[3];
//        System.out.println(arr2[1]);
//        int[] arr3 = {1,2,3,4,5};
        //arr3 = {2,3,4,5,6};
        // int arr3[] = {1,2,3,4,5};
        //获取数组长度
//        int[] arr1 =new int[] {1,2,3,4,5};//整型数组arr1的长度为5
//        System.out.println("数组arr1的长度为：" + arr1.length);//执行结果：数组arr1的长度为：5
//
//        //访问数组中的元素
//        System.out.println(arr1[0]);//输出数组arr1中的第一个元素   //执行结果：1
//        System.out.println(arr1[1]);//输出数组arr1中的第二个元素   //执行结果：2
//        arr1[3] = 9;
//        System.out.println(arr1[3]);//输出数组arr1中的第三个元素   //执行结果：9
//        System.out.println(arr1[7]);
//        int[] arr1 =new int[] {1,2,3,4,5};//整型数组arr1的长度为5
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr1[i] + "  ");//执行结果：1  2  3  4  5
//        }
// for (int a:arr1) {
////            System.out.print(a + "  ");//执行结果：1  2  3  4  5
////        }
        //        System.out.println(arr1);

        int[] arr1 =new int[] {1,2,3,4,5};//整型数组arr1的长度为5
        System.out.println(Arrays.toString(arr1));
    }
}
