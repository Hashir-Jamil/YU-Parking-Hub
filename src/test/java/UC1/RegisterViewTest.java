package UC1;

import controller.auth.RegisterView;
import model.user.Credentials;
import model.user.Student;
import model.user.User;
import org.junit.Before;
import org.junit.Test;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import static org.junit.Assert.assertTrue;

public class RegisterViewTest {

    private RegisterView registerView;
    private User user;

    private Credentials credentials;
    ActionEvent event;
    MouseEvent mouseEvent;

    @Before
    public void setUp() {
        credentials = new Credentials("login", "password", "Student");
        user = new Student(credentials);
        event = null;
        mouseEvent = null;
    }

    @Test
    public void registrationViewTest() {
        registerView.loginBtnMouseClicked(mouseEvent);
        registerView.registerBtnActionPerformed(event);
        registerView = new RegisterView();
        assertTrue(registerView.getViewOpened());
    }
}