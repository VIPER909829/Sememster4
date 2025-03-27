package q6;
public class MainApp {
    public static void main(String[] args) {
        College c1 = new College("SOA", "Bhubaneswar");
        College c2 = new College("Ravenshaw", "Cuttack");
        Student student1 = new Student("6969", "Jack Sparrow", c1);
        Student student2 = new Student("6090", "Robert D Jr", c2);
        System.out.println("Student 1 Information:");
        student1.displayStudentInfo();
        System.out.println("\nStudent 2 Information:");
        student2.displayStudentInfo();
    }
}