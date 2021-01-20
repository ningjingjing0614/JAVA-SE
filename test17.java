public class test17 {
    public static void main(String[] args) {
//        Teacher1 teac = new Teacher1();
//
//        teac.name = "ning";
//        teac.age = 20;
//        teac.courseArray = new String[]{"语文", "数学"};
//        teac.teacFunc();
        Teacher1 tea1 = new Teacher1();
        Teacher1 tea2 = new Teacher1("宁");
        Teacher1 tea3 = new Teacher1("宁静", 20);
        Teacher1 tea4 = new Teacher1("宁静静", 20, new String[] {"语文", "数学"});//里面定义的是形参，不是属性
        System.out.println();
        System.out.println("```````````");
        System.out.println(tea4.name);//null
        System.out.println(tea4.age);//0
//        System.out.println(tea4.courseArray);//null
        for (String course : tea4.courseArray) {
            System.out.print(course +"~~~~~~~");
        }

        //tea4.courseArray;
    }
}
