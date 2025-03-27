package q10;

public class MainEnroll {
    public static void main(String args[]) {
        Student s1=new Student();
        s1.setName("Rohan");
        s1.setID("0123");
        Student s2=new Student();
        s2.setName("Leo");
        s2.setID("1230");
        Student s3=new Student();
        s3.setName("Harry");
        s3.setID("012");
        Student s4=new Student();
        s4.setName("Sony");
        s4.setID("012345");
        Course c1=new Course(4);
        c1.setCourseName("Science");
        c1.setCourseCode("SC001");
        Course c2=new Course(2);
        c2.setCourseName("Commerce");
        c2.setCourseCode("COM001");
        Course c3=new Course(2);
        c3.setCourseName("Arts");
        c3.setCourseCode("HSC001");
        Enrollment enr=new Enrollment();
        enr.enrollStudent(s1, c1);
        enr.enrollStudent(s1, c3);
        enr.enrollStudent(s4, c1);
        enr.enrollStudent(s4, c2);
        enr.enrollStudent(s2, c3);
        enr.enrollStudent(s2, c1);
        enr.enrollStudent(s3, c2);
        enr.enrollStudent(s3, c1);
        enr.displayEnrollmentDetails(c1);
        enr.displayEnrollmentDetails(c2);
        enr.displayEnrollmentDetails(c3);
        enr.dropStudent(s1, c3);
        enr.displayEnrollmentDetails(c3);
    }
}
