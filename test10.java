public class test10 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(a(num));
    }

    private static int a(int i) {
        if (i == 0){
            return i;
        }
        return a(i - 1);
    }
}
