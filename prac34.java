//public class prac34 {
//    public int age;
//    public static int size;
//
//    public static void have() {
//        System.out.println("have static");
//        size++;
////        this.age++;
//    }
//    public void noHave(){
//        System.out.println("no have static");
//        have();
//        this.age++;
//        this.size++;
//        System.out.println("ttt"+size);
//    }
//
//
//    public static void main(String[] args) {
//        prac34 pra1 = new prac34();
//        System.out.println(pra1.age);
//        System.out.println(size);
//        have();
//        pra1.noHave();
////        this.have();
////        noHave();
//    }
//}
// 一个文件中可以有多个 class，但只能有一个 public class
// 并且 public class 的名称 == 文件名
// 其他类的名字不能重复

class 执行顺序 {
    public static int a = initStatic();

    {
        System.out.println("A");
    }

    public 执行顺序() {
        this("Hello");
        System.out.println("B");
    }

    public 执行顺序(String s) {
        System.out.println("C");
    }

    public int b = init();

    public static int initStatic() {
        System.out.println("D");
        return 0;
    }

    public int init() {
        System.out.println("E");
        return 0;
    }

    static {
        System.out.println("F");
    }
}

public class prac34 {
    public static void main(String[] args) {
        System.out.println("1");
        new 执行顺序();
        System.out.println("2");
        new 执行顺序();
        System.out.println("3");
    }
}
