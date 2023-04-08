package UC1;


import controller.auth.LoginView;
import model.user.Credentials;
import model.user.Student;
import model.user.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LoginViewTest {

    private LoginView loginView;
    private User user;

    private Credentials credentials;

    @Before
    public void setUp() {
        credentials = new Credentials("login","password","Student");
        user = new Student(credentials);
    }

    @Test
    public void loginViewTest() {
        loginView = new LoginView();
        assertTrue(loginView.getViewOpened());
    }

}
