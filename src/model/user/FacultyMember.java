package model.user;

public class FacultyMember extends Client {

    private String facultyName;
    private String facultyId;

    public FacultyMember(Credentials credentials, String facultyName, String facultyId) {
        super(credentials);
        this.facultyName = facultyName;
        this.facultyId = facultyId;
    }

    public FacultyMember(Credentials credentials) {
        super(credentials);
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }
}
