public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("Yash", "Btech", 69);
        Student stu2 = new Student("Vikas", "Btech", 66);
        Student stu3 = new Student("Satya", "Btech", 55);

        stu1.displayInfo();
        stu2.displayInfo();
        stu3.displayInfo();
    }
}

class Student {
    String name;
    String course;
    int rollNo;

    Student() {
    }

    Student(String name, String course, int rollNo) {
        this.name = name;
        this.course = course;
        this.rollNo = rollNo;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Course: " + course + ", Roll No: " + rollNo);
    }

    void study() {
        System.out.println("Studying");
    }
}