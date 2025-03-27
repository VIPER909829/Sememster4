package q10;

public class Enrollment implements EnrollmentSystem{
    public void enrollStudent(Student student, Course course)
    {
        if(course.addStudent(student)) {
            System.out.println(student.getName()+" has been added to "+course.getCourseName()+" "+course.getCourseCode());
        }
        else {
            System.out.println("Enrollment failed: "+course.getCourseName()+" "+course.getCourseCode()+" is full.");
        }
    }
    public void dropStudent(Student student, Course course) {
        if(course.removeStudent(student)) {
            System.out.println(student.getName()+" has been removed from "+course.getCourseName()+" "+course.getCourseCode());
        }
        else {
            System.out.println(course.getCourseName() + " does not exist in the system.");
        }
    }
    public void displayEnrollmentDetails(Course course) {
        System.out.println("Enrollment Details of "+course+" : ");
        for (int i = 0; i < course.getStudentCount(); i++) {
            Student student=course.getEnrolledStudents()[i];
            if(student!=null) {
                System.out.println(" - "+student.getName()+" (ID: "+student.getStudentId()+")");
            }
        }
    }
}
