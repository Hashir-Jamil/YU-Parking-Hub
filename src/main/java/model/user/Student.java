package model.user;

public class Student extends Client {

    private String studentId;


    public Student(Credentials credentials, String studentId) {
        super(credentials);
        this.studentId = studentId;
    }

    public Student(Credentials credentials) {
        super(credentials);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
