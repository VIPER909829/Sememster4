package q10;
public class Course {
    private String courseName;
    private String courseCode;
    private Student[] enrolledStudents;
    private int studentCount;
    public Course (int cap) {
        this.enrolledStudents = new Student[cap];
        this.studentCount = 0;
    }
    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode=courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public Student[] getEnrolledStudents() {
        return enrolledStudents;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public boolean addStudent(Student student) {
        if (studentCount < enrolledStudents.length) {
            enrolledStudents[studentCount] = student;
            studentCount++;
            return true;
        }
        return false;
    }
    public boolean removeStudent(Student student) {
        for (int i = 0; i < studentCount; i++) {
            if (enrolledStudents[i] == student) {
                for (int j = i; j < studentCount - 1; j++){
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[studentCount - 1] = null;
                studentCount--;
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return courseName+" (" + courseCode + ")";
    }
}
