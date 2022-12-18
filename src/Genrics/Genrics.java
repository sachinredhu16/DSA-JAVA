package Genrics;

public class Genrics {
    public static void main(String[] args) {

        Student<String,Integer> student = new Student<>("Sachin",1);

        Student<Student<String,Integer>,Integer> student1 = new Student<>(student,2);

        System.out.println(student1.getName().getClass().getClass());
        System.out.println(student1.getName().getName());

    }
}
