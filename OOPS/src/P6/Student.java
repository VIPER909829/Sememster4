package q6;

public class Student {
    String studentId;
    String studentName;
    College college;

    public Student(String studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled in College: " + college.getCollegeName());
        System.out.println("College Location: " + college.getCollegeLoc());
    }
}
