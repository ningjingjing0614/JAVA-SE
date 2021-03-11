
import java.util.Arrays;
import java.util.Scanner;

public class prac46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        String[] arr1 = n.split(" ");

        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);

        String arr2 = arr1[arr1.length-1];
        System.out.println(arr2);

        System.out.println(arr2.length());
    }
}
//        //定义一个int基本数据类型变量num1，将数字10赋值给num1
//        int num1 = 10;
//        //给num1重新赋值为20
//        num1 = 20;
//        //将num1的值打印出来
//        System.out.println(num1);//输出 10
//
//        double num2 = 5.8;
//        num2 = 7.8;
//        System.out.println(num2);//输出7.8
//
//        boolean num3 = true;
//        num3 = false;
//        System.out.println(num3);//输出 false
//        //定义int类型的数组引用类型arr1
//        int[] arr1 = new int[] {1,2,3,4,5};
//        //让arr1改变指向
//        arr1 = new int[] {6,7,8,9,0};
//        //打印数组arr1中的数据
//        for (int num:arr1) {
//            System.out.println(num); //输出6 7 8 9 0
//        }
//        //定义String类型的数组引用类型str1
//        String[] str1 = new String[] {"hello", "world", "!"};
//        //改变str1的第二个元素
//        str1[1] = "Java";
//        for (String str: str1) {
//            System.out.println(str);//输出hello Java !
//        }
//               System.out.println(n.length());
//        System.out.println();
//        while (){
//            System.out.println(n);
//
//        }