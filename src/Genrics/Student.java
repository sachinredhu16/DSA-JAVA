package Genrics;

class Student<T, U> {
    public T name;
    public U rollNo;

    public Student(T name, U rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public T getName() {
        return name;
    }

    public U getRollNo() {
        return rollNo;
    }

}
