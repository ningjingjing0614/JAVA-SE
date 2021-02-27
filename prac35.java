package bit.java.se;

import java.util.Arrays;

public class hello {
    public static void main(String[] args) {
        String[] str1 = {"we are family"};
        String str2 = "we are friend";
        System.out.println(str2.toCharArray());
        System.out.println(Arrays.toString(str2.toCharArray()));
        String[] str3 = {"123,45", "234.3", "678"};
        System.out.println(String.join(".",str3));
    }
}
