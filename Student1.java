package pack1;

public class Student1 extends People {
    String name = "student";
    String[] ability = {"study"};
    int grade = 120;
    public Student1(){
        super("people");
        System.out.println("i am a student");
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", name='" + super.name + '\'' +
                '}';
    }
}
