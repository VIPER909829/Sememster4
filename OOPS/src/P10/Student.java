package q10;
public class Student{
    private String studentName;
    private String studentId;
    public void setName(String studentName) {
        this.studentName=studentName;
    }
    public void setID(String studentId) {
        this.studentId=studentId;
    }
    public String getName(){
        return studentName;
    }
    public String getStudentId(){
        return studentId;
    }
    public String toString(){
        return studentName+" ("+studentId+")";
    }
}