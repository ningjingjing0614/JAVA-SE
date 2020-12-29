import java.util.Scanner;

//        String c = "8";
//        int d = Integer.parseInt(c);
//        System.out.println(d);
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.next());
//        System.out.println(sc.next());
//        int ret = 0;
//        for (int i = 1; i < 6; i++)
//        {
//            num1 *= i;
//            ret += num1;
//        }
//        System.out.println(ret);
//        for (int i = 1; i < 6; i++) {
//            int num1 = 1;
//            for (int j = 1; j <= i; j++) {
//                num1 *= j;
//            }
//            ret += num1;
//        }
//        System.out.println(ret);
public class test5 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i < num / 2; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < num - i; k+=2) {

                    System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();
        }
    }
}
