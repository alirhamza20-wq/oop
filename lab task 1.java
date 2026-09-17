class Student {

    String name;
    int rollNo;
    int age;
    String department;
    int semester;

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester);
    }

    void study() {
        System.out.println(name + " is studying.");
    }

    void attendClass() {
        System.out.println(name + " is attending class.");
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Ali";
        s1.rollNo = 101;
        s1.age = 20;
        s1.department = "Computer Science";
        s1.semester = 3;

        s1.displayStudent();
        s1.study();
        s1.attendClass();
    }
}