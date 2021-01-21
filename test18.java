public class test18 {
    public static void main(String[] args) {
//        Teacher2 tea1 = new Teacher2();
////        System.out.println(tea1.name);
////        System.out.println(tea1.age);
//        System.out.println(tea1);
//        System.out.println(tea1.toString());

        myDate from = new myDate(2018, 1,20);
        myDate to = new myDate(2020, 1,20);
//        myDate from = new myDate();
//        myDate to = new myDate();
        System.out.println(from + "       "+ to + "       "+ to.jian(from));
        //System.out.println(from.toString());

    }
}
