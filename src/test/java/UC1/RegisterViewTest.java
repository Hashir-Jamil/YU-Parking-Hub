package UC1;

import controller.auth.LoginView;

import controller.auth.RegisterView;
import model.user.Credentials;
import model.user.Student;
import model.user.User;
import model.user.UserFactory;
import org.junit.Before;
import org.junit.Test;
import services.UserService;

import javax.swing.*;

import java.awt.event.ActionEvent;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class RegisterViewTest {

    private javax.swing.JTextField emailTf;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JPasswordField passTf;
    private javax.swing.JButton registerBtn;
    private javax.swing.JComboBox<String> typeTf;

    private RegisterView registerView;
    private User user;
    private LoginView loginView;

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
    @Test
    public void testRegisterBtnActionPerformed() {

        emailTf = new JTextField();
        passTf = new JPasswordField();
        typeTf = new JComboBox<>(new String[]{"user", "admin"});
        error = new JLabel();
        registerBtn = new JButton();
        emailTf.setText("login");
        passTf.setText("password");
        typeTf.setSelectedItem("user");
        user = UserFactory.createAccount(credentials);
        String result = UserService.getInstance().registerUser(user);
        registerView = new RegisterView();
        registerView.registerBtnActionPerformed(new ActionEvent(registerBtn, ActionEvent.ACTION_PERFORMED, null));

        if (result.equals("success")) {
            JOptionPane.showMessageDialog(null, "You are Registered Successfully!!");
        } else {
            error.setText(result);
        }

        assertEquals("Your Email is not valid", error.getText());
    }

    @Test
    public void testloginBtnMouseClicked(){
        loginView = new LoginView();
        assertFalse(loginView.isVisible());

        registerView = new RegisterView();
        registerView.loginBtnMouseClicked(null);

        assertFalse(registerView.isVisible());
    }
    
}