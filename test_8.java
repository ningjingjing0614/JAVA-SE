public class test8 {
    public static long pow(int a, int b) {//a的b次方
        long ret = 1;//方法返回类型为long
        for (int i = 0; i < b; i++) {
            ret *= a;
        }
        return ret;
    }

    //    public static void main(String[] args) {
//        System.out.println(pow(2, 5));
//
//    }
    public static long sumCube(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += pow(d, 3);
            n /= 10;
        }
        return sum;
    }

    public static boolean is(int n) {
        return n == sumCube(n);
    }

    public static void main(String[] args) {
        int num = 152;
        if (is(num)) {
            System.out.println(num);
        } else {
            System.out.println("no");
        }
    }
}
