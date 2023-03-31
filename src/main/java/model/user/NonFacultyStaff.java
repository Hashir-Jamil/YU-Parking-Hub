package model.user;

public class NonFacultyStaff extends Client {

    private String role;

    public NonFacultyStaff(Credentials credentials, String role) {
        super(credentials);
        this.role = role;
    }

    public NonFacultyStaff(Credentials credentials) {
        super(credentials);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
