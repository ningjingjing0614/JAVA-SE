import java.util.Scanner;

public class test8 {
//        public static void main(String[] args) {
//        int n = 20, m = 15;
//        int a = n, b = m;
//            if (n > m){//n小m大
//             int tmp = n;
//             n = m;
//             m = tmp;
//            }
//        int ret = 0;
//        while (n != 0){
//            ret = m % n;
//            m = n;
//            n = ret;
//        }
//        int h = a * b / m;//两数之积除以最大公约数
//        System.out.println("gongyueshu" + m);//最大公约数
//        System.out.println(h);//最小公倍数
//    }
    public static int maxFactor(int n, int m) {//最大公约数
        if (n > m){//n小m大
             int tmp = n;
             n = m;
             m = tmp;
            }
        while (n != 0) {
            int tmp = m % n;
            m = n;
            n = tmp;
        }
        return m;
    }

    public static int minMultiple(int n, int m){
        int ret = n * m / maxFactor(n, m);
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ret1 = maxFactor(a, b);
        int ret2 = minMultiple(a,b);
        System.out.println("最大公约数" + ret1);
        System.out.println("最小公倍数" + ret2);
    }
}
