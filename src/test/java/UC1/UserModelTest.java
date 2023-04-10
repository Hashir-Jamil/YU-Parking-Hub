package UC1;
import org.junit.Test;

import model.user.Credentials;
import model.user.FacultyMember;
import model.user.Student;
import model.user.SuperManager;
import model.user.User;

import static org.junit.Assert.*;

public class UserModelTest {
	@Test
    public void testUserMethods() {
        String email = "test@example.com";
        String password = "password";
        String type = "visitor";

        User user = new User(email, password, type);
        
        Credentials credentials1 = new Credentials("test@example.com", "password", "visitor");
        Credentials credentials2 = new Credentials("test@example.com", "password", "visitor");
        Credentials credentials3 = new Credentials("test@example.com", "password", "manager");

        User user1 = new User(credentials1);
        User user2 = new User(credentials2);
        User user3 = new User(credentials3);

        
        Credentials credentials = new Credentials("test@example.com", "password", "student");
        String studentId = "123456";

        Student student = new Student(credentials, studentId);
        
        SuperManager superManager1 = SuperManager.getInstance();
        SuperManager superManager2 = SuperManager.getInstance();

        
        assertNotNull(superManager1);
        assertNotNull(superManager2);
        assertEquals(superManager1, superManager2);
        assertEquals("Admin", superManager1.getCredentials().getLogin());
        assertEquals("Admin", superManager1.getCredentials().getPassword());
        assertEquals("SuperManager", superManager1.getCredentials().getType());

        assertEquals(credentials, student.getCredentials());
        assertEquals(studentId, student.getStudentId());
        
        assertTrue(user1.equals(user2));
        assertFalse(user1.equals(user3));
        
        Credentials credentials11 = new Credentials("Login", "Password", "Type");
        FacultyMember facultyMember = new FacultyMember(credentials11);
        assertNull(facultyMember.getFacultyName());

        FacultyMember facultyMember1 = new FacultyMember(credentials11, "Test Faculty", "12345");
        assertEquals("Test Faculty", facultyMember1.getFacultyName());
        assertEquals("12345", facultyMember1.getFacultyId());

        facultyMember1.setFacultyName("User Faculty");
        facultyMember1.setFacultyId("56789");
        assertEquals("User Faculty", facultyMember1.getFacultyName());
        assertEquals("56789", facultyMember1.getFacultyId());
        assertEquals(email, user.getCredentials().getLogin());
        assertEquals(password, user.getCredentials().getPassword());
        assertEquals(type, user.getCredentials().getType());
        assertFalse(user.getValidationStatus());
    }
}
