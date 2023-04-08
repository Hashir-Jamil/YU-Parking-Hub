package UC1;

import controller.auth.RegisterView;
import model.user.Credentials;
import model.user.Student;
import model.user.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RegisterViewTest {

    private RegisterView registerView;
    private User user;

    private Credentials credentials;

    @Before
    public void setUp() {
        credentials = new Credentials("login", "password", "Student");
        user = new Student(credentials);
    }

    @Test
    public void registrationViewTest() {
        registerView = new RegisterView();
        assertTrue(registerView.getViewOpened());
    }
}