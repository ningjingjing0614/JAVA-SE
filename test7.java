import java.util.Scanner;

public class test7 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(num);
////        while(num > 0){
////            int ret = num % 60;
////            System.out.println(ret);
////            //num = num / 60;
////            num /= 60;
////        }
//        //十六进制转十进制
//
//    }
//    public static void main(String[] args) {
//        for (int i = 100; i <= 999; i++) {
//            int n = i;
//            int s = 0;
//            while (n > 0) {
//                int d = n % 10;
//                int r = 1;
//                for (int j = 0; j < 3; j++) {
//                    r = r * d;
//                }
//                // r 是 d 的三次方
//                s = s + r;
//                n = n / 10;
//            }
//            // s 是 i 的每一位的 3 次方
//            if (n == s) {
//                System.out.println(n);
//            }
//        }
//    }
    public static void main(String[] args) {
        int num = 9;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int ret = i * j;
                System.out.print(j + "*" + i + "=" + ret + "  ");
            }
            System.out.println();
        }
    }
}
