public class Dog2 {
    static String kind;
    String name;
    int age;

    static class A {//静态内部类

        public void myPrint() {
            System.out.println("我是静态内部类");
        }
    }

}
//static {//静态代码块
//        System.out.println("我是静态代码块");
//        }
//
//        {//普通代码块
//        System.out.println("我是普通类");
//        }
//
//public Dog2() {//构造函数
//        System.out.println("我是构造函数");
//        }
//    public static void show() {
//        System.out.println(kind);
//    }
//public class Teacher {
//    //定义时初始化
//    public String name = "张";
//    public int age = 21;
//
//    //通过构造代码块初始化
//    {
//        name = "李";
//        age = 22;
//    }
//
//    //通过构造方法初始化
//    public Teacher() {
//        name = "王";
//        age = 23;
//    }
//
//}
