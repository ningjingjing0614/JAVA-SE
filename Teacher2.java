public class Teacher2 {
    public String name;
    public int age;

    public Teacher2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println(name +"    "+ age);
    }

    static int number = 0;
    public static String showTeacher (String name){
        number ++;
        return name;
    }
}
