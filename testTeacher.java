public class testTeacher {
    public static void main(String[] args) {
//        Teacher tea1 = new Teacher();
//        tea1.name = "张三";
//        tea1.age = 23;
//        tea1.courseArray = new String[]{"chinese","math","English"};
//        tea1.自我介绍();
//        Teacher tea2 = new Teacher();
//
//        tea2.自我介绍();
        Teacher teac1 = new Teacher();
        Teacher teac2 = new Teacher("张三");
        Teacher teac3 = new Teacher("李四", 24);
        Teacher teac4 = new Teacher("王五",25,new String[]{"语文","数学"});
        Teacher teac5 = new Teacher("张三三");
        Teacher teac6 = null;
        teac1.自我介绍();
        teac2.自我介绍();
        teac3.自我介绍();
        teac4.自我介绍();
        teac5.自我介绍();
//        teac6.自我介绍();
        System.out.println(teac4.name);
    }
}
