import java.util.Scanner;

public class prac28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String st = sc.nextLine();

            String ans = "";
            for (int i = 1; i < st.length(); i++) {
                for (int j = 0; j <= i; j++) {
                    if (st.charAt(i) == st.charAt(j)) {
                        ans += st.charAt(i);
                    } else {
                        ans += st.charAt(j);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}

//            int f = 1;
//            int l = 0;
//            while(f < st.length()){
//                if(st.charAt(f) == st.charAt(l)){
//                    System.out.println(st.charAt(l));
//                }
//                else {
//                    System.out.println(st.charAt(l));
//                }
//                f++;
//                l++;
//             }
//            }
//            while(f < st.length()){
//        int a = sc.nextInt();
//        System.out.println(a);
//        while (sc.hasNextLine()) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a + b);
//        }