
class Student{
    public static void schoolName(){
        System.out.println("School Name is A");
    }
    private void myName(){
        System.out.println("My Name is A");
    }
}
class Teacher extends Student{
    public static void schoolName(){
        System.out.println("School Name is B");
    }
    private void myName(){
        System.out.println("My Name is B");
    }
}

public class Main {
     public static void main(String [] argh)
    {
        Student.schoolName();
        Teacher.schoolName();
    }
}