public class Teacher {
    public  String name;
    public int age;
    public String[] courseArray;
    public void 自我介绍(){
        System.out.printf("姓名是：%s,年龄是%d ",name, age);
        if(courseArray != null){
            System.out.println("教以下课程:");
            for (String course:courseArray) {
                System.out.println(course);
            }
        }
    }



    public Teacher(){
        age = 18;
        this.自我介绍();
    }
    public Teacher(String name){
        this.name = name;
    }
    public Teacher(String name, int age){
        this(name,age,new String[]{"yuwem"});
    }
    public Teacher(String name, int age,String[] courseArray){
        this.name = name;
        this.age = age;
        this.courseArray = courseArray;
    }
}
