import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(str);
//        Scanner sc2 = new Scanner(System.in);
//        //int str2 = sc2.next();
//        while (sc2.hasNext()){
        // 输入ctrl+d，sc2.hasNext()返回值为false，结束while循环
        //输入空格、回车、无输入之类的，hasNext（）不返回，代表用户没有输入
//            System.out.println(sc2.next());
//        }
//        Scanner sc3 = new Scanner (System.in);
//        String str3 = sc3.next();
//        System.out.println(str3);
//        String str4 = sc3.next();
//        System.out.println(str3);
//        while (sc3.hasNext()){
//            System.out.println(sc3.next());
//        }
//        System.out.println(sc3.hasNext());
//        String str5 = sc3.nextLine();
//        System.out.println(str5);
//        while (sc3.hasNextLine()){//空行也是行（只输入回车）
////            String str3 = sc3.nextLine();
////            System.out.println(str3);
//            System.out.println(sc3.nextLine());
//        }
//        Random ran = new Random();
//        //int ret = ran.nextInt(100) + 1;
//        int ret = ran.nextInt(100);
//        System.out.println("输入你猜的数字" + ret);
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        while (sc.hasNextInt() && count < 5){
//            int num = sc.nextInt();
//            count++;
//            if (num == ret){
//                System.out.println("right");
//            }
//            else if (num > ret){
//                System.out.println("猜大了");
//            }
//            else {
//                System.out.println("猜小了");
//            }
////
////            if (sc.nextInt() == ret){//alt + 鼠标左键选 可以调多行代码前移
////                System.out.println("right");
////            }
////            else if (sc.nextInt() > ret){
////                System.out.println("猜大了");
////            }
////            else {
////                System.out.println("猜小了");
////            }
//        }
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        char ch = str.charAt(0);
//
//        for (int count = 0; count < 5; count ++){
//            for (int i = 0; i < 5 - count; i++)
//            {
//                System.out.print(" ");
//            }
//            for (int i = 0; i < count+1; i++){
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }
        /*
//        int count = 2;
//        for (int n = 0; n < count * 2 + 1; n ++ ) {
//            for (int i = 0; i < count; i++) {
//                System.out.print(" ");
//            }
//            for (int i = 0; i < count; i++) {
//                System.out.print("*");
//            }
//        }
*/
//        //3661 => 1 1 1
        int second = 3662;
        int a = second / 3600;
        int b = (second / 60) % 60;
        int c = second % 60;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        System.out.println(a + " "+b + " "+c);
    }
}