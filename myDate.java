

public class myDate {
    //定义时初始化
//    String name = "ning";
//    int age = 1;
//    //构造代码块
//    {
//        name = "ning ning";
//        age = 2;
////        System.out.println("构造代码块");
//    }
//    //构造方法（无论定义在哪都最后执行）
//    public Teacher2(){
//        name = "ning ning";
//        age = 3;
////        System.out.println("构造方法");
//    }
//
//    public  void myUsed() {
//        System.out.println("wwwwwwww");
//    }
//
//    public  String toString() {
//
//        //return "gfgdsa";
//        return name;
//    }

    int year;
    int month;
    int day;

    @Override
    public String toString() {
        return "myDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public myDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int jian(myDate from) {
        return -1;
    }
}
