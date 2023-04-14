package UC1;



import controller.auth.LoginView;

import model.user.Credentials;
import model.user.Student;
import model.user.User;
import org.junit.Before;
import org.junit.Test;
import services.UserService;

import javax.swing.*;

import static org.junit.Assert.*;

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
        
        loginView.emailTf = new JTextField();
        loginView.passTf = new JPasswordField();
        String email = "test@example.com";
        String password = "Test@1234";

        UserService userService = new UserService();
        loginView.emailTf.setText(email);
        loginView.passTf.setText(password);
        loginView.loginBtnActionPerformed(null);

        assertTrue(loginView.getViewOpened());
    }
    

}
