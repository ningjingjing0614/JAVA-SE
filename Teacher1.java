public class Teacher1 {
    //在类中定义属性
    public String name;
    public int age;
    public String[] courseArray;

    //在类中定义普通方法
    public void teacFunc() {
        System.out.println(name + " " + age);
        if (courseArray != null) {
            for (String course : courseArray) {
                System.out.println(course);
            }
        }
    }

    public Teacher1() {

        this("ningning", 20, new String[] {"语言","数理"});

        System.out.println("空构造方法");
    }

    public Teacher1(String name) {
        System.out.println(name +"~~~~~~~");
    }

    public Teacher1(String name, int age) {
        System.out.print(name +"~~~~~~~");
        System.out.println(age +"~~~~~~~");
    }

    public Teacher1(String name, int age, String[] courseArray) {
        this.name = name;
        this.age = age;
        this.courseArray = courseArray;
        System.out.print(name +"~~~~~~~");
        System.out.print(age +"~~~~~~~");
        for (String course : courseArray) {
            System.out.print(course +"~~~~~~~");
        }

    }
}
//public class Teacher1 {
//    public String name;
//    public int age;
//    public String[] courseArray;     // 教哪些课程
//
//    public void 自我介绍() {
//        // 在方法中可以直接使用属性
//        // name 读取该对象中，属性 name 的值
//        System.out.printf("我叫 %s，我今年 %d 岁，我教以下课程:\n", name, age);
//        if (courseArray != null) {
//            for (String course : courseArray) {
//                System.out.println(course);
//            }
//        }
//    }
//}
