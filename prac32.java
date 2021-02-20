import java.util.Arrays;

public class prac32 {
//    public static void main(String[] args) {
//        String str = "hello world";
//        int[] arr =new int[] {1,2,3,4,5};
//        int[] a = null;
//        int[] b = {1,2,3,4,5};
//        int[] arr =new int[] {1,2,3,4,5};
//        int[] a = null;
//        a = arr;
//        System.out.println(a);
//        int[] a = null;
//        int[] arr =new int[] {1,2,3,4,5};
//        arr = a;
//        System.out.println(arr);
//        int[] a = {1,2,3,4,5};
//        int[] b = {1,2,3,4,5};
//        a == b;//由于a和b指向不同的对象，所以结果是false
//        a != b;//由于a和b指向不同的对象，所以结果是true
//
//        b = a;//让b指向a当前指向的对象
//        a == b;//由于a和b指向相同的对象，所以结果是true
//        a != b;//由于a和b指向相同的对象，所以结果是false
//
//        a = null;//此时a不指向任和对象
//        a == b;//由于a不指向对象，b指向对象，所以结果是false
//        a != b;//由于a不指向对象，b指向对象，所以结果是true
//
//        b = null;//此时a不指向任和对象
//        a == b;////由于a和b都不不指向对象，所以结果是true
//        a != b;//由于a和b都不不指向对象，所以结果是false

//        int[] arr =new int[] {1,2,3,4,5};
//        System.out.println(arr[1]);
//        System.out.println(arr.length);
//        int[] a =new int[] {1,2,3,4,5};
//        System.out.println(Arrays.toString(a));//[1,2,3,4,5]
//        int[] b = a;
//        System.out.println(Arrays.toString(b));//[1,2,3,4,5]
//        b[0] = 100;
//        System.out.println(Arrays.toString(b));//[100,2,3,4,5]
//        System.out.println(Arrays.toString(a));//[100,2,3,4,5]
//    }

    //    public static void method(int[] b) {
//        System.out.println(Arrays.toString(b));//[1,2,3,4,5]
//        b[1] = 50;
//        System.out.println(Arrays.toString(b));//[1,50,3,4,5]
//    }
//
//    public static void main(String[] args) {
//        int[] a = new int[]{1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(a));//[1,2,3,4,5]
//        method(a);
//        System.out.println(Arrays.toString(a));//[1,50,3,4,5]
//    }
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = {1, 2, 3, 4, 5};
//        System.out.println(a == b);//false
//        System.out.println(Arrays.equals(a, b));//true
        int[] b = null;
        //System.out.println(b.length);//出现空指针异常
        System.out.println(b[1]);////出现空指针异常
        //Exception in thread "main" java.lang.NullPointerException
    }
}
